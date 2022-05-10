package com.example.a3lafan.logout;


import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.a3lafan.Home.MainActivity;
import com.example.a3lafan.R;
import com.example.a3lafan.login.loginActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class logoutFragment extends AppCompatDialogFragment implements View.OnClickListener {
    View view;
    Button myes,mno;

    public logoutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_logout, container, false);
        myes=view.findViewById(R.id.log_out);
        mno=view.findViewById(R.id.cancel);
        myes.setOnClickListener(this);
        mno.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.log_out:
                Intent i=new Intent(getContext(), loginActivity.class);
                startActivity(i);
                break;
            case R.id.cancel:
                Intent j=new Intent(getContext(), MainActivity.class);
                startActivity(j);
                break;
        }
    }
}
