package com.example.a3lafan.Home;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3lafan.Home.fragmntTabs.Coffe.coffeFragment;

import com.example.a3lafan.Home.fragmntTabs.rest.restuarntFragment;
import com.example.a3lafan.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class mainFragment extends Fragment {
    View view;
    ViewPager mviewPager;
    TabLayout mtap;
    view_pager_adapter mview_pager_adapter;

    public mainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_main, container, false);
        mtap=view.findViewById(R.id.tab);
        mviewPager=view.findViewById(R.id.viewpager);
        mview_pager_adapter=new view_pager_adapter(getChildFragmentManager());
        mview_pager_adapter.addfragment(new restuarntFragment(),"Restaurant");
        mview_pager_adapter.addfragment(new coffeFragment(),"coffee");
        mviewPager.setAdapter(mview_pager_adapter);
        mtap.setupWithViewPager(mviewPager);
        return view;
    }

}
