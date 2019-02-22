package com.vitapat.a21732599.pruebas.recyclerEventos;

import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class ItemEvento {
    //atributos diseño
     ImageView imgLugar;
     TextView tvLugar;
     TextView tvNombreUser;
    de.hdodenhof.circleimageview.CircleImageView fotoPerfil;
    TextView tvHaOrganizadoUnEvento;
    TextView tvDescripcion;
    TextView tvEstadoLimpieza;
    ImageView imgColorLimpieza;

    //contrsuctor
    public ItemEvento(ImageView imgLugar, TextView tvLugar, TextView tvNombreUser,
                      CircleImageView fotoPerfil, TextView tvHaOrganizadoUnEvento,
                      TextView tvDescripcion, TextView tvEstadoLimpieza,
                      ImageView imgColorLimpieza) {
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

    public ImageView getImgLugar() {
        return imgLugar;
    }

    public TextView getTvLugar() {
        return tvLugar;
    }

    public TextView getTvNombreUser() {
        return tvNombreUser;
    }

    public CircleImageView getFotoPerfil() {
        return fotoPerfil;
    }

    public TextView getTvHaOrganizadoUnEvento() {
        return tvHaOrganizadoUnEvento;
    }

    public TextView getTvDescripcion() {
        return tvDescripcion;
    }

    public TextView getTvEstadoLimpieza() {
        return tvEstadoLimpieza;
    }

    public ImageView getImgColorLimpieza() {
        return imgColorLimpieza;
    }
}
