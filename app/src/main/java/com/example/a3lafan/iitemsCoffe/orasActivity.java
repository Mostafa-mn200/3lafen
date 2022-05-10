package com.example.a3lafan.iitemsCoffe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.a3lafan.R;

public class orasActivity extends AppCompatActivity {
    ViewFlipper mFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oras);
        int img []={R.drawable.oras1,R.drawable.oras2,R.drawable.oras3,R.drawable.oras4};
        mFlipper=findViewById(R.id.v_flipper);

        for (int i =0;i<img.length;i++){
            flipperImage(img[i]);
        }
    }
    private void  flipperImage(int img){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(img);

        mFlipper.addView(imageView);
        mFlipper.setFlipInterval(4000);
        mFlipper.setAutoStart(true);

        mFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        mFlipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}
