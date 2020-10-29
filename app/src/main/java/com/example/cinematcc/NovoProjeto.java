package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class NovoProjeto extends AppCompatActivity {



    EditText aliasNomeProjeto, aliasFuncProj, aliasNumeroVagas, aliasDataProj;
    Button aliasbotaoSalvar;
    ImageView aliasbotaoVoltar;
    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novo_projeto);
        aliasbotaoSalvar = findViewById(R.id.buttonSalvar);
        aliasbotaoVoltar = findViewById(R.id.imageViewVoltar);
        aliasNomeProjeto = findViewById(R.id.editNomeProj);
        aliasFuncProj = findViewById(R.id.editFunc);
        aliasNumeroVagas = findViewById(R.id.editVagas);
        aliasDataProj = findViewById(R.id.editTextdata);


        aliasbotaoSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(NovoProjeto.this, "Salvo", Toast.LENGTH_SHORT).show();
                finish();

            }
        });

        aliasbotaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
