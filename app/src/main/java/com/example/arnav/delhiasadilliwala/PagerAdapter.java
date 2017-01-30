package com.example.arnav.delhiasadilliwala;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Arnav on 11-01-2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Public Places", "Historic Sites", "Shopping", "Food" };
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new architectureFragment();
        } else if (position == 1) {
            return new historicFragment();
        } else if (position == 2) {
            return new shoppingFragment();
        } else {
            return new foodFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
