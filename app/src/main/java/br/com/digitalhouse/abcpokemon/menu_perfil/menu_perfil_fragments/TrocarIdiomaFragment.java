package br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments;


import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.Locale;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.menu_perfil.MenuPerfilActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrocarIdiomaFragment extends Fragment {

    private Button btnConfirmarIdioma;
    private Button btnIngles;
    private Button btnPortugues;


    public TrocarIdiomaFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup conteudo, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_trocar_idioma, conteudo, false);

        btnConfirmarIdioma = view.findViewById(R.id.confirmarNovoIdioma);
        btnIngles = view.findViewById(R.id.trocarParaIngles);
        btnPortugues = view.findViewById(R.id.trocarParaPortugues);

        btnPortugues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnPortugues.setBackgroundTintList(getResources().getColorStateList(R.color.light_blue_background));
                btnIngles.setBackgroundTintList(getResources().getColorStateList(R.color.edittext_dark_blue));
            }
        });

        btnIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnPortugues.setBackgroundTintList(getResources().getColorStateList(R.color.edittext_dark_blue));
                btnIngles.setBackgroundTintList(getResources().getColorStateList(R.color.light_blue_background));
            }
        });

        btnConfirmarIdioma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(R.id.fragment_tidioma, new EditarPerfilFragment());

            }
        });

        return view;
    }

    public void replaceFragment(int conteudo, Fragment fragmento) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.transaction_fragment_enter, R.anim.transaction_fragment_exit,
                R.anim.transaction_fragment_popenter, R.anim.transaction_fragment_pop_exit);
        transaction.replace(conteudo, fragmento, "TrocarFragmentoIdioma").commit();
        transaction.addToBackStack(null);

    }

}
