package br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import br.com.digitalhouse.abcpokemon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlterarFotoFragment extends Fragment {

    private Button btnConfirmarIcone;
    private ImageButton btnSelecionarIcone;
    private ImageButton btnSelecionarIconePhone;

    public AlterarFotoFragment() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup conteudo, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_alterar_foto, conteudo, false);


        btnConfirmarIcone = view.findViewById(R.id.confirmarNovoIcone);
        btnSelecionarIcone = view.findViewById(R.id.changeIconImageBtn);
        btnSelecionarIconePhone = view.findViewById(R.id.searchPhoneImageBtn);

        btnConfirmarIcone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                replaceFragment(R.id.fragment_afoto, new EditarPerfilFragment());

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
