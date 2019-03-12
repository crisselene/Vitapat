package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class ActivityUsuario extends AppCompatActivity {

    Button btnPower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

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




    //TODO: COGER EL NOMBRE DE USUARIO

    public void goMain(View v) {
        Intent i = new Intent(ActivityUsuario.this, MainActivity.class);
        startActivity(i);
    }
}
