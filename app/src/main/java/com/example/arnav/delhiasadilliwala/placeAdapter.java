package com.example.arnav.delhiasadilliwala;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Arnav on 11-01-2017.
 */

public class placeAdapter extends ArrayAdapter<place> {
private int mcolor;

    public placeAdapter(Activity context, ArrayList<place> Word, int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Word);
        mcolor=color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final place currentPlace = getItem(position);

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView placeTitle = (TextView) listItemView.findViewById(R.id.place_title);
        placeTitle.setText(currentPlace.getPlaceTitle());

        TextView placeDescription = (TextView) listItemView.findViewById(R.id.place_description);
        placeDescription.setText(currentPlace.getPlaceDescription());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.place_image);
        imageView.setImageResource(currentPlace.getPlaceImage());

        BitmapDrawable bd=(BitmapDrawable) getContext().getDrawable(currentPlace.getPlaceImage());
        android.view.ViewGroup.LayoutParams params = imageView.getLayoutParams();
        params.width= Resources.getSystem().getDisplayMetrics().widthPixels;
        params.height=bd.getBitmap().getHeight();
        params.height=2*params.height/3;
        imageView.setLayoutParams(params);

        // Set the theme color for the list item
        final View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mcolor);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        textContainer.findViewById(R.id.place_location).setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                String url = currentPlace.getPlaceLocation();
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW,  Uri.parse(url));
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }

}