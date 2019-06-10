package br.com.digitalhouse.abcpokemon.login;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.menu_perfil.MenuPerfilActivity;
import br.com.digitalhouse.abcpokemon.model.Cadastro;

public class LoginActivity extends AppCompatActivity {
    TextInputLayout textInputLayoutUser;
    TextInputLayout textInputLayoutPassword;

    private String passwordbundle;
    private String userbundle;

    Button btnLogin;
    Button btnFacebook;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_login);

         initViews();
         checkIntent();

         btnLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this, MenuPerfilActivity.class));

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

    private void validateAndGo() {
        String user = textInputLayoutUser.getEditText().getText().toString();
        String password = textInputLayoutPassword.getEditText().getText().toString();

        if (user.isEmpty()) {
            textInputLayoutUser.setError(getString(R.string.not_user));
            return;
        }else if (userbundle != null && !user.equals(userbundle)){
            textInputLayoutUser.setError(getString(R.string.invalid_user));
            return;
        }else {
            textInputLayoutUser.setError(null);
        }

        if (password.isEmpty()) {
            textInputLayoutPassword.setError(getString(R.string.not_password));
            return;
        }else if (passwordbundle != null && !password.equals(passwordbundle)){
            textInputLayoutPassword.setError(getString(R.string.invalid_password));
            return;
        }else {
            textInputLayoutPassword.setError(null);
        }

        Snackbar.make(btnLogin, R.string.successful_login, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    private void checkIntent() {
        if (getIntent() != null && getIntent().getExtras() != null) {
            Bundle bundle = getIntent().getExtras();
            Cadastro cadastro = bundle.getParcelable("REGISTER");

            if (cadastro != null) {
                passwordbundle = cadastro.getPassword();
                userbundle  = cadastro.getUser();
                textInputLayoutUser.getEditText().setText(userbundle);
            }
        }
    }

    private void initViews() {
        textInputLayoutUser = findViewById(R.id.textInputLayoutUser);
        textInputLayoutPassword = findViewById(R.id.textInputLayoutPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnFacebook = findViewById(R.id.btnFacebook);
    }
}