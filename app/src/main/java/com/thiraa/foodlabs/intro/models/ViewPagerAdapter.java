package com.thiraa.foodlabs.intro.models;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.thiraa.foodlabs.intro.fragment.FragmentFastShipping;
import com.thiraa.foodlabs.intro.fragment.FragmentQuickSearch;
import com.thiraa.foodlabs.intro.fragment.FragmentSearchPlace;
import com.thiraa.foodlabs.intro.fragment.FragmentVarietyFood;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] introFragments;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        introFragments = new Fragment[] {
                new FragmentFastShipping(),
                new FragmentQuickSearch(),
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


