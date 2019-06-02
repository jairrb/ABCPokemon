package br.com.digitalhouse.abcpokemon.splash;

import android.app.ActionBar;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.login.LoginActivity;
import br.com.digitalhouse.abcpokemon.login.OpcoesLoginActivity;

public class SplashActivity extends AppCompatActivity {
    private ImageView splashPokemon;
    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashPokemon = findViewById(R.id.splashPokemon);

        splashPokemon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jump();
            }
        });

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                jump();
            }
        }, 3000);
    }

    private void jump() {
        timer.cancel();
        Intent intent = new Intent(SplashActivity.this, OpcoesLoginActivity.class);
        startActivity(intent);
        finish();
    }

}
