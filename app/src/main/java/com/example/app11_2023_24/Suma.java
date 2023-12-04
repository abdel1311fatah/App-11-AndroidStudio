package com.example.app11_2023_24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Suma extends AppCompatActivity {

    private TextView textView;
    private EditText n1;
    private EditText n2;
    private TextView resultat;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        n1 = (EditText)findViewById(R.id.n2);
        n2 = (EditText)findViewById(R.id.n);
        resultat = (TextView) findViewById(R.id.resultat);
        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("suma");
        textView.setText(nom);
        Toolbar toolbar = findViewById(R.id.toolbar5);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }
    public void sumar(View dibuix) {
        resultat.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

        try {
            long n1 = Long.parseLong(valor1);
            long n2 = Long.parseLong(valor2);

            long suma = n1 + n2;

            String resultat_suma = String.valueOf(suma);
            resultat.setText(resultat_suma);
        } catch (NumberFormatException e) {
            resultat.setText("Ingresa numeros valids");
        }
    }
    public void tornar(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}