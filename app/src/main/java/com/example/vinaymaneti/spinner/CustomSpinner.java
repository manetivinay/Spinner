package com.example.vinaymaneti.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import com.example.vinaymaneti.spinner.Adapter.CustomAdapter;

public class CustomSpinner extends AppCompatActivity {

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_spinner);

        spinner = (Spinner) findViewById(R.id.spinner);
        spinner.setPrompt("Please select your country flag");
        spinner.setAdapter(new CustomAdapter(this));
    }
}
