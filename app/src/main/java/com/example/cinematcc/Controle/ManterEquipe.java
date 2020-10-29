package com.example.cinematcc.Controle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.example.cinematcc.Modelo.Equipe;
import com.example.cinematcc.R;

public class ManterEquipe extends AppCompatActivity {

    Equipe equipe;
    TextView aliasIdEquip;
    EditText aliasNomeEquip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manter_equipe);

        aliasIdEquip = findViewById(R.id.textId);
        aliasNomeEquip= findViewById(R.id.editNomeEquip);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menumanterprojeto, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        int id= item.getItemId();
        if(id==R.id.itemSave){
            //metodo salvar;
            salvar();
        } else if (id == R.id.itemLocate) {
            //metodolocate;
        }else if (id==R.id.itemDelete){
            //metodo delete;
            deletar();
        }
        return true;
    }
    private void salvar() {
        if (equipe.getIdEquip()==null){
            equipe =new Equipe();
        }
        equipe.setNomeEquip(aliasNomeEquip.getText().toString());

       // if (contatoBD.save(contato)!=0){
       //     Toast.makeText(ManterContato.this, "Salvo com Sucesso"+contato.toString(), Toast.LENGTH_SHORT).show();
       // }
       // else
       // {
       //     Toast.makeText(ManterContato.this, "Erro no Banco de Dados", Toast.LENGTH_SHORT).show();
       // }
    }
    private void deletar(){
        //NAOHANADAAQUI
    }
}
