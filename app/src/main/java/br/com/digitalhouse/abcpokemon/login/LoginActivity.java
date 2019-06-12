package br.com.digitalhouse.abcpokemon.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;

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
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.blue_facebook));

        initViews();
        preferences();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndGo();

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
        } else if (userbundle != null && !user.equals(userbundle)) {
            textInputLayoutUser.setError(getString(R.string.invalid_user));
            return;
        } else {
            textInputLayoutUser.setError(null);
        }

        if (password.isEmpty()) {
            textInputLayoutPassword.setError(getString(R.string.not_password));
            return;
        } else if (passwordbundle != null && !password.equals(passwordbundle)) {
            textInputLayoutPassword.setError(getString(R.string.invalid_password));
            return;
        } else {
            textInputLayoutPassword.setError(null);
        }

        if (userbundle == null || passwordbundle == null) {
            Snackbar.make(textInputLayoutUser, "Usuário não cadastrado :(", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
            return;
        }


        Intent intent = new Intent(LoginActivity.this, OpcoesGameActivity.class);
        startActivity(intent);
    }

    private void preferences() {
        final SharedPreferences preferences = getSharedPreferences("APP_REGISTER", MODE_PRIVATE);

        passwordbundle = decrypt(preferences.getString("PASSWORD", ""));
        userbundle = preferences.getString("USER", "");

        textInputLayoutUser.getEditText().setText(preferences.getString("USER", ""));

    }

    public String decrypt(String input) {
        return new String(Base64.decode(input, Base64.DEFAULT));
    }


    private void initViews() {
        textInputLayoutUser = findViewById(R.id.textInputLayoutUser);
        textInputLayoutPassword = findViewById(R.id.textInputLayoutPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnFacebook = findViewById(R.id.btnFacebook);
    }
}