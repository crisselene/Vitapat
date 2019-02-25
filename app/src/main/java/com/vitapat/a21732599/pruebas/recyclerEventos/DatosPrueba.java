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
        lista.add(new ItemEvento(R.drawable.atardecercorto, "Cedro San Pedro",
                "Maria Josefa", R.drawable.userpicture,
                "Ha organizado un evento", "picnic en el monte",
                "ZONA VERDE", R.drawable.puntoverde));
        lista.add(new ItemEvento(R.drawable.atardecercorto, "Cedro San Pedro",
                "Pepe", R.drawable.userpicture,
                "Ha organizado un evento", "picnic en el monte",
                "ZONA VERDE", R.drawable.puntoverde));
        lista.add(new ItemEvento(R.drawable.atardecercorto, "Cedro San Pedro",
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
                "ZONA VERDE", R.drawable.puntoverde));
    }

    public ArrayList<ItemEvento> getLista() {
        return lista;
    }
}
