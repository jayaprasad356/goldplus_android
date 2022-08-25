package com.example.goldplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import com.example.goldplus.fragment.DashboardFragment;
import com.example.goldplus.fragment.HomeFragment;
import com.example.goldplus.fragment.ProfileFragment;
import com.example.goldplus.fragment.SettingsFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        chipNavigationBar = findViewById(R.id.chipNavigationBar);
        chipNavigationBar.setItemSelected(R.id.home_nav,
                true);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,
                        new HomeFragment()).commit();

        bottomMenu();
        
    }

    private void bottomMenu() {
        chipNavigationBar.setOnItemSelectedListener
                (new ChipNavigationBar.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(int i) {
                        Fragment fragment = null;
                        switch (i){
                            case R.id.home_nav:
                                fragment = new HomeFragment();
                                break;
                            case R.id.dashboard_nav:
                                fragment = new DashboardFragment();
                                break;

                            case R.id.profile_nav:
                                fragment = new ProfileFragment();
                                break;

                            case R.id.setting_nav:
                                fragment = new SettingsFragment();
                                break;

                        }
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.fragment_container,
                                        fragment).commit();
                    }
                });
    }
}