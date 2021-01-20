package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.cinematcc.Modelo.Vaga;

public class Vagas extends AppCompatActivity {
    Button botao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vagas);

        botao= findViewById(R.id.buttonInscrever2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Vagas.this, "Inscrito com sucesso", Toast.LENGTH_LONG).show();
                startActivity(new Intent(Vagas.this, Menu.class));
                finish();
            }
        });
    }
}