package com.example.cinematcc.Controle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cinematcc.R;

public class ManterGenero extends AppCompatActivity {



    TextView aliasidGenero;
    EditText aliastipodeGenero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manter_genero);

        aliasidGenero = findViewById(R.id.textId);
        aliastipodeGenero = findViewById(R.id.editGenero);

    }
}
