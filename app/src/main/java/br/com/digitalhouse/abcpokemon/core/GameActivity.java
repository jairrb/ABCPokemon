package br.com.digitalhouse.abcpokemon.core;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.digitalhouse.abcpokemon.interfaces.IntegrationFragment;
import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.fragments.StartFragment;

public class GameActivity extends AppCompatActivity  implements IntegrationFragment {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        replaceFragment(new StartFragment());
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.container, fragment)
                .commit();

    }

    @Override
    public void integration(Fragment fragment) {
        replaceFragment(fragment);
    }
}