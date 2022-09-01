package com.example.goldplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MasterActivity extends AppCompatActivity {

    LinearLayout llDealergoldmithmaster,llOpeningmaster;
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);



        llDealergoldmithmaster = findViewById(R.id.llDealergoldmithmaster);
        llOpeningmaster = findViewById(R.id.llOpeningmaster);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        llDealergoldmithmaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterActivity.this,DealergoldmithmasterActivity.class);
                startActivity(intent);
            }
        });
        llOpeningmaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MasterActivity.this,OpeningmasterActivity.class);
                startActivity(intent);
            }
        });


    }
}