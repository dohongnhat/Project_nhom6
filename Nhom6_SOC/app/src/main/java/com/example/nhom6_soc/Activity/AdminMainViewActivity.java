package com.example.nhom6_soc.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.nhom6_soc.Adapter.UserAdapter;
import com.example.nhom6_soc.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AdminMainViewActivity extends AppCompatActivity {
    private UserAdapter adapter;
    private ViewPager viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main_view);

        viewPager = findViewById(R.id.viewPager);
        bottomNavigationView = findViewById(R.id.bottomNavigation);
        adapter = new UserAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position){
                    case 0 :
                        bottomNavigationView.getMenu().findItem(R.id.trangchu).setChecked(true);
                        break;
                    case 1 :
                        bottomNavigationView.getMenu().findItem(R.id.dsSanpham).setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.trangchu:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.dsSanpham:
                        viewPager.setCurrentItem(1);
                        break;
                }
                return true;
            }
        });
    }
}