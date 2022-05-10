package com.example.a3lafan.Home;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;


public class view_pager_adapter extends FragmentPagerAdapter {

    ArrayList<Fragment>mfragmintlist=new ArrayList<>();
    ArrayList<String>mfragmenttitle=new ArrayList<>();
    public view_pager_adapter(@NonNull FragmentManager fm)
    {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mfragmintlist.get(position);
    }

    @Override
    public int getCount() {
        return mfragmintlist.size();
    }
    public void addfragment(Fragment fragment,String title){
        mfragmintlist.add(fragment);
        mfragmenttitle.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mfragmenttitle.get(position);
    }
}


