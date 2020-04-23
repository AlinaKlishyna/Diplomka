package com.example.user.history;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.miguelcatalan.materialsearchview.MaterialSearchView;


/**
 * A simple {@link Fragment} subclass.
 */


public class BlankFragment_2 extends Fragment {
    Button button_test_1, button_test_2, button_test_3;

    public BlankFragment_2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank_fragment_2, null);

        button_test_1 = (Button) v.findViewById(R.id.test_1);
        button_test_1.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(getActivity(), MainActivity_test_1.class);
                        startActivity(intent);

                    }
                });
        button_test_2 = (Button) v.findViewById(R.id.test_2);
        button_test_2.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(getActivity(), MainActivity_test_2.class);
                        startActivity(intent);

                    }
                });
        button_test_3 = (Button) v.findViewById(R.id.test_3);
        button_test_3.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(getActivity(), MainActivity_test_3.class);
                        startActivity(intent);

                    }
                });



        return v;
    }



}
