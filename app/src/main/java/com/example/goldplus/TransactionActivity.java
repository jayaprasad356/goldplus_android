package com.example.goldplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TransactionActivity extends AppCompatActivity {


    LinearLayout llDailyTransaction,llSuspenceaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);


        llDailyTransaction = findViewById(R.id.llDailyTransaction);
        llSuspenceaccount = findViewById(R.id.llSuspenceaccount);


        llDailyTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionActivity.this,DailytransactionActivity.class);
                startActivity(intent);
            }
        });
        llSuspenceaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TransactionActivity.this,SuspenseActivity.class);
                startActivity(intent);
            }
        });

    }
}