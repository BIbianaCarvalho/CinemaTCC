package com.example.cinematcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.SigningInfo;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.cinematcc.R;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    private FirebaseAuth mAuth;
    TextView aliasCadastro;
    EditText aliasemail, aliassenha;
    Button aliasBotao;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();
        aliasBotao = findViewById(R.id.idBotao);
        aliasemail = findViewById(R.id.editEmail);
        aliassenha = findViewById(R.id.editSenha);
        aliasCadastro = findViewById(R.id.textCadastro);

        aliasCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                i = new Intent(MainActivity.this, CadastroPessoa.class);
                startActivity(i);
            }
        });



     aliasBotao.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             loginUser();
         }
     });
    }
    private void loginUser(){
        String email = aliasemail.getText().toString();
        String senha = aliassenha.getText().toString();
        if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            if (!senha.isEmpty()){
                mAuth.signInWithEmailAndPassword(email, senha).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                    public void onSuccess(AuthResult authResult) {
                        startActivity(new Intent(MainActivity.this, Menu.class));
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(MainActivity.this, "Falha ao logar", Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }
    }
}




