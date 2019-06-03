package br.com.digitalhouse.abcpokemon.login;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.cadastro.CadastroActivity;

public class OpcoesLoginActivity extends AppCompatActivity {

    Button btnLogin;
    Button btnRegister;
    Button btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes_login);

        this.getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.blue_facebook));

        initViews();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcoesLoginActivity.this, LoginActivity.class);
                startActivity(intent);

            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcoesLoginActivity.this, CadastroActivity.class);
                startActivity(intent);
            }
        });

        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(btnFacebook, "Botao facebook :)", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });


    }

    private void initViews() {
        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);
        btnFacebook = findViewById(R.id.btnFacebook);
    }
}

