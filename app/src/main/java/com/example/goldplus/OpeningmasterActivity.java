package com.example.goldplus;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class OpeningmasterActivity extends AppCompatActivity {

    FloatingActionButton floatbtn;
    Activity activity;

    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_openingmaster);
        activity = OpeningmasterActivity.this;


        btnBack = findViewById(R.id.btnBack);
        floatbtn = findViewById(R.id.floatbtn);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        floatbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showbottomsheet();
            }
        });

    }


    private void showbottomsheet() {


        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(activity);
        bottomSheetDialog.setContentView(R.layout.bottomsheet_openingmaster);


        bottomSheetDialog.show();

    }
}