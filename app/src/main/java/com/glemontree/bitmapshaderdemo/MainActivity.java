package com.glemontree.bitmapshaderdemo;

import android.graphics.BitmapShader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private BitmapShaders bitmapShaders = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bitmapShaders = new BitmapShaders(this);
        setContentView(bitmapShaders);
    }
}
