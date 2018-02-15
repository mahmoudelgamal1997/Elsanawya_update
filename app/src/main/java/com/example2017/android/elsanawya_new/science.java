package com.example2017.android.elsanawya_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class science extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

    //    MobileAds.initialize(getApplicationContext(), "ca-app-pub-7819737441034557/6369801621");

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
    public void buphy(View view ){
        Intent intent = new Intent(this,firstphy.class);
        startActivity(intent);
    }
    public void bueng(View view ){
        Intent intent = new Intent(this,firstarabic.class);
        startActivity(intent);
    }

    public void buchem(View view ){
        Intent intent = new Intent(this,chemist.class);
        startActivity(intent);
    }
    public void bubio(View view ){
        Intent intent = new Intent(this,biology.class);
        startActivity(intent);
    }
    public void bigelo(View view ){
        Intent intent = new Intent(this,geology.class);
        startActivity(intent);
    }


}
