package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityDescEvento extends AppCompatActivity {

    String lugar;
    TextView tvLugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_evento);

        Intent i = getIntent();
        lugar = i.getStringExtra("LUGAR");
        tvLugar = findViewById(R.id.tvLugarDesc);

        tvLugar.setText(lugar);
    }

    public void abrirMapa(View v){
        Intent i = new Intent(ActivityDescEvento.this, MapsActivity.class);
        startActivity(i);
    }

    public void goProfile(View v) {
        Intent i = new Intent(ActivityDescEvento.this, ActivityUsuario.class);
        startActivity(i);
    }
}
