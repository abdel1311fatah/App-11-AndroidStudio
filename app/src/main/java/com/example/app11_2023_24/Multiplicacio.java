package com.example.app11_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Multiplicacio extends AppCompatActivity {

    private TextView textView;
    private EditText n1;
    private EditText n2;
    private TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplicacio);
        n1 = (EditText)findViewById(R.id.n6);
        n2 = (EditText)findViewById(R.id.n5);
        resultat = (TextView) findViewById(R.id.resultat3);
        textView = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("multi");
        textView.setText(nom);
    }
    public void multiplicar(View dibuix){

        resultat.clearComposingText();

        String valor1= n1.getText().toString();
        String valor2= n2.getText().toString();

        try {

            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);
            long multiplicacio = n1 * n2;

            String resultat_multiplicacio = String.valueOf(multiplicacio);
            resultat.setText(resultat_multiplicacio);

        } catch (NumberFormatException e) {
            resultat.setText("Ingresa numeros válids");
        }

    }
}