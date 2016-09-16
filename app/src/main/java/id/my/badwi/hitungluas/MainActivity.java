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

        if(getSupportActionBar() != null)
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
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://badwi.my.id"));
                startActivity(intent);
            }
        });

    }
}
