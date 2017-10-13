package com.example.mohamed.testgit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = "abdou";
        int age = 21;
        String gender  = "male";
        String Job = "founder of SEBAA company";
    }
}
