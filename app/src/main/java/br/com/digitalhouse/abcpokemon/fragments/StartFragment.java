package br.com.digitalhouse.abcpokemon.fragments;


import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toolbar;

import br.com.digitalhouse.abcpokemon.interfaces.IntegrationFragment;
import br.com.digitalhouse.abcpokemon.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class StartFragment extends Fragment {
    private IntegrationFragment integration;

    public StartFragment() {
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
        View view = inflater.inflate(R.layout.fragment_start, container, false);
        final TextView textView = view.findViewById(R.id.textView2);

        new CountDownTimer(4000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText(String.valueOf(millisUntilFinished / 1000));
            }

            public void onFinish() {

                textView.setText("START");

                if (integration instanceof IntegrationFragment) {
                    integration.integration(new GameFragment());
                }

            }
        }.start();

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }

}