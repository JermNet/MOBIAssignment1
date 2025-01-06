package com.example.assignment1m01hello;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Assignment 1 (M01 Hello)", "Hey it's Jeremy here to let you know that the code is running (1)");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.i("Assignment 1 (M01 Hello)", "Hey it's Jeremy here to let you know that the code is running (2)");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.i("Assignment 1 (M01 Hello)", "Hey it's Jeremy here to let you know that the code is running (3)");
    }
}