package com.cabalabs.tabview;

import android.os.Build;
import android.support.design.widget.TabItem;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewPager;
    PageAdapter pageAdapter;
    TabItem OBS_Info;
    TabItem BS;
    TabItem L1_Data;
    TabItem DS;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(getResources().getString(R.string.app_name));
        setSupportActionBar(toolbar);

        tabLayout = findViewById(R.id.tablayout);
        OBS_Info = findViewById(R.id.OBS_Info);
        BS = findViewById(R.id.BS);
        L1_Data = findViewById(R.id.L1_Data);
        DS = findViewById(R.id.DS);
        viewPager = findViewById(R.id.viewPager);

        pageAdapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

                if (tab.getPosition() == 1) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            android.R.color.holo_orange_dark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            android.R.color.holo_orange_dark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                android.R.color.background_dark));
                    }
                } else if (tab.getPosition() == 2) {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            android.R.color.holo_blue_dark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            android.R.color.holo_blue_dark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                android.R.color.background_dark));
                    }
                }
                    else if (tab.getPosition() == 3) {
                        toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                                android.R.color.holo_red_light));
                        tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                                android.R.color.holo_red_light));
                        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                            getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                    android.R.color.background_dark));
                        }
                    }
                 else {
                    toolbar.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            android.R.color.holo_green_dark));
                    tabLayout.setBackgroundColor(ContextCompat.getColor(MainActivity.this,
                            android.R.color.holo_green_dark));
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,
                                android.R.color.background_dark));
                    }
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }
}
