package com.herprogramacion.restaurantericoparico.ui;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.herprogramacion.restaurantericoparico.Comunicador;
import com.herprogramacion.restaurantericoparico.Configuraciones.Radio;
import com.herprogramacion.restaurantericoparico.Configuraciones.Radios;
import com.herprogramacion.restaurantericoparico.R;

/**
 * Created by kaisitu on 12/03/2016.
 */
public class FragmentoRadio extends Fragment {
    private RecyclerView reciclador;
    private LinearLayoutManager layoutManager;
    private ListView listView;

    public FragmentoRadio() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.radio, container, false);

        reciclador = (RecyclerView) view.findViewById(R.id.reciclador);
        layoutManager = new LinearLayoutManager(getActivity());
        reciclador.setLayoutManager(layoutManager);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.pop_up);
                dialog.setTitle("Añadir radio:");

                Button dialogButton = (Button) dialog.findViewById(R.id.button);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText editText = (EditText) dialog.findViewById(R.id.editText);
                        EditText editText2 = (EditText) dialog.findViewById(R.id.editText2);
                        String mesa = String.valueOf(editText2.getText());
                        Comunicador.r.add(new Radio(editText.getText().toString(),Double.valueOf(editText2.getText().toString())));

                    }
                });

                dialog.show();
            }
        });

        listView = (ListView) view.findViewById(R.id.listView);

        for (int i = 0; i < Comunicador.r.size(); ++i) {
            Radios.freq.add(Comunicador.r.get(i));
        }
        this.listView.setAdapter(new AdaptadorRadio(getContext(), Comunicador.r));

        return view;
    }
}
