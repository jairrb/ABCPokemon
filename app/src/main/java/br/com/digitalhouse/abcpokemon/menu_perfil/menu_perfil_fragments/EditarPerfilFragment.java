package br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.digitalhouse.abcpokemon.R;


public class EditarPerfilFragment extends Fragment {

    private TextView btnChangePassword;
    private TextView btnChangeEmail;
    private TextView btnChangeIcon;
    private TextView btnChangeLanguage;
    private TextView btnExitEP;

    public EditarPerfilFragment() {
    }



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup conteudo, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_editar_perfil, conteudo, false );

        btnChangePassword = view.findViewById (R.id.changePasswordEP);
        btnChangeEmail = view.findViewById (R.id.changeEmailEP);
        btnChangeIcon = view.findViewById (R.id.changePhotoEP);
        btnChangeLanguage = view.findViewById( R.id.changeLanguageEP);



        btnChangePassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(R.id.fragment_ep,new AlterarSenhaFragment());

            }
        });

        btnChangeEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(R.id.fragment_ep,new AlterarEmailFragment());
            }
        });

        btnChangeIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(R.id.fragment_ep,new AlterarFotoFragment());


            }
        });

        btnChangeLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(R.id.fragment_ep,new TrocarIdiomaFragment());


            }
        });



    return view;
    }

  public void replaceFragment(int conteudo, Fragment fragmento) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.transaction_fragment_enter,R.anim.transaction_fragment_exit,
              R.anim.transaction_fragment_popenter,R.anim.transaction_fragment_pop_exit);
        transaction.replace(conteudo, fragmento, "TrocarFragmentoEP").commit();
      transaction.addToBackStack(null);


  }


}
