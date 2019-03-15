package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vitapat.a21732599.pruebas.recyclerEventos.EventosAdapter;

public class ActivityDescEvento extends AppCompatActivity {

    String lugar;
    String color;
    String titulo;
    String user;
    TextView tvLugar;
    TextView tvColor;
    TextView tvTitulo;
    TextView tvUser;
    TextView descri;
    TextView fecha;
    TextView hora;
    TextView contacto;
    ImageView colorImg;
    ImageView userphoto;
    ImageView lugarImg;
    private RecyclerView miRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_evento);
        tvLugar = findViewById(R.id.tvNombreLugar);
        tvColor = findViewById(R.id.tvColorzona);
        tvTitulo = findViewById(R.id.tvTitulo);
        tvUser = findViewById(R.id.tvNombreUser);
        colorImg = findViewById(R.id.imgColorZona);
        userphoto = findViewById(R.id.fotoPerfil2);
        descri = findViewById(R.id.tvDesc);
        lugarImg = findViewById(R.id.imageView3);
        hora = findViewById(R.id.tvHora);
        fecha = findViewById(R.id.tvFecha);
        contacto = findViewById(R.id.tvContacto);
        miRecyclerView = (RecyclerView)findViewById(R.id.rview);

        Typeface faceFuente=Typeface.createFromAsset(getAssets(),"Rubik-Regular.ttf");
        tvColor.setTypeface(faceFuente);
        tvLugar.setTypeface(faceFuente);
        tvTitulo.setTypeface(faceFuente);
        tvUser.setTypeface(faceFuente);
        descri.setTypeface(faceFuente);


        cargarDatos();

    }

    private void cargarDatos() {
        Intent i = getIntent();
        lugar = i.getStringExtra("LUGAR");
        color = i.getStringExtra("COLOR");
        user = i.getStringExtra("NOMBRE USER");
        titulo = i.getStringExtra("TITULO");
        tvLugar.setText(lugar);
        tvColor.setText(color);
        tvTitulo.setText(titulo);
        tvUser.setText(user);
        if(color.equals("ZONA LIMPIA")) {
            colorImg.setImageResource(R.drawable.puntoazul);
        }else if(color.equals("ZONA INTERMEDIA")){
            colorImg.setImageResource(R.drawable.naranjapunto);
        }else{
            colorImg.setImageResource(R.drawable.puntorojo);
        }

        if (user.equals("Antonio")){
            userphoto.setImageResource(R.drawable.userpicture2);
            descri.setText("Limpieza en la playa de La Concha para tirar los plásticos que no dejan disfrutar " +
                    "de la playa, a poder ser traer guantes y palos con los que poder pinchar la basura.");
            lugarImg.setImageResource(R.drawable.contaminado2);
            contacto.setText("antorachin@gmail.com");
        }else if(user.equals("Maria Antonia")){
            userphoto.setImageResource(R.drawable.userpicture);
            descri.setText("Vamos a plantar varios árboles en el cedro de " +
                    "San Pedro para reforestar la zona además de disfrutar un día maravilloso.");
            lugarImg.setImageResource(R.drawable.paisaje_limpio2);
            fecha.setText("03/10/2019");
            hora.setText("12:30");

    }else if(user.equals("Pepa")){
        userphoto.setImageResource(R.drawable.userpicture3);
        descri.setText("Tras el éxito con la limpieza de plásticos en la Playa del Arenal, queremos " +
                "organizar otra quedada para retirar las latas y residuos que aún quedan.");
        lugarImg.setImageResource(R.drawable.intermedio1);
        fecha.setText("03/08/2019");
        hora.setText("12:00");
            contacto.setText("pepa@gmail.com");
    }





    }

    public void abrirMapa(View v){
        Intent i = new Intent(ActivityDescEvento.this, MapsActivity.class);
        startActivity(i);
    }

    public void goProfile(View v) {
        Intent i = new Intent(ActivityDescEvento.this, ActivityUsuario.class);
        startActivity(i);
    }

    public void goMain(View v) {
        Intent i = new Intent(ActivityDescEvento.this, MainActivity.class);
        startActivity(i);
    }

    public void goSettings(View v){
        Intent i = new Intent(ActivityDescEvento.this, SettingsActivity.class);
        startActivity(i);
    }


}
