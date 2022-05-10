package com.example.a3lafan.Home.fragmntTabs.rest;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.a3lafan.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class restuarntFragment extends Fragment {
    View view;
    RecyclerView recyclerView;
    ArrayList<model> mList;
    adapter madapter;

    public restuarntFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_restuarnt, container, false);
        recyclerView=view.findViewById(R.id.resturant_recc);
        mList = new ArrayList<>();

        model resturant_model9=new model(R.drawable.ab1,"Koshari Abo Tarek");
        mList.add(resturant_model9);
        model resturant_model13=new model(R.drawable.so1,"Sobhi Kaber");
        mList.add(resturant_model13);
        model resturant_model14=new model(R.drawable.pr5," Princen");
        mList.add(resturant_model14);
        model resturant_model15=new model(R.drawable.hd1,"Hadramot Anta");
        mList.add(resturant_model15);
        model resturant_model16=new model(R.drawable.hm1,"Hamza");
        mList.add(resturant_model16);

        madapter= new adapter(mList, getActivity());
        recyclerView.setAdapter(madapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

}
