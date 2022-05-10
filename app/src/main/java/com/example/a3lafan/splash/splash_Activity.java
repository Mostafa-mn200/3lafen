package com.example.a3lafan.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.a3lafan.Commen.UserData;
import com.example.a3lafan.Home.MainActivity;
import com.example.a3lafan.R;
import com.example.a3lafan.login.loginActivity;

public class splash_Activity extends AppCompatActivity {
    UserData muserData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_);
        splashTimer();
        muserData = new UserData(this);
    }
    private void splashTimer() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (muserData.isLoggedIn()) {
                    startActivity(new Intent(splash_Activity.this, MainActivity.class));
                    finish();

                } else {
                    startActivity(new Intent(splash_Activity.this, loginActivity.class));
                    finish();

                }
            }
        }, 3000);

    }
}
