package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void abrirMap(View v){
        Intent i = new Intent(SettingsActivity.this, MapsActivity.class);
        startActivity(i);
    }

    public void goProfile(View v) {
        Intent i = new Intent(SettingsActivity.this, ActivityUsuario.class);
        startActivity(i);
    }

    public void anadirRapido(View v){
        Intent i = new Intent(SettingsActivity.this, ActivityAnadirEvento.class);
        startActivity(i);
    }

    public void aceptar(View v){
        finish();
    }

    public void goMain(View v){
        Intent i = new Intent(SettingsActivity.this, MainActivity.class);
        startActivity(i);
    }
}
