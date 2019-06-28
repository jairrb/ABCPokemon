package br.com.digitalhouse.abcpokemon.menu_perfil.menu_perfil_fragments;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.cadastro.CadastroActivity;
import br.com.digitalhouse.abcpokemon.fragments.ShareFragment;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlterarSenhaFragment extends Fragment {

    private Button btnConfirmarSenha;
    private EditText newPasswordET;
    private EditText confirmNewPasswordET;


    public AlterarSenhaFragment() {
    }

    CadastroActivity cadastro = new CadastroActivity();



    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable final ViewGroup conteudo, @Nullable Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_alterar_senha, conteudo, false );



        btnConfirmarSenha = view.findViewById(R.id.btnConfirmarSenha);
        newPasswordET = view.findViewById(R.id.newPassword);
        confirmNewPasswordET = view.findViewById(R.id.confirmNewPassword);

        btnConfirmarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ( newPasswordET.getText().toString().isEmpty() ||
                        confirmNewPasswordET.getText().toString().isEmpty() )
                {
                    Snackbar.make(v,"Preencha o campo",Snackbar.LENGTH_SHORT).show();
                    if (newPasswordET.getText().toString().isEmpty()) {
                        newPasswordET.requestFocus();
                    }
                    if (confirmNewPasswordET.getText().toString().isEmpty()) {
                        confirmNewPasswordET.requestFocus();
                    }

                    return;
                }

                if (!newPasswordET.getText().toString().equals(confirmNewPasswordET.getText().toString()))
                {
                    Snackbar.make(v,"Senhas não são iguais!",Snackbar.LENGTH_SHORT).show();
                    newPasswordET.requestFocus();
                    return;
                }

                replaceFragment(R.id.fragment_asenha, new EditarPerfilFragment());
            }

        });

            return view;
    }

    public void replaceFragment(int conteudo, Fragment fragmento) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.setCustomAnimations(R.anim.transaction_fragment_enter,R.anim.transaction_fragment_exit,
                R.anim.transaction_fragment_popenter,R.anim.transaction_fragment_pop_exit);
        transaction.replace(conteudo, fragmento, "TrocarFragmentoAS").commit();
        transaction.addToBackStack(null);


    }

    public String encrypt(String input) {
        return Base64.encodeToString(input.getBytes(), Base64.DEFAULT);
    }




}
