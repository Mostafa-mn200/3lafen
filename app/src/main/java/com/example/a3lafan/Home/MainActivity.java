package com.example.a3lafan.Home;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a3lafan.R;

import com.example.a3lafan.logout.logoutFragment;
import com.example.a3lafan.settings.SettingFragment;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mtitel;
    FloatingActionButton mfab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dis();
        loadfragment(new mainFragment(),"Home");
    }

    private void dis() {
        mtitel=findViewById(R.id.home_bar);
        mfab=findViewById(R.id.fab);
        mfab.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fab:
                SettingFragment fragment=new SettingFragment();
                fragment.show(getSupportFragmentManager(),"");
                break;
        }
    }
    private void loadfragment(Fragment fragment, String text){
        FragmentManager fragmentManager=getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.con_lay, fragment).commit();
        mtitel.setText(text);
    }

}
