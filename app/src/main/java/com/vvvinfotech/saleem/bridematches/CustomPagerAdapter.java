package com.vvvinfotech.saleem.bridematches;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CustomPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public CustomPagerAdapter(FragmentManager fm,int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new MatchesFragment();
            case 1:
                return new NewMatches();
            case 2:
                return new PremiumMembers();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return numOfTabs;
    }
}