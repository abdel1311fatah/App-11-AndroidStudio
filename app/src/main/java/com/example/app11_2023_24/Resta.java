package com.example.app11_2023_24;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Resta extends AppCompatActivity {

    private TextView textView;
    private EditText n1;
    private EditText n2;
    private TextView resultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        n1 = (EditText)findViewById(R.id.n4);
        n2 = (EditText)findViewById(R.id.n3);
        resultat = (TextView) findViewById(R.id.resultat2);
        textView = (TextView) findViewById(R.id.textView2);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("resta");
        textView.setText(nom);
    }

    public void restar(View dibuix){

        resultat.clearComposingText();

        String valor1= n1.getText().toString();
        String valor2= n2.getText().toString();

        try {

            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);
            long resta = n1 - n2;

            String resultat_resta = String.valueOf(resta);
            resultat.setText(resultat_resta);

        } catch (NumberFormatException e) {
            resultat.setText("Ingresa numeros valids");
        }
    }
    public void tornar(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}