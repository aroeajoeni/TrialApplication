package com.example.aroe.trialapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String tag = "answer";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView welcomeText = (TextView) findViewById(R.id.welcomeText);
        int num1=9;
        int num2=4;
        int sum=num1+num2;
        Log.d(tag,Integer.toString(sum));
        welcomeText.setText(Integer.toString(sum));
    }
}
