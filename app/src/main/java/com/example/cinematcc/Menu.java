package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Menu extends AppCompatActivity {


    ImageView aliasrolo, aliaspesquisa, aliaspipoca, aliasperfil;
    TextView aliasproj, aliasvagas, aliaspopcorn, aliasOscar;
    Button  aliasBotaoSair;

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        aliasrolo=findViewById(R.id.imageviewProj);
        aliaspesquisa = findViewById(R.id.ImageViewVisua);
        aliaspipoca = findViewById(R.id.imageViewEdit);

        aliasproj = findViewById(R.id.textProj);
        aliasvagas = findViewById(R.id.textVagas);
        aliaspopcorn = findViewById(R.id.textEdit);
        aliasperfil = findViewById(R.id.imageView2);
        aliasBotaoSair = findViewById(R.id.buttonSair);
        aliasOscar = findViewById(R.id.textViewPerfil);



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
                finish();
            }
        });
        // aliaspesquisa.setOnClickListener(new View.OnClickListener() {
        //    @Override
        //      public void onClick(View v) {
        //         i = new Intent(getBaseContext(), .class);
        //       startActivity(i);
        //   }
        //  });

    }
}
