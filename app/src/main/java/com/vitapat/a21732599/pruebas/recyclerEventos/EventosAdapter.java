package com.vitapat.a21732599.pruebas.recyclerEventos;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.vitapat.a21732599.pruebas.R;

public class EventosAdapter extends RecyclerView.Adapter {

    public static class MiViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLugar;
        TextView tvLugar;
        TextView tvNombreUser;
        de.hdodenhof.circleimageview.CircleImageView fotoPerfil;
        TextView tvHaOrganizadoUnEvento;
        TextView tvDescripcion;
        TextView tvEstadoLimpieza;
        ImageView imgColorLimpieza;


        public MiViewHolder(View itemView) {
            super(itemView);

            imgLugar = (ImageView) itemView.findViewById(R.id.)
        }
    }
