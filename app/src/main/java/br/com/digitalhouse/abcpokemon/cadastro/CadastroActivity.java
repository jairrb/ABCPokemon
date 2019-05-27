package br.com.digitalhouse.abcpokemon.cadastro;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;

public class CadastroActivity extends AppCompatActivity {
    TextInputLayout textInputLayoutEmail;
    TextInputLayout textInputLayoutUser;
    TextInputLayout textInputLayoutPassword;

    Button btnRegister;
    Button btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        initViews();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndGoToHome();

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

    private void validateAndGoToHome() {
        String email = textInputLayoutEmail.getEditText().getText().toString();
        String user = textInputLayoutUser.getEditText().getText().toString();
        String password = textInputLayoutPassword.getEditText().getText().toString();


        if (email.isEmpty()) {
            textInputLayoutEmail.setError(getString(R.string.not_email));
            return;
        }else if (!validateEmailFormat(email)){
            textInputLayoutEmail.setError(getString(R.string.invalid_mail));
            return;
        }

        if (user.isEmpty()) {
            textInputLayoutEmail.setError(getString(R.string.not_user));
            return;
        }

        if (password.isEmpty()) {
            textInputLayoutPassword.setError(getString(R.string.not_password));
            return;
        }

        Snackbar.make(textInputLayoutEmail, R.string.successful_register, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();

    }

    private void initViews() {
        textInputLayoutEmail = findViewById(R.id.textInputLayoutEmail);
        textInputLayoutUser = findViewById(R.id.textInputLayoutUser);
        textInputLayoutPassword = findViewById(R.id.textInputLayoutPassword);

        btnRegister = findViewById(R.id.btnRegister);
        btnFacebook = findViewById(R.id.btnFacebook);
    }

    private boolean validateEmailFormat(final String email) {
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true;
        }
        return false;
    }
}
