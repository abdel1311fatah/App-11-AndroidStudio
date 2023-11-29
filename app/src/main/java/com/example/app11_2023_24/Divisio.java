package com.example.app11_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Divisio extends AppCompatActivity {

    private TextView textView;
    private EditText n1;
    private EditText n2;
    private TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divisio);
        n1 = (EditText)findViewById(R.id.n8);
        n2 = (EditText)findViewById(R.id.n7);
        resultat = (TextView) findViewById(R.id.resultat4);
        textView = (TextView) findViewById(R.id.textView4);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("div");
        textView.setText(nom);
    }
    public void tornar(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void divisio(View dibuix) {
        resultat.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        try {
            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);

            if (n2 == 0) {
                resultat.setText("No es pot dividir per 0");
            } else if (n1 < n2) {
                resultat.setText("El primer numero ha de ser mes gran que el segon");
            } else {
                long divisio = n1 / n2;
                String resultat_divisio = String.valueOf(divisio);
                resultat.setText(resultat_divisio);
            }
        } catch (NumberFormatException e) {
            resultat.setText("Ingresa numeros valids");
        }
    }
}