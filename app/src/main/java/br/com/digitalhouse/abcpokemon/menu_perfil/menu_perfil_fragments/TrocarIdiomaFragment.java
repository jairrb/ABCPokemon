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
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TrocarIdiomaFragment extends Fragment {

    private Button btnConfirmarIdioma;



    public TrocarIdiomaFragment() {
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup conteudo, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_trocar_idioma, conteudo, false);

        btnConfirmarIdioma = view.findViewById(R.id.confirmarNovoIdioma);

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
        transaction.add(conteudo, fragmento, "TrocarFragmento").commit();

    }

}
