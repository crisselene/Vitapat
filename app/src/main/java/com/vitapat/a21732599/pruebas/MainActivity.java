package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView btnGPS;
    ImageView btnUsuario;
    ImageView btnInic;
    ImageView btnAjuste;
    ImageView btnInf;
    FloatingActionButton flotando;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGPS = findViewById(R.id.btnMapAna);
        btnUsuario = findViewById(R.id.btnUserAna);
        btnInic = findViewById(R.id.btnInicio);
        btnAjuste = findViewById(R.id.btnSettings);
        btnInf = findViewById(R.id.btnInfo);
        flotando= findViewById(R.id.flAnadir);

    }

    public void abrirMapa(View v){
        Intent i = new Intent(MainActivity.this, MapsActivity.class);
        startActivity(i);
    }

    public void goProfile(View v) {
        Intent i = new Intent(MainActivity.this, ActivityUsuario.class);
        startActivity(i);
    }

    public void anadirRapido(View v){
        Intent i = new Intent(MainActivity.this, AnadirEventoActivity.class);
        startActivity(i);
    }



}
