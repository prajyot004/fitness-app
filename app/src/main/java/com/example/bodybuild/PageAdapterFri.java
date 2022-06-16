package com.example.bodybuild;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PageAdapterFri extends FragmentPagerAdapter
{
    int tabcount;

    public PageAdapterFri(@NonNull FragmentManager fm, int behavior) {
        super(fm);
        tabcount=behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0 : return new Mondaystart();
            case 1 : return new Fri_Main();
            case 2 : return new MondayEnd();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
