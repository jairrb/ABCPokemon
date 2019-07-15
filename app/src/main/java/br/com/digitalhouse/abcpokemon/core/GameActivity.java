package br.com.digitalhouse.abcpokemon.core;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import br.com.digitalhouse.abcpokemon.interfaces.IntegrationFragment;
import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.ui.fragments.StartFragment;

public class GameActivity extends AppCompatActivity  implements IntegrationFragment {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        replaceFragment(new StartFragment());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_exit) {

            NavUtils.navigateUpFromSameTask(this);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void replaceFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.transaction_fragment_enter,R.anim.transaction_fragment_exit,
                        R.anim.transaction_fragment_popenter,R.anim.transaction_fragment_pop_exit)
                .replace(R.id.container, fragment)
                .commit();
    }

    private void replaceFragmentStack(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.transaction_fragment_enter,R.anim.transaction_fragment_exit,
                        R.anim.transaction_fragment_popenter,R.anim.transaction_fragment_pop_exit)
                .replace(R.id.container, fragment)
                .addToBackStack("FRAGMENTS")
                .commit();
    }

    @Override
    public void integration(Fragment fragment) {
        replaceFragment(fragment);
    }

    public void integrationStack(Fragment fragment) {
        replaceFragmentStack(fragment);
    }
}