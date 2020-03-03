package com.thiraa.foodlabs.intro.adapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.thiraa.foodlabs.intro.fragment.FragmentFastShipping;
import com.thiraa.foodlabs.intro.fragment.FragmentQuickSearch;
import com.thiraa.foodlabs.intro.fragment.FragmentSearchPlace;
import com.thiraa.foodlabs.intro.fragment.FragmentVarietyFood;

public class ViewPagerAdapter {
    private Fragment[] introFragments;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        introFragments = new Fragment[] {
                new FragmentFastShipping(), //0
                new FragmentQuickSearch(), //1
                new FragmentSearchPlace(),
                new FragmentVarietyFood()
        };
    }

    @Override
    public Fragment getItem(int position) {
        return introFragments[position];
    }

    @Override
    public int getCount() {
        return introFragments.length; //3 items
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title = getItem(position).getClass().getName();
        return title.subSequence(title.lastIndexOf(".") + 1, title.length());
    }
}


