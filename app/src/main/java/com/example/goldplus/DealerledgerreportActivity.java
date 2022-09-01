package com.example.goldplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.goldplus.Adapter.ViewPagerAdapter;
import com.example.goldplus.Adapter.ViewPagerDLRAdapter;
import com.google.android.material.tabs.TabLayout;

public class DealerledgerreportActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPagerDLRAdapter viewPagerDLRAdapter;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealerledgerreport);

        viewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs);

        viewPagerDLRAdapter = new ViewPagerDLRAdapter(
                getSupportFragmentManager());
        viewPager.setAdapter(viewPagerDLRAdapter);

        // It is used to join TabLayout with ViewPager.
        tabLayout.setupWithViewPager(viewPager);


    }
}