package com.vitapat.a21732599.pruebas.recyclerEventos;

import com.vitapat.a21732599.pruebas.R;

import java.util.ArrayList;

public class DatosPruebaUser {
    private ArrayList<ItemEvento> lista;

    public DatosPruebaUser() {
        lista = new ArrayList<ItemEvento>();
        cargarDatos();
    }

    private void cargarDatos() {
        lista.add(new ItemEvento(R.drawable.paisaje_limpio2, "Cedro San Pedro",
                "Maria Antonia", R.drawable.userpicture,
                "Ha organizado un evento", "Plantación de árboles",
                "ZONA LIMPIA",R.drawable.puntoazul, "Vamos a plantar varios árboles en el cedro de " +
                "San Pedro para reforestar la zona además de disfrutar un día maravilloso" +
                "en la naturaleza.", "10/04/2019" , "16:00" , "685 798 312"));

    }

    public ArrayList<ItemEvento> getLista() {
        return lista;
    }
}