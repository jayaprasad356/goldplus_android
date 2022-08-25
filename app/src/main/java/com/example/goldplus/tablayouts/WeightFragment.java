package com.example.goldplus.tablayouts;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.goldplus.R;


public class WeightFragment extends Fragment {

    TextView tvNew;


    public WeightFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_weight, container, false);

        tvNew = root.findViewById(R.id.tvNew);

        tvNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Create an alert builder
                AlertDialog.Builder builder
                        = new AlertDialog.Builder(getContext());

                // set the custom layout
                final View customLayout
                        = getLayoutInflater()
                        .inflate(
                                R.layout.custom_layout,
                                null);
                builder.setView(customLayout);

                // add a button
                builder.setPositiveButton(
                                "Next",
                                new DialogInterface.OnClickListener() {

                                    @Override
                                    public void onClick(
                                            DialogInterface dialog,
                                            int which)
                                    {

                                        // send data from the
                                        // AlertDialog to the Activity
                                        EditText editText
                                                = customLayout
                                                .findViewById(
                                                        R.id.editText);

                                    }
                                });

                // create and show
                // the alert dialog
                AlertDialog dialog
                        = builder.create();
                dialog.show();

            }
        });



        return  root;
    }

    private void sendDialogDataToActivity(String toString) {


    }
}