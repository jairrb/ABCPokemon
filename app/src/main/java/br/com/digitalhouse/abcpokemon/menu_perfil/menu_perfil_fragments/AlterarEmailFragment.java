package br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import br.com.digitalhouse.abcpokemon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlterarEmailFragment extends Fragment {

    private Button btnConfirmarEmail;
    private EditText novoEmailET;
    private EditText confirmarNovoEmailET;


    public AlterarEmailFragment() {

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup conteudo, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_alterar_email, conteudo, false);

        btnConfirmarEmail = view.findViewById(R.id.confirmarSenha);
        novoEmailET = view.findViewById(R.id.newEmail);
        confirmarNovoEmailET = view.findViewById(R.id.confirmNewEmail);

      /*  btnConfirmarEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (novoEmailET.getText().toString().isEmpty() || confirmarNovoEmailET.getText().toString().isEmpty())
                {
                    Snackbar.make(v,"Preencha o campo e-mail!",Snackbar.LENGTH_SHORT).show();
                    if (novoEmailET.getText().toString().isEmpty())
                    {
                    novoEmailET.requestFocus();
                    }
                    if (confirmarNovoEmailET.getText().toString().isEmpty())
                    {
                        confirmarNovoEmailET.requestFocus();
                    }
                    return;
                }
                if (!novoEmailET.getText().toString().equals(confirmarNovoEmailET.getText().toString()))
                {
                    Snackbar.make(v,"E-mail não são iguais!",Snackbar.LENGTH_SHORT).show();
                    novoEmailET.requestFocus();
                    return;
                }

                replaceFragment(R.id.fragment_aemail, new EditarPerfilFragment());

            }
        });*/

        return view;
    }

    public void replaceFragment(int conteudo, Fragment fragmento) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(conteudo, fragmento, "TrocarFragmento").commit();

    }
}

