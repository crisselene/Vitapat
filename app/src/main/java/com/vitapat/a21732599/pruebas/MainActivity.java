package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.vitapat.a21732599.pruebas.pojo.Evento;
import com.vitapat.a21732599.pruebas.recyclerEventos.DatosPrueba;
import com.vitapat.a21732599.pruebas.recyclerEventos.EventosAdapter;
import com.vitapat.a21732599.pruebas.recyclerEventos.ItemEvento;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView btnGPS;
    ImageView btnUsuario;
    ImageView btnInic;
    ImageView btnAjuste;
    ImageView btnInf;
    String eventoTitulo;
    FloatingActionButton flotando;
    private RecyclerView miRecyclerView;
    private LinearLayoutManager miLayoutManager;
    private EventosAdapter miAdapter;
    private ArrayList<ItemEvento> datos;


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

        miRecyclerView = (RecyclerView)findViewById(R.id.rview);


        miRecyclerView.setHasFixedSize(true);

        miLayoutManager = new LinearLayoutManager(this);
        miRecyclerView.setLayoutManager(miLayoutManager);

        miAdapter = new EventosAdapter(datos);
        miAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String lugar = (String) ((EventosAdapter.MiViewHolder)miRecyclerView.getChildViewHolder(v)).getTvLugar().getText();
                String msg = "Seleccionada la opción " + miRecyclerView.indexOfChild(v) + " con el valor "
                        + lugar;
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(MainActivity.this, ActivityDescEvento.class);
                i.putExtra("LUGAR",lugar);
                startActivity(i);
            }
        });

        miRecyclerView.setAdapter(miAdapter);
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
