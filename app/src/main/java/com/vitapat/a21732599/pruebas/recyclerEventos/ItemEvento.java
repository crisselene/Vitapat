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
    String descripcion;
    String fecha;
    String hora;
    String contacto;

    //contrsuctor
    public ItemEvento(int imgLugar, String tvLugar, String tvNombreUser,
                      int fotoPerfil, String tvHaOrganizadoUnEvento, String tvDescripcion,
                      String tvEstadoLimpieza, int imgColorLimpieza, String descripcion,
                      String fecha, String hora, String contacto) {
        this.imgLugar = imgLugar;
        this.tvLugar = tvLugar;
        this.tvNombreUser = tvNombreUser;
        this.fotoPerfil = fotoPerfil;
        this.tvHaOrganizadoUnEvento = tvHaOrganizadoUnEvento;
        this.tvDescripcion = tvDescripcion;
        this.tvEstadoLimpieza = tvEstadoLimpieza;
        this.imgColorLimpieza = imgColorLimpieza;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.contacto = contacto;
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

    public void setImgLugar(int imgLugar) {
        this.imgLugar = imgLugar;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
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