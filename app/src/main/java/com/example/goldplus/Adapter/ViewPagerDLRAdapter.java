package com.example.goldplus.Adapter;



import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.goldplus.fragment.SundryDebitFragment;
import com.example.goldplus.fragment.SundrycreditFragment;
import com.example.goldplus.tablayouts.CashFragment;
import com.example.goldplus.tablayouts.WeightFragment;


public class ViewPagerDLRAdapter
        extends FragmentPagerAdapter {

    public ViewPagerDLRAdapter(
            @NonNull FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        Fragment fragment = null;
        if (position == 0)
            fragment = new SundrycreditFragment();
        else if (position == 1)
            fragment = new SundryDebitFragment();


        return fragment;
    }

    @Override
    public int getCount()
    {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        String title = null;
        if (position == 0)
            title = "SUNDRY CREDITORS(1)";
        else if (position == 1)
            title = "SUNDRY DEBITORS(0)";


        return title;
    }
}