package com.example2017.android.elsanawya_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class history extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7819737441034557/6369801621");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


    }
    public void buarab(View view ){
        Intent intent = new Intent(this,Arabic.class);
        startActivity(intent);
    }

    public void bugerman(View view ){
        Intent intent = new Intent(this,german.class);
        startActivity(intent);
    }

    public void bueng(View view ){
        Intent intent = new Intent(this,firstarabic.class);
        startActivity(intent);
    }
    public void buself(View view ){
        Intent intent = new Intent(this,Theology.class);
        startActivity(intent);
    }
    public void buhist(View view ){
        Intent intent = new Intent(this,SubHistory.class);
        startActivity(intent);
    }
    public void bugeog(View view ){
        Intent intent = new Intent(this,geography.class);
        startActivity(intent);
    }
    public void buflf(View view ){
        Intent intent = new Intent(this,flsfa.class);
        startActivity(intent);
    }








}
