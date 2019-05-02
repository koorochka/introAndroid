package com.koorochka.introandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initTextView();
        setTextView("Intro to Android");


    }

    public void initTextView() {
        this.textView = findViewById(R.id.helloText);
    }

    public void setTextView(String textView) {
        this.textView.setText(textView);
    }
}
