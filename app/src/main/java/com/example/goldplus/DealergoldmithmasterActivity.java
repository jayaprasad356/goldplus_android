package com.example.goldplus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.slider.Slider;

public class DealergoldmithmasterActivity extends AppCompatActivity {

    ImageView btnBack;
    EditText etName;
    FloatingActionButton floatbtn;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dealergoldmithmaster);
        activity = DealergoldmithmasterActivity.this;


        btnBack = findViewById(R.id.btnBack);
        etName = findViewById(R.id.etName);
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
        bottomSheetDialog.setContentView(R.layout.bottomsheet_lyt);


        bottomSheetDialog.show();

    }


}