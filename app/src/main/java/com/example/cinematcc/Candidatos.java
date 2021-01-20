package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cinematcc.Modelo.Candidato;

public class Candidatos extends AppCompatActivity {

    Intent i;
    ImageView aliasImage;
    TextView aliasText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidatos);

        aliasImage = findViewById(R.id.imageCand);
        aliasText = findViewById(R.id.textCand);



        aliasImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Candidatos.this,  Perfil.class);
                startActivity(i);
            }
        });
        aliasText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Candidatos.this,  Perfil.class);
                startActivity(i);
            }
        });


    }
}