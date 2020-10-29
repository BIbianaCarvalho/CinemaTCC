package com.example.cinematcc.Controle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.cinematcc.Modelo.Genero;
import com.example.cinematcc.Modelo.Vaga;
import com.example.cinematcc.R;

import java.util.List;

public class ManterProjeto extends AppCompatActivity {

    TextView aliasIdProj;
    EditText aliasNomeProj, aliasDescProj, aliasNumeVaga;
    Spinner aliasspinnerVagasProj, aliasspinnerGeneroProj;
    ListView aliasListViewProj;
    List<Vaga> vagas;
    List<Genero> generos;
    Button botao ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manterprojeto);

        aliasIdProj = findViewById(R.id.textIdFunc);
        aliasNomeProj = findViewById(R.id.editNomeProj);
        aliasDescProj = findViewById(R.id.editDesc);
        aliasNumeVaga = findViewById(R.id.editNume);
        aliasListViewProj = findViewById(R.id.listViewProj);
        aliasspinnerVagasProj = findViewById(R.id.spinnerVagas);
        aliasspinnerGeneroProj = findViewById(R.id.spinnerGenero);
        botao = findViewById(R.id.buttonProj);


        ArrayAdapter adaptador =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,vagas);
        aliasspinnerVagasProj.setAdapter(adaptador);

        ArrayAdapter adaptadorgen =
                new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,generos);
        aliasspinnerGeneroProj.setAdapter(adaptadorgen);

    }
}
