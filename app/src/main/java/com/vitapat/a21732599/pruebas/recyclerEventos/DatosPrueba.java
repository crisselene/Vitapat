package com.vitapat.a21732599.pruebas.recyclerEventos;

import com.vitapat.a21732599.pruebas.R;

import java.util.ArrayList;

public class DatosPrueba {
    private ArrayList<ItemEvento> lista;

    public DatosPrueba() {
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
        lista.add(new ItemEvento(R.drawable.contaminado2, "Playa de La Concha",
                "Antonio", R.drawable.userpicture2,
                "Ha organizado un evento", "Limpieza de residuos", "ZONA CONTAMINADA",
                R.drawable.puntorojo, "Limpieza en la playa de La Concha para tirar los plásticos que no dejan disfrutar" +
                        "de la playa, a poder ser traer guantes y palos con los que poder pinchar la basura.", "03/08/2019",
                "12:00", "antonio@gmail.com"));
        lista.add(new ItemEvento(R.drawable.intermedio1, "Playa Arenal",
                "Pepa", R.drawable.userpicture3,
                "Ha organizado un evento", "Limpieza de latas", "ZONA INTERMEDIA",
                R.drawable.naranjapunto, "Tras el éxito con la limpieza de plásticos en la Playa del Arenal, queremos" +
                "organizar otra quedada para retirar las latas y residuos que aún quedan.", "03/08/2019",
                "12:00", "678912445"));
        /*lista.add(new ItemEvento(R.drawable.atardecercorto, "Cedro San Pedro",
                "Paca", R.drawable.userpicture,
                "Ha organizado un evento", "picnic en el monte",
                "ZONA VERDE", R.drawable.puntoverde));
        lista.add(new ItemEvento(R.drawable.atardecercorto, "Cedro San Pedro",
                "Alba", R.drawable.userpicture,
                "Ha organizado un evento", "picnic en el monte",
                "ZONA VERDE", R.drawable.puntoverde));
        lista.add(new ItemEvento(R.drawable.atardecercorto, "Cedro San Pedro",
                "Pablo", R.drawable.userpicture,
                "Ha organizado un evento", "picnic en el monte",
                "ZONA VERDE", R.drawable.puntoverde));
        lista.add(new ItemEvento(R.drawable.atardecercorto, "Cedro San Pedro",
                "Estefania", R.drawable.userpicture,
                "Ha organizado un evento", "picnic en el monte",
                "ZONA VERDE", R.drawable.puntoverde));*/
    }

    public ArrayList<ItemEvento> getLista() {
        return lista;
    }
}