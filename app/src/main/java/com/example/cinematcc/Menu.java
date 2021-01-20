package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {


    ImageView aliasrolo, aliaspesquisa, aliasperfil, aliasCadeirinha;
    TextView aliasproj, aliasvagas,  aliasOscar, aliasProjeto;
    Button  aliasBotaoSair;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
        aliasrolo=findViewById(R.id.imageviewProj);
        aliaspesquisa = findViewById(R.id.ImageViewVisua);
        aliasproj = findViewById(R.id.textProj);
        aliasvagas = findViewById(R.id.textVagas);
        aliasperfil = findViewById(R.id.imageView2);
        aliasBotaoSair = findViewById(R.id.buttonSair);
        aliasOscar = findViewById(R.id.textViewPerfil);
        aliasCadeirinha = findViewById(R.id.imageCadeirinha);
        aliasProjeto = findViewById(R.id.textProjetos);

        aliasCadeirinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getBaseContext(), MeusProjetos.class);
                startActivity(i);
            }
        });

        aliasProjeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getBaseContext(), MeusProjetos.class);
                startActivity(i);
            }
        });

        aliasrolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getBaseContext(), NovoProjeto.class);
                startActivity(i);
            }
    });

        aliasproj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getBaseContext(), NovoProjeto.class);
                startActivity(i);
            }
        });
        aliasBotaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu.this, MainActivity.class);
                startActivity(i);
            }
        });


        aliasperfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu.this, Perfil.class);
                startActivity(i);
            }
        });
        aliasOscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu.this, Perfil.class);
                startActivity(i);
            }
        });

        aliaspesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu.this, MinhasVagas.class);
                startActivity(i);
            }
        });

        aliasvagas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(Menu.this, MinhasVagas.class);
                startActivity(i);
            }
        });

    }
}
