package com.herprogramacion.restaurantericoparico.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.herprogramacion.restaurantericoparico.Configuraciones.Radio;
import com.herprogramacion.restaurantericoparico.Configuraciones.Radios;
import com.herprogramacion.restaurantericoparico.R;

import java.util.List;

/**
 * Created by kaisitu on 12/03/2016.
 */
public class AdaptadorRadio extends BaseAdapter{

    private Context context;
    private List<Radio> items;

    public AdaptadorRadio(Context context, List<Radio> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return this.items.size();
    }

    @Override
    public Object getItem(int position) {
        return this.items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = convertView;

        if (convertView == null) {
            // Create a new view into the list.
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            rowView = inflater.inflate(R.layout.content_radio, parent, false);
        }

        TextView tvTitle = (TextView) rowView.findViewById(R.id.nombre);
        TextView tvSubtitle = (TextView) rowView.findViewById(R.id.frecuencia);
        Radio item = this.items.get(position);
        tvTitle.setText(item.getNombre().toString());
        tvSubtitle.setText(item.getFrecuencia().toString());

        return rowView;
    }

}
