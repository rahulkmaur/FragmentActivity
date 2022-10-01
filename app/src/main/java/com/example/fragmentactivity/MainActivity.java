package com.example.fragmentactivity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.example.fragmentactivity.Fragment1;
import com.example.fragmentactivity.Fragment2;
import com.example.fragmentactivity.Fragment3;

public class MainActivity extends AppCompatActivity {

    Button fragment1, fragment2, fragment3;
    FragmentManager fm;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = findViewById(R.id.Fragment1);
        fragment2 = findViewById(R.id.Fragment2);
        fragment3 = findViewById(R.id.Fragment3);

        fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFragment(new Fragment1());
            }
        });

        fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new Fragment2());
            }
        });

        fragment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                loadFragment(new Fragment3());
            }
        });
    }
    private void loadFragment(Fragment fragment) {

        fm = getFragmentManager();

        fragmentTransaction = fm.beginTransaction();

        fragmentTransaction.replace(R.id.framelayout, fragment);
        fragmentTransaction.commit();
    }
}