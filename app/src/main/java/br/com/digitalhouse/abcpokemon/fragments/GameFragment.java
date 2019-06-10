package br.com.digitalhouse.abcpokemon.fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.interfaces.IntegrationFragment;
import br.com.digitalhouse.abcpokemon.login.OpcoesGameActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class GameFragment extends Fragment {
    private IntegrationFragment integration;
    TextView textViewLetter;


    public GameFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            integration = (IntegrationFragment) context;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_game, container, false);

        textViewLetter = view.findViewById(R.id.textViewLetter);
        textViewLetter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (integration instanceof IntegrationFragment) {
                    integration.integration(new ResultFragment());
                }
            }

        });

        return view;
    }
}
