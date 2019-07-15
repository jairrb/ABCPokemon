package br.com.digitalhouse.abcpokemon.core;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.login.LoginActivity;

public class CadastroActivity extends AppCompatActivity {
    TextInputLayout textInputLayoutEmail;
    TextInputLayout textInputLayoutUser;
    TextInputLayout textInputLayoutPassword;
    SharedPreferences preferences;
    Button btnRegister;
    Button btnFacebook;


    public CadastroActivity() {
        this.preferences = preferences;
    }

    public SharedPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(SharedPreferences preferences) {
        this.preferences = preferences;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.blue_facebook));

        initViews();

         preferences = getSharedPreferences("APP_REGISTER", MODE_PRIVATE);

        findViewById(R.id.touch).setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
                return true;
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateAndGo(preferences);

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

    //validação do cadastro
    private void validateAndGo(SharedPreferences preferences) {
        String email = textInputLayoutEmail.getEditText().getText().toString();
        String user = textInputLayoutUser.getEditText().getText().toString();
        String password = textInputLayoutPassword.getEditText().getText().toString();


        if (email.isEmpty()) {
            textInputLayoutEmail.setError(getString(R.string.not_email));
            return;
        }else if (!validateEmailFormat(email)){
            textInputLayoutEmail.setError(getString(R.string.invalid_mail));
            return;
        }else {
            textInputLayoutEmail.setError(null);
        }

        if (user.isEmpty()) {
            textInputLayoutUser.setError(getString(R.string.not_user));
            return;
        }else {
            textInputLayoutUser.setError(null);
        }

        if (password.isEmpty()) {
            textInputLayoutPassword.setError(getString(R.string.not_password));
            return;
        }else {
            textInputLayoutPassword.setError(null);
        }

        Intent intent = new Intent(CadastroActivity.this, LoginActivity.class);

        preferences.edit().putString("EMAIL",email).commit();
        preferences.edit().putString("USER",user).commit();
        preferences.edit().putString("PASSWORD",encrypt(password)).commit();
        startActivity(intent);
        finish();
    }

    //inicialização das views
    private void initViews() {
        textInputLayoutEmail = findViewById(R.id.textInputLayoutEmail);
        textInputLayoutUser = findViewById(R.id.textInputLayoutUser);
        textInputLayoutPassword = findViewById(R.id.textInputLayoutPassword);

        btnRegister = findViewById(R.id.btnRegister);
        btnFacebook = findViewById(R.id.btnFacebook);
    }

    //validacao formato e-mail
    private boolean validateEmailFormat(final String email) {
        if (android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            return true;
        }
        return false;
    }

    //criptografia para senha
    public String encrypt(String input) {
        return Base64.encodeToString(input.getBytes(), Base64.DEFAULT);
    }
}