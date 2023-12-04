package com.example.app11_2023_24;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
        n1 = (EditText) findViewById(R.id.n6);
        n2 = (EditText) findViewById(R.id.n5);
        resultat = (TextView) findViewById(R.id.resultat3);
        textView = (TextView) findViewById(R.id.textView3);

        Intent intent = getIntent();
        String nom = intent.getStringExtra("multi");
        textView.setText(nom);

        Toolbar toolbar = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar);
    }

    public boolean rerurnHome (Menu menu) {
        getMenuInflater().inflate(R.menu.overflow, menu);
        return true;
    }

    public boolean returnHome (MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.icon_home) {
            Intent intent = new Intent(this, Suma.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void multiplicar(View dibuix) {

        resultat.clearComposingText();

        String valor1 = n1.getText().toString();
        String valor2 = n2.getText().toString();

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