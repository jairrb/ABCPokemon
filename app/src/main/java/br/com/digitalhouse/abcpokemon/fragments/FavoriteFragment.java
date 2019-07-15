package br.com.digitalhouse.abcpokemon.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.digitalhouse.abcpokemon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoriteFragment extends Fragment {
    private Button btnReturn;

    public FavoriteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favorite, container, false);
        btnReturn = view.findViewById(R.id.btnReturn);
        replaceFragment(new FavoriteRecycleFragment());

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragmentManager().popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
            }
        });
        return view;
    }


    private void replaceFragment(Fragment fragment) {
        getFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.transaction_fragment_enter,R.anim.transaction_fragment_exit,
                        R.anim.transaction_fragment_popenter,R.anim.transaction_fragment_pop_exit)
                .replace(R.id.containerFavorite,fragment)
                .commit();
    }

}
