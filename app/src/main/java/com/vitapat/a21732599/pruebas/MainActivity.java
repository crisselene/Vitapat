package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.vitapat.a21732599.pruebas.recyclerEventos.DatosPrueba;
import com.vitapat.a21732599.pruebas.recyclerEventos.EventosAdapter;
import com.vitapat.a21732599.pruebas.recyclerEventos.ItemEvento;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView miRecyclerView;
    private LinearLayoutManager miLayoutManager;
    private EventosAdapter miAdapter;
    private ArrayList<ItemEvento> datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datos = (new DatosPrueba()).getLista();
        miRecyclerView = (RecyclerView)findViewById(R.id.rview);

        miRecyclerView.setHasFixedSize(true);

        miLayoutManager = new LinearLayoutManager(this);
        miRecyclerView.setLayoutManager(miLayoutManager);

        miAdapter = new EventosAdapter(datos);
        //miAdapter.setOnClickListener(new View.OnClickListener() {
           /* @Override
            public void onClick(View v) {
                String msg = "Seleccionada la opción " + miRecyclerView.indexOfChild(v) + " con el valor "
                        + ((EventosAdapter.MiViewHolder)miRecyclerView.getChildViewHolder(v)).().getText();
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }*/
        //});

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

}
