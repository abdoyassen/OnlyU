package com.example.onlyu.onlyu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private final:String TAG = "MainActivity"
    private AdView mAdView


}
