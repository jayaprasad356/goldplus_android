package com.example.goldplus.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.goldplus.MasterActivity;
import com.example.goldplus.R;
import com.example.goldplus.ReportActivity;
import com.example.goldplus.TransactionActivity;
import com.google.android.material.card.MaterialCardView;

public class HomeFragment extends Fragment {
    MaterialCardView cardMaster,cardReports,cardTransaction;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        cardMaster = root.findViewById(R.id.cardMaster);
        cardTransaction = root.findViewById(R.id.cardTranscation);
        cardReports = root.findViewById(R.id.cardReport);


        cardMaster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MasterActivity.class);
                startActivity(intent);
            }
        });
        cardTransaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), TransactionActivity.class);
                startActivity(intent);
            }
        });
        cardReports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ReportActivity.class);
                startActivity(intent);
            }
        });

        return root;
    }
}