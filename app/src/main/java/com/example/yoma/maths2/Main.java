package com.example.yoma.maths2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.yoma.maths2.Fragments.Page1;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().add(R.id.main_container, new Page1()).commit();
        }
    }
}
