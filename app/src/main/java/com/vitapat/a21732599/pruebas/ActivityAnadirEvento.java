package com.vitapat.a21732599.pruebas;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityAnadirEvento extends AppCompatActivity {

    private static final int PICK_IMAGE = 100;
    Uri imageUri;
    ImageView foto_gallery;
    ImageView azul;
    ImageView amarillo;
    ImageView rojo;
    TextView colorZona;
   /* EditText etTitulo;
    EditText etLugar;
    EditText etFecha;
    EditText etHora;
    EditText etDescrip;*/
    //FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_evento);

        foto_gallery = (ImageView)findViewById(R.id.imageCamara);
      azul = (ImageView)findViewById(R.id.imgAzul);
        rojo = (ImageView)findViewById(R.id.imgRojo);
        amarillo = (ImageView)findViewById(R.id.imgNaranja);
        colorZona = findViewById(R.id.colordeZona);

     /*   etTitulo = findViewById(R.id.etTitulo);
        etDescrip = findViewById(R.id.etDesc);
        etFecha = findViewById(R.id.etFecha);
        etHora = findViewById(R.id.etHora);
        etLugar =findViewById(R.id.etLugar);*/

    }

    public void subirImagen(View v){
        openGallery();
    }

    private void openGallery(){
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, PICK_IMAGE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri = data.getData();
            foto_gallery.setImageURI(imageUri);
        }
    }

    public void clicarAzul(View v){
        colorZona.setText("ZONA LIMPIA");
        colorZona.setTextColor(Color.BLUE);
    }

    public void clicarAmarillo(View v){
        colorZona.setText("ZONA INTERMEDIA");
        colorZona.setTextColor(Color.rgb(255,204,102));
    }

    public void clicarRojo(View v){
        colorZona.setText("ZONA CONTAMINADA");
        colorZona.setTextColor(Color.RED);
    }

    public void subirEvento(View v){
        Intent i = new Intent(ActivityAnadirEvento.this, MainActivity.class);
        startActivity(i);

    }

    public void abrirMap(View v){
            Intent i = new Intent(ActivityAnadirEvento.this, MapsActivity.class);
        startActivity(i);
    }

    public void goProfile(View v) {
        Intent i = new Intent(ActivityAnadirEvento.this, ActivityUsuario.class);
        startActivity(i);
    }

    public void goMain(View v) {
        Intent i = new Intent(ActivityAnadirEvento.this, MainActivity.class);
        startActivity(i);
    }

    public void goSettings(View v){
        Intent i = new Intent(ActivityAnadirEvento.this, SettingsActivity.class);
        startActivity(i);
    }
}