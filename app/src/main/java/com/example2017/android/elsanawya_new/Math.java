package com.example2017.android.elsanawya_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Math extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
    }

public void bufirst(View view) {
    Intent intent = new Intent(this,Sub_First_Step.class);
    startActivity(intent);
}


}
