package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MeusProjetos extends AppCompatActivity {


    Intent i;

    Button botaover;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_projetos);

        botaover = findViewById(R.id.buttonVer);

        botaover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MeusProjetos.this,  Candidatos.class);
                startActivity(i);
            }
        });
    }
}