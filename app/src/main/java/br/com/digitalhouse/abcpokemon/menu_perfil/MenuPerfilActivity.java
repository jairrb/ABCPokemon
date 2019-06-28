package br.com.digitalhouse.abcpokemon.menu_perfil;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.Fragment;
import android.widget.TextView;
import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.login.OpcoesGameActivity;
import br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments.AboutUsFragment;
import br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments.EditarPerfilFragment;

public class MenuPerfilActivity extends AppCompatActivity {

    private TextView btnEditProfile;
    private TextView btnAboutUs;
    private TextView btnExitMP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_perfil);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        initViews();


        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    replaceFragment(R.id.conteudo, new EditarPerfilFragment());
            }
        });


        btnAboutUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               replaceFragment(R.id.conteudoTodo, new AboutUsFragment());

            }
        });

        btnExitMP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 startActivity(new Intent(MenuPerfilActivity.this, OpcoesGameActivity.class));


            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_exit) {

            NavUtils.navigateUpFromSameTask(this);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void replaceFragment(int position, Fragment fragmento){

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();  transaction.setCustomAnimations(R.anim.transaction_fragment_enter,R.anim.transaction_fragment_exit,
                R.anim.transaction_fragment_popenter,R.anim.transaction_fragment_pop_exit);
        transaction.replace(position, fragmento,"TrocarFragmentoMenu").commit();
        transaction.addToBackStack(null);


    }

    private void initViews () {

        btnEditProfile = findViewById(R.id.editProfileMP);
        btnAboutUs = findViewById (R.id.aboutUsMP);
        btnExitMP = findViewById (R.id.exitMP);
    }


}
