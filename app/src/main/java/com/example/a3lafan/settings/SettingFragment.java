package com.example.a3lafan.settings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a3lafan.R;
import com.example.a3lafan.logout.logoutFragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class SettingFragment extends BottomSheetDialogFragment implements View.OnClickListener {


    TextView share,rate,logout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_setting, container, false);
        share=view.findViewById(R.id.share);
        rate=view.findViewById(R.id.rating);
        logout=view.findViewById(R.id.logout);
        share.setOnClickListener(this);
        rate.setOnClickListener(this);
        logout.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.share:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "Share Application");
                i.putExtra(Intent.EXTRA_TEXT,
                        "https://play.google.com/store/apps/details?id=" +
                                getActivity().getApplicationContext().getPackageName());
                startActivity(Intent.createChooser(i, "مشاركة مع"));
                break;
            case R.id.rating:
                Uri uri = Uri.parse("market://details?id=" + this.getActivity().getApplicationContext().getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + this.getActivity().getApplicationContext().getPackageName())));
                }
                break;
            case R.id.logout:
                logoutFragment fragment1 = new logoutFragment();
                fragment1.show(getChildFragmentManager(), "");
                break;
        }
    }
}