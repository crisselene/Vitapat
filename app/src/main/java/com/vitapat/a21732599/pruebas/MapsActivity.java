package com.vitapat.a21732599.pruebas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vitapat.a21732599.pruebas.ui.maps.MapsFragment;

public class MapsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MapsFragment.newInstance())
                    .commitNow();
        }
    }
}
