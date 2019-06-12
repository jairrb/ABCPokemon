package br.com.digitalhouse.abcpokemon.menu_perfil;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments.EditarPerfilFragment;

public class MenuPerfilActivity extends AppCompatActivity {

    private TextView btnEditProfile;
    private TextView btnSocialMedia;
    private TextView btnAboutUs;
    private TextView btnExitMP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_perfil);

        initViews();

        btnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(new EditarPerfilFragment());

            }
        });
    }


       /* btnSocialMedia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // addFragment(new SocialMediaFragment);

            }
        });

      btnAboutUs.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

             //addFragment(new AboutUsFragment);

          }
      });

      btnExitMP.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

           // startActivity(new Intent(MenuPerfilActivity.this, Verificar.class));


          }
      });*/


    public void replaceFragment(Fragment fragmento) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.conteudo, fragmento, "TrocarFragmentoMP").commit();

    }

    private void initViews () {

        btnEditProfile = findViewById(R.id.editProfileMP);
        btnSocialMedia = findViewById (R.id.socialMediaMP);
        btnAboutUs = findViewById (R.id.aboutUsMP);
        btnExitMP = findViewById (R.id.exitMP);
    }
}