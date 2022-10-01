package com.example.fragmentactivity;

import android.os.Bundle;

import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Fragment3 extends Fragment {

    View view;
    Button btnthird;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_3, container, false);

        btnthird= view.findViewById(R.id.btnthird);

        btnthird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Third Fragment",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}