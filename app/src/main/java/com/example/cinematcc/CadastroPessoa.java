package com.example.cinematcc;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.camera2.CameraDevice;
import android.os.Bundle;
import android.telecom.CallAudioState;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class CadastroPessoa extends AppCompatActivity {

    private FirebaseAuth mAuth;
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

        mAuth = FirebaseAuth.getInstance();


        Cbotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createUser();
            }
        });


    }

    private void createUser(){
        String email = Cemail.getText().toString();
        String senha = Csenha.getText().toString();
        if(!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            if (!senha.isEmpty()){
                mAuth.createUserWithEmailAndPassword(email, senha).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Toast.makeText(CadastroPessoa.this, "Cadastrado com sucesso", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(CadastroPessoa.this, MainActivity.class));
                        finish();
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(CadastroPessoa.this, "Erro ao cadastrar", Toast.LENGTH_SHORT).show();
                    }
                });

            }else{
                Csenha.setError("Preencha os campos");
            }
        }else if (email.isEmpty()) {

            Cemail.setError("Preencha os campos");
        }else {
            Cemail.setError("Use um email válido");
        }

    }

}
