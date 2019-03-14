package com.vitapat.a21732599.pruebas.recyclerEventos;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vitapat.a21732599.pruebas.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.MiViewHolder>
        implements View.OnClickListener{

    private View.OnClickListener listener;
    private ArrayList<ItemEvento> datos;

    public EventosAdapter(ArrayList<ItemEvento> datos) {
        this.datos = datos;
    }


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

            imgLugar = (ImageView) itemView.findViewById(R.id.imagePaisaje);
            tvLugar = (TextView) itemView.findViewById(R.id.tvNombrePaisaje);
            tvNombreUser = (TextView) itemView.findViewById(R.id.tvNombreUser);
            fotoPerfil = (de.hdodenhof.circleimageview.CircleImageView)
                    itemView.findViewById(R.id.fotoPerfil);
            tvHaOrganizadoUnEvento = (TextView) itemView.findViewById(R.id.tvHaSubido);
            tvDescripcion = (TextView) itemView.findViewById(R.id.tvDescripcion);
            tvEstadoLimpieza = (TextView) itemView.findViewById(R.id.tvEstado);
            imgColorLimpieza = (ImageView) itemView.findViewById(R.id.imgColor);
        }

        public void bindItemLista(ItemEvento it) {
            imgLugar.setImageResource(it.getImgLugar());
            tvLugar.setText(it.getTvLugar());
            tvNombreUser.setText(it.getTvNombreUser());
            fotoPerfil.setImageResource(it.getFotoPerfil());
            tvHaOrganizadoUnEvento.setText(it.getTvHaOrganizadoUnEvento());
            tvDescripcion.setText(it.getTvDescripcion());
            tvEstadoLimpieza.setText(it.getTvEstadoLimpieza());
            imgColorLimpieza.setImageResource(it.getImgColorLimpieza());
        }

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


    @Override
    public EventosAdapter.MiViewHolder onCreateViewHolder(
            ViewGroup parent, int i) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_evento, parent, false);
        v.setOnClickListener(this);
        MiViewHolder vh = new MiViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MiViewHolder holder, int position) {
        holder.bindItemLista(datos.get(position));
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if(listener != null)
            listener.onClick(v);
    }

}