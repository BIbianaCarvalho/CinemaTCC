package com.example.cinematcc.Controle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cinematcc.R;

public class ManterVaga extends AppCompatActivity {

//VAGAAAAAAAAAAAA
    TextView aliasId;
    EditText aliasDesc, aliasNume;
    ListView aliasListView;
    String aliasopcoes [] = new String[]{"Salvar", "Localizar", "Excluir"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manter_vaga);

       aliasId = findViewById(R.id.textIdFunc);
       aliasDesc = findViewById(R.id.editDesc);
       aliasNume = findViewById(R.id.editNume);
       aliasListView = findViewById(R.id.listViewProj);



    }
}
