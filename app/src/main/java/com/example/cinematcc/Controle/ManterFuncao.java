package com.example.cinematcc.Controle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.LinearSystem;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.cinematcc.R;

public class ManterFuncao extends AppCompatActivity {



    TextView aliasId;
    EditText aliasTipoFunc;
    ListView aliasListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manter_funcao);

        aliasId = findViewById(R.id.textIdFunc);
        aliasTipoFunc = findViewById(R.id.editTipoFunc);
        //aliasListView = findViewById(R.id.listViewFunc);

    }
}
