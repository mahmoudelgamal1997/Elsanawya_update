package com.example2017.android.elsanawya_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Sub_First_Step extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub__first__step);
    }

    public void buarab(View view) {
        Intent intent = new Intent(this,Arabic.class);
        startActivity(intent);
    }

    public void bumath(View view) {
        Intent intent = new Intent(this,Math1.class);
        startActivity(intent);
    }
    public void buphy(View view) {
        Intent intent = new Intent(this,firstphy.class);
        startActivity(intent);
    }
    public void bueng(View view) {
        Intent intent = new Intent(this,firstarabic.class);
        startActivity(intent);
    }
    public void buchem(View view) {
        Intent intent = new Intent(this,chemist.class);
        startActivity(intent);
    }
    public void bugerman(View view) {
        Intent intent = new Intent(this,german.class);
        startActivity(intent);
    }



}
