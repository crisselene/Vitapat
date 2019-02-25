package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
    }

    //TODO: COGER EL NOMBRE DE USUARIO

    public void goMain(View v) {
        Intent i = new Intent(ActivityUsuario.this, MainActivity.class);
        startActivity(i);
    }
}
