package com.example.a21732599.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnGPS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGPS = findViewById(R.id.btnMap);

    }

    public void abrirMapa(View v){
        Intent i = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(i);
    }

    public void goProfile(View v) {
        Intent i = new Intent(MainActivity.this, ActivityUsuario.class);
        startActivity(i);
    }
}
