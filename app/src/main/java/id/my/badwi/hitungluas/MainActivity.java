package id.my.badwi.hitungluas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.text.TextUtils;
//import android.view.View;
import android.view.View;
import android.widget.Button;
//import android.widget.EditText;
//import android.widget.TextView;
//import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    private EditText edtPanjang, edtLebar;
//    private Button btnHitung;
//    private TextView txtLuas;
    private Button btnSub1, btnSub2, btnDial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Sample Intent");

        btnSub1 = (Button)findViewById(R.id.btn_activity_sub_1);
        btnSub2 = (Button)findViewById(R.id.btn_activity_sub_2);
        btnDial = (Button)findViewById(R.id.btn_activity_sub_3);

        btnSub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub1Activity.class);
                startActivity(intent);
            }
        });

        btnSub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Sub2Activity.class);
                intent.putExtra(Sub2Activity.KEY_DATA, "Training Aplikasi Android");
                startActivityForResult(intent, 0);
            }
        });

        btnDial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:082121212093"));
                startActivity(intent);
            }
        });
//        edtPanjang = (EditText)findViewById(R.id.edt_panjang);
//        edtLebar = (EditText)findViewById(R.id.edt_lebar);
//        btnHitung = (Button)findViewById(R.id.btn_hitung);
//        txtLuas = (TextView)findViewById(R.id.txt_luas);
//
//        btnHitung.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String panjang = edtPanjang.getText().toString().trim();
//                String lebar = edtLebar.getText().toString().trim();

//                if (edtPanjang.getText().toString().length() == 0 ||
//                        edtLebar.getText().toString().length() == 0) {
//                    Toast.makeText(, "Owowow ada yang kosong bro",
//                            Toast.LENGTH_SHORT).show();
////                    edtPanjang.setError("Jangan dikosongin bro, plis");
//                    return;
//                }
//
//                else
//
//                {
//                try {
//                    double p = Double.parseDouble(panjang);
//                    double l = Double.parseDouble(lebar);
//
//                    double luas = p * l;
//
//                    txtLuas.setText("Luas: " + luas);
//                }
//                catch (NumberFormatException e) {
//
//                    Toast.makeText(MainActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();
//                    txtLuas.setText("Luas: NOL");
//                }
//
////                }
//            }
//        });
    }
}
