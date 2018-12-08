package com.example.androidglide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = (ImageView) findViewById(R.id.img1);
        String urls = "https://cdn.saultonline.com/wp-content/uploads/2017/01/humber.jpg";

        //Glide.with(this).load(urls).into(img);

        GlideApp.with(this)
                .load(urls)
                .override(600, 500)
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.error404)
                .into(img);
    }
}

