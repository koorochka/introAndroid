package com.koorochka.introandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Inicialisation
        initTextView();
        initButton();

        // Testing
        setTextView("Intro to Android");
        button.setText("change text in create");


    }

    public void initTextView() {
        this.textView = findViewById(R.id.helloText);
    }

    public void setTextView(String textView) {
        this.textView.setText(textView);
    }

    public void initButton() {
        button = findViewById(R.id.testButton);
    }
}
