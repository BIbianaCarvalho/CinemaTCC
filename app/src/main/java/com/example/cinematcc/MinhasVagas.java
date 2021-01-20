package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cinematcc.Modelo.Vaga;

public class MinhasVagas extends AppCompatActivity {

    ImageView imageInter;
    TextView textInter;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_vagas);

        imageInter = findViewById(R.id.imageInter);
        textInter = findViewById(R.id.textInter);


        imageInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MinhasVagas.this, Vagas.class);
                startActivity(i);
            }
        });

        textInter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(MinhasVagas.this, Vagas.class);
                startActivity(i);
            }
        });

    }
}