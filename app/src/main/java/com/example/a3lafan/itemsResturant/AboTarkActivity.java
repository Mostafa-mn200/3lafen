package com.example.a3lafan.itemsResturant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.a3lafan.R;

public class AboTarkActivity extends AppCompatActivity {
    ViewFlipper mFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abo_tark);
        int img []={R.drawable.ab2,R.drawable.ab3,R.drawable.ab4};
        mFlipper=findViewById(R.id.v_flipper);

        for (int i =0;i<img.length;i++){
            flipperImage(img[i]);
        }
    }
    private void  flipperImage(int img) {
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(img);

        mFlipper.addView(imageView);
        mFlipper.setFlipInterval(4000);
        mFlipper.setAutoStart(true);

        mFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        mFlipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}