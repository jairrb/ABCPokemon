package br.com.digitalhouse.abcpokemon.login;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.core.GameActivity;
import br.com.digitalhouse.abcpokemon.core.MenuPerfilActivity;

public class OpcoesGameActivity extends AppCompatActivity {
    Button btnFastGame;
    Button btnCampaign;
    Button btnProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes_game);
        initViews();

        final SharedPreferences preferences = getSharedPreferences("APP_OPTIONS", MODE_PRIVATE);

        btnFastGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(OpcoesGameActivity.this, GameActivity.class);
            preferences.edit().putString("TYPEGAME","1").commit();
            startActivity(intent);
            }
        });

        btnCampaign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcoesGameActivity.this, GameActivity.class);
                preferences.edit().putString("TYPEGAME","2").commit();
                startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcoesGameActivity.this, MenuPerfilActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btnFastGame = findViewById(R.id.btnFastGame);
        btnCampaign = findViewById(R.id.btnCampaign);
        btnProfile = findViewById(R.id.btnProfile);
    }

}