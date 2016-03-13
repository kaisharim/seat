package com.herprogramacion.restaurantericoparico.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.herprogramacion.restaurantericoparico.R;

/**
 * Fragmento para la pestaña "PERFIL" De la sección "Mi Cuenta"
 */
public class FragmentoPerfil extends Fragment {

    public FragmentoPerfil() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       ImageView radio = (ImageView) getActivity().findViewById(R.id.i3);
        /*a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        /*b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
        /*radio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragmentoGenerico2 = new FragmentoRadio();
                FragmentManager fragmentManager2 = getActivity().getSupportFragmentManager();
                // fragmentoGenerico.setArguments(b);
                fragmentManager2
                        .beginTransaction()
                        .replace(R.id.contenedor_principal, fragmentoGenerico2)
                        .commit();
            }
        });*/

        return inflater.inflate(R.layout.fragmento_perfil, container, false);
    }

}
