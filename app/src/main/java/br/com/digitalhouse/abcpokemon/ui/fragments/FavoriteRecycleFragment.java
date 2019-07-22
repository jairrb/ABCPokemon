package br.com.digitalhouse.abcpokemon.ui.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.adapters.RecyclerViewFavoriteAdapter;
import me.sargunvohra.lib.pokekotlin.model.Pokemon;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteRecycleFragment extends Fragment {

    List<Pokemon> pokemons = new ArrayList<>();

    public FavoriteRecycleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite_recycle, container, false);
        RecyclerView recyclerViewFavorite = view.findViewById(R.id.recyclerViewFavorite);

        RecyclerViewFavoriteAdapter adapter = new RecyclerViewFavoriteAdapter(getPokemon());
        recyclerViewFavorite.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerViewFavorite.setAdapter(adapter);

        return view;


    }

    private List<Pokemon> getPokemon() {
      //  pokemons.add(new Pokemon("Bulbasaur",R.drawable.bulbasaur));



        return pokemons;
    }


}
