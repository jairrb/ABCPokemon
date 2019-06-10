package br.com.digitalhouse.abcpokemon.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.core.GameActivity;

public class OpcoesGameActivity extends AppCompatActivity {
    Button btnFastGame;
    Button btnCampaign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes_game);
        initViews();

        btnFastGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(OpcoesGameActivity.this, GameActivity.class);
            startActivity(intent);
            }
        });

        btnCampaign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OpcoesGameActivity.this, GameActivity.class);
                startActivity(intent);
            }
        });


    }
    private void initViews() {
        btnFastGame = findViewById(R.id.btnFastGame);
        btnCampaign = findViewById(R.id.btnCampaign);
    }
}