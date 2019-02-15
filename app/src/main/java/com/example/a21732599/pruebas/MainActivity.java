package com.example.a21732599.pruebas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goProfile(View v) {
        Intent i = new Intent(MainActivity.this, ActivityUsuario.class);
        startActivity(i);
    }
}
