package br.com.digitalhouse.abcpokemon.fragments;


import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.interfaces.IntegrationFragment;
import br.com.digitalhouse.abcpokemon.login.OpcoesGameActivity;
import me.sargunvohra.lib.pokekotlin.client.PokeApi;
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;
import me.sargunvohra.lib.pokekotlin.model.PokemonSpecies;

/**
 * A simple {@link Fragment} subclass.
 */
public class GameFragment extends Fragment {
    private IntegrationFragment integration;
    TextView textViewName;
    TextView textViewLetter;
    ImageView circleImageViewPokemon;

    String namePokemon = "BULBASAUR";
    String stringPokemon;
    String lettersPokemon;


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

        /*

        PokeApi pokeApi = new PokeApiClient();
        Pokemon bulbasaur = pokeApi.getPokemon(1);

        */

        initViews(view);
        randomStringGame();
        textViewName.setText(stringPokemon);
        textViewLetter.setText(lettersPokemon);
        circleImageViewPokemon.setImageDrawable(ContextCompat
               .getDrawable(circleImageViewPokemon.getContext(), R.drawable.bulbasaur));

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

    private void initViews(View view) {
        textViewName = view.findViewById(R.id.textViewName);
        textViewLetter = view.findViewById(R.id.textViewLetter);
        circleImageViewPokemon = view.findViewById(R.id.circleImageViewPokemon);
    }

    private void randomStringGame(){
        stringPokemon = namePokemon;
        lettersPokemon = "";
        int i = 0;
        int j = 3;


        if (j > namePokemon.length()) {
            j = namePokemon.length();
        }

        while (i < j) {
            int posStart = 0 + (int)(Math.random() * namePokemon.length());
            int posEnd = posStart+1;

            String letter = stringPokemon.substring(posStart,posEnd);
            if (letter != null && !letter.equals("_") && lettersPokemon.indexOf(letter) == -1) {
                stringPokemon = stringPokemon.replace(letter, "_");
                lettersPokemon += letter;
                i++;
            }
        }
    }
}
