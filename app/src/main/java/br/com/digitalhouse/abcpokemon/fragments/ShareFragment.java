package br.com.digitalhouse.abcpokemon.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import br.com.digitalhouse.abcpokemon.R;
import br.com.digitalhouse.abcpokemon.interfaces.IntegrationFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ShareFragment extends Fragment {
    private IntegrationFragment integration;
    private ImageView imageViewSocialFacebook;
    private ImageView imageViewSocialWhatsApp;
    private ImageView imageViewSocialYouTube;
    private ImageView imageViewSocialGoogle;
    private ImageView imageViewSocialInstagram;
    private ImageView imageViewSocialTwitter;
    private ImageView imageViewSocialSnapChat;
    private ImageView imageViewSocialReddit;
    private ImageView imageViewSocialGmail;

    public ShareFragment() {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup conteudoTodo,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_share, conteudoTodo, false);

        initViews(view);

        imageViewSocialFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialYouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialTwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialSnapChat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialReddit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });
        imageViewSocialGmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (integration instanceof IntegrationFragment) {
                    integration.integration(new StartFragment());
                }
            }
        });


        return view;
    }

    private void initViews(View view) {
        imageViewSocialFacebook = view.findViewById(R.id.imageViewSocialFacebook);
        imageViewSocialWhatsApp = view.findViewById(R.id.imageViewSocialWhatsApp);
        imageViewSocialYouTube = view.findViewById(R.id.imageViewSocialYouTube);
        imageViewSocialGoogle = view.findViewById(R.id.imageViewSocialGoogle);
        imageViewSocialInstagram = view.findViewById(R.id.imageViewSocialInstagram);
        imageViewSocialTwitter = view.findViewById(R.id.imageViewSocialTwitter);
        imageViewSocialSnapChat = view.findViewById(R.id.imageViewSocialSnapChat);
        imageViewSocialReddit = view.findViewById(R.id.imageViewSocialReddit);
        imageViewSocialGmail = view.findViewById(R.id.imageViewSocialGmail);
    }

}
