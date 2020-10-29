package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cinematcc.Controle.ManterEquipe;
import com.example.cinematcc.Controle.ManterFuncao;
import com.example.cinematcc.Controle.ManterGenero;
import com.example.cinematcc.Controle.ManterProjeto;
import com.example.cinematcc.Controle.ManterVaga;
import com.example.cinematcc.R;

public class MainActivity extends AppCompatActivity {



   TextView aliasCadastro;
   EditText aliasemail, aliassenha;
   Button aliasBotao;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aliasCadastro = findViewById(R.id.textCadastro);
        aliasCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getBaseContext(), CadastroPessoa.class);
                startActivity(i);
            }
        });

        aliasBotao = findViewById(R.id.buttonid);
        aliasBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getBaseContext(), Menu.class);
                startActivity(i);

            }
        });


    }

    public void clicar(View view){
        i = new Intent(this, CadastroPessoa.class);
        startActivity(i);
    }



}
