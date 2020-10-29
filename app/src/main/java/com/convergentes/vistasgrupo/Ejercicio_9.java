package com.convergentes.vistasgrupo;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class Ejercicio_9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio_09);
        getSupportActionBar().setTitle("Ejercicio_9");

        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        String string = String.valueOf(spinner.getSelectedItemId());
    }
}