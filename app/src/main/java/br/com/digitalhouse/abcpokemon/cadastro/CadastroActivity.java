package br.com.digitalhouse.abcpokemon.cadastro;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.digitalhouse.abcpokemon.R;

public class CadastroActivity extends AppCompatActivity {

    EditText editEmail;
    EditText editUsername;
    EditText editSenha;
    Button   btnCadastrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editEmail = findViewById(R.id.editMail);
        editUsername = findViewById(R.id.editUsername);
        editSenha = findViewById(R.id.editSenha);
        btnCadastrar = findViewById(R.id.btnCadastrar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = editEmail.getText().toString();
                String username = editUsername.getText().toString();
                String senha = editSenha.getText().toString();

                if (email.equals("")){
                    Toast.makeText(CadastroActivity.this, "Email não pode ser vazio", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (username.equals("")){
                    Toast.makeText(CadastroActivity.this, "Username não pode ser vazio", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (senha.length() < 6){
                    Toast.makeText(CadastroActivity.this, "Senha não pode ser menor que 6  caracteres", Toast.LENGTH_SHORT).show();
                    return;
                }
                Toast.makeText(CadastroActivity.this, "CADASTRADO COM SUCESSO", Toast.LENGTH_SHORT).show();
                return;
            }
        });
    }
}