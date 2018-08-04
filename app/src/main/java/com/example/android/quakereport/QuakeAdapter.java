package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter<Quake> {

    public QuakeAdapter(Activity context, ArrayList<Quake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        View listItemView = converView;
        if (listItemView == converView) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Quake currentQuake = getItem(position);

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.value_magnitude);
        magnitudeTextView.setText(currentQuake.getMagnitude());

        TextView locationTextView= (TextView) listItemView.findViewById(R.id.value_location);
        locationTextView.setText(currentQuake.getLocation());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.value_date);
        dateTextView.setText(currentQuake.getDate());

        return listItemView;
    }

}
