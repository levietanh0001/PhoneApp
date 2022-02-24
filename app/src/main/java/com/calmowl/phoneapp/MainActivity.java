package com.calmowl.phoneapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.appbar.MaterialToolbar;

public class MainActivity extends AppCompatActivity {
    private MaterialToolbar materialToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//         set action bar/ toolbar
        materialToolbar = findViewById(R.id.topAppBar);
        setSupportActionBar(materialToolbar);
    }
}