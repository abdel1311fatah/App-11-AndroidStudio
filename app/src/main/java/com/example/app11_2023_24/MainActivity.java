package com.example.app11_2023_24;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuacciones,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.icon_home) {
            Intent intent = new Intent(this, Suma.class);
            intent.putExtra("suma", Suma.class.getName().toString());
            startActivity(intent);
            return true;
        } else if (id == R.id.icon_resta) {
            Intent intent = new Intent(this, Resta.class);
            intent.putExtra("resta", Resta.class.getName().toString());
            startActivity(intent);
            return true;
        } else if (id == R.id.icon_multi) {
            Intent intent = new Intent(this, Multiplicacio.class);
            intent.putExtra("multi", Multiplicacio.class.getName().toString());
            startActivity(intent);
            return true;
        } else if (id == R.id.icon_div) {
            Intent intent = new Intent(this, Divisio.class);
            intent.putExtra("div", Divisio.class.getName().toString());
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void suma(View view) {
        Intent intent = new Intent(this, Suma.class);
        intent.putExtra("suma", Suma.class.getName().toString());
        startActivity(intent);
    }

    public void resta(View view) {
        Intent intent = new Intent(this, Resta.class);
        intent.putExtra("resta", Resta.class.getName().toString());
        startActivity(intent);
    }

    public void multi(View view) {
        Intent intent = new Intent(this, Multiplicacio.class);
        intent.putExtra("multi", Multiplicacio.class.getName().toString());
        startActivity(intent);
    }

    public void div(View view) {
        Intent intent = new Intent(this, Divisio.class);
        intent.putExtra("div", Divisio.class.getName().toString());
        startActivity(intent);
    }
}
