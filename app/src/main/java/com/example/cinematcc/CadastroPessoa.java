package com.example.cinematcc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CadastroPessoa extends AppCompatActivity {


    EditText Cemail;
    EditText Csenha;
    Button Cbotao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_pessoa);

        Cemail = findViewById(R.id.editCemail);
        Csenha = findViewById(R.id.editCsenha);
        Cbotao = findViewById(R.id.Cbotao);
    }
}
