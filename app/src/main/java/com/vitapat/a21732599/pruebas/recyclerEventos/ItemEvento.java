package com.vitapat.a21732599.pruebas.recyclerEventos;

import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemEvento {
    //atributos diseño
     int imgLugar;
     String tvLugar;
     String tvNombreUser;
    int fotoPerfil;
    String tvHaOrganizadoUnEvento;
    String tvDescripcion;
    String tvEstadoLimpieza;
    int imgColorLimpieza;

    //contrsuctor
    public ItemEvento(int imgLugar, String tvLugar, String tvNombreUser,
                      int fotoPerfil, String tvHaOrganizadoUnEvento,
                      String tvDescripcion, String tvEstadoLimpieza,
                      int imgColorLimpieza) {
        this.imgLugar = imgLugar;
        this.tvLugar = tvLugar;
        this.tvNombreUser = tvNombreUser;
        this.fotoPerfil = fotoPerfil;
        this.tvHaOrganizadoUnEvento = tvHaOrganizadoUnEvento;
        this.tvDescripcion = tvDescripcion;
        this.tvEstadoLimpieza = tvEstadoLimpieza;
        this.imgColorLimpieza = imgColorLimpieza;
    }

    //getters

    public int getImgLugar() {
        return imgLugar;
    }

    public String getTvLugar() {
        return tvLugar;
    }

    public String getTvNombreUser() {
        return tvNombreUser;
    }

    public int getFotoPerfil() {
        return fotoPerfil;
    }

    public String getTvHaOrganizadoUnEvento() {
        return tvHaOrganizadoUnEvento;
    }

    public String getTvDescripcion() {
        return tvDescripcion;
    }

    public String getTvEstadoLimpieza() {
        return tvEstadoLimpieza;
    }

    public int getImgColorLimpieza() {
        return imgColorLimpieza;
    }
}
