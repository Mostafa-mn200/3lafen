package com.example.a3lafan.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.a3lafan.Commen.UserData;
import com.example.a3lafan.Home.MainActivity;
import com.example.a3lafan.R;

public class loginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mname,mpass;
    Button mlogin,msignUp;
    UserData muserData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        muserData=new UserData(this);
        dis();
    }

    private void dis() {
        mname=findViewById(R.id.userName_login);
        mpass=findViewById(R.id.pass_et_login);
        mlogin=findViewById(R.id.login_btn);
        msignUp=findViewById(R.id.signup_btn_login);
        mlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.login_btn:
                if (validateParams()) {
                    muserData.createLoginSession(true, mname.getText().toString());
                    startActivity(new Intent(loginActivity.this, MainActivity.class));
                    finish();
                }
                break;
            case R.id.signup_btn_login:
                //startActivity(new Intent(loginActivity.this, MainActivity.class));
                break;
        }
    }
    boolean validateParams() {
        if (mname.getText().toString().isEmpty()) {
            Toast.makeText(loginActivity.this, "Please enter your name", Toast.LENGTH_LONG).show();
            return false;
        } else if (mpass.getText().toString().isEmpty()) {
            Toast.makeText(loginActivity.this, "Please enter your password", Toast.LENGTH_LONG).show();
            return false;
        } else if (mpass.getText().toString().length() < 4) {
            Toast.makeText(loginActivity.this, "Please enter a password equal 4 chars", Toast.LENGTH_LONG).show();
            return false;
        } else {
            return true;
        }
    }
}
