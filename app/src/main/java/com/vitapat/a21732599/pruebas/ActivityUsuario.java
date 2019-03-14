package com.vitapat.a21732599.pruebas;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

import com.vitapat.a21732599.pruebas.recyclerEventos.DatosPruebaUser;
import com.vitapat.a21732599.pruebas.recyclerEventos.EventosAdapter;
import com.vitapat.a21732599.pruebas.recyclerEventos.ItemEvento;

import java.util.ArrayList;

public class ActivityUsuario extends AppCompatActivity {

    Button btnPower;
    private RecyclerView miRecyclerView;
    private LinearLayoutManager miLayoutManager;
    private EventosAdapter miAdapter;
    private ArrayList<ItemEvento> datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        datos = (new DatosPruebaUser()).getLista();
        miRecyclerView = (RecyclerView)findViewById(R.id.rv);

        miRecyclerView.setHasFixedSize(true);

        miLayoutManager = new LinearLayoutManager(this);
        miRecyclerView.setLayoutManager(miLayoutManager);

        miAdapter = new EventosAdapter(datos);

        miRecyclerView.setAdapter(miAdapter);

        btnPower = findViewById(R.id.btnPower);

       btnPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ActivityUsuario.this,
                        R.style.MyDialogTheme);

                builder.setMessage("¿Estás seguro de que quieres cerrar sesión?");

                builder.setCancelable(false);

                builder.setPositiveButton("Sí", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent i = new Intent(ActivityUsuario.this, LoginActivity.class);
                        i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(i);
                    }

                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                AlertDialog alert = builder.create();

                alert.show();
            }
        });
    }


    public void goMain(View v){
        Intent i = new Intent(ActivityUsuario.this, MainActivity.class);
        startActivity(i);
    }

    public void goGps(View v){
        Intent i = new Intent(ActivityUsuario.this, MapsActivity.class);
        startActivity(i);
    }
}
