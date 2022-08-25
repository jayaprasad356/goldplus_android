package com.example.goldplus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ReportActivity extends AppCompatActivity {
    LinearLayout llTransactionregister,llDealerLedgerReport,llStockreport,llAreawiseledgerreport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        llTransactionregister = findViewById(R.id.llTransactionregister);
        llDealerLedgerReport = findViewById(R.id.llDealerLedgerReport);
        llStockreport = findViewById(R.id.llStockreport);
        llAreawiseledgerreport = findViewById(R.id.llAreawiseledgerreport);


        llTransactionregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReportActivity.this,TransactionregisterActivity.class);
                startActivity(intent);
            }
        });
        llDealerLedgerReport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReportActivity.this,DealerledgerreportActivity.class);
                startActivity(intent);
            }
        });
        llStockreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReportActivity.this,StockActivity.class);
                startActivity(intent);
            }
        });
        llAreawiseledgerreport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReportActivity.this,AreawiseledgerreportActivity.class);
                startActivity(intent);
            }
        });
    }
}