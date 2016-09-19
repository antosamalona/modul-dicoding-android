package id.my.badwi.hitungluas;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import id.my.badwi.hitungluas.adapter.TabFragmentPagerAdapter;


public class MainActivity extends AppCompatActivity {


    private ViewPager pager;
    private TabLayout tabs;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar)findViewById(R.id.tool_bar);

//        if(getSupportActionBar() != null) {
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            getSupportActionBar().setTitle("Material Tab");
        }
//        }

        //inisialisasi tab dan pager
        pager = (ViewPager)findViewById(R.id.pager);
        tabs = (TabLayout)findViewById(R.id.tabs);

        pager.setAdapter(new TabFragmentPagerAdapter(getSupportFragmentManager()));

        tabs.setTabTextColors(getResources().getColor(R.color.colorPrimaryDark),
                getResources().getColor(R.color.white));

        tabs.setupWithViewPager(pager);

        tabs.setTabGravity(TabLayout.GRAVITY_FILL);

    }
}
