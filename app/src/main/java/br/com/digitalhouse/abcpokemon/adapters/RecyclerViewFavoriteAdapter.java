package br.com.digitalhouse.abcpokemon.adapters;

import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.interfaces.RecyclerViewFavoriteClickListener;
import br.com.digitalhouse.abcpokemon.model.Pokemon;

public class RecyclerViewFavoriteAdapter extends RecyclerView.Adapter<RecyclerViewFavoriteAdapter.ViewHolder> {
    private List<Pokemon> pokemonList;

    public RecyclerViewFavoriteAdapter(List<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }

    @NonNull
    @Override
    public RecyclerViewFavoriteAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.favorite_recycleview_item,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewFavoriteAdapter.ViewHolder viewHolder, int i) {
        final Pokemon pokemon = pokemonList.get(i);
        viewHolder.bind(pokemon);
    }

    @Override
    public int getItemCount() {
        return pokemonList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imageViewPokemon;
        private TextView textViewName;
        private TextView textViewLevel;
        private ImageView imageViewRecycle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageViewPokemon = itemView.findViewById(R.id.imageViewPokemon);
            imageViewRecycle = itemView.findViewById(R.id.imageViewRecycle);
            textViewName = itemView.findViewById(R.id.textViewName);
            textViewLevel = itemView.findViewById(R.id.textViewLevel);

        }
        public void bind(Pokemon pokemon){

            imageViewPokemon.setImageDrawable(ContextCompat
                    .getDrawable(imageViewPokemon.getContext(), pokemon.getImage()));
            textViewName.setText(pokemon.getName());

        }
    }
}