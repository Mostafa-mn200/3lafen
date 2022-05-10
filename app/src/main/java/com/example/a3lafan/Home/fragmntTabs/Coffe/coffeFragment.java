package com.example.a3lafan.Home.fragmntTabs.Coffe;


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
public class coffeFragment extends Fragment {
    View view;
    RecyclerView recyclerView;
    ArrayList<coff_model> mList;
    adapter_coff madapter;

    public coffeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_coffe, container, false);
        recyclerView=view.findViewById(R.id.coffe_rec);
        mList = new ArrayList<>();
        coff_model model_resturant1=new coff_model(R.drawable.oras,"ORAS");
        mList.add(model_resturant1);
        coff_model model_resturant2=new coff_model(R.drawable.dis1,"The DISTRICT");
        mList.add(model_resturant2);
        coff_model model_resturant3=new coff_model(R.drawable.star1,"STARBUCKS");
        mList.add(model_resturant3);
        coff_model model_resturant4=new coff_model(R.drawable.costa1,"COSTA");
        mList.add(model_resturant4);
        coff_model model_resturant5=new coff_model(R.drawable.inch6,"EINSTEIN");
        mList.add(model_resturant5);
        coff_model model_resturant6=new coff_model(R.drawable.tola4,"قهوة طاولة");
        mList.add(model_resturant6);
        coff_model model_resturant7=new coff_model(R.drawable.groby1,"Groppi Park");
        mList.add(model_resturant7);
        coff_model model_resturant8=new coff_model(R.drawable.alf1,"قهوة الفشاوى");
        mList.add(model_resturant8);
        coff_model model_resturant9=new coff_model(R.drawable.po1,"POTTER");
        mList.add(model_resturant9);
        madapter= new adapter_coff(mList, getActivity());
        recyclerView.setAdapter(madapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity(), RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }

}
