package com.example.robotic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;



public class PlacasAdapter extends ArrayAdapter<Placas> {
    private final Context context;
    private final ArrayList<Placas> elementos;

    public PlacasAdapter(Context context, ArrayList<Placas> elementos) {
        super(context, R.layout.placas_view, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.placas_view, parent, false);
        TextView nomePlaca = (TextView) rowView.findViewById(R.id.txtPlacaName);
        TextView mac = (TextView) rowView.findViewById(R.id.txtMac);
        Button status = (Button) rowView.findViewById(R.id.txtStatus);

        nomePlaca.setText(elementos.get(position).getNome());
        mac.setText(elementos.get(position).getMac());
        status.setText(elementos.get(position).getStatus());
        return rowView;
    }
}