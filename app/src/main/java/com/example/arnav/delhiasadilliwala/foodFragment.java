package com.example.arnav.delhiasadilliwala;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class foodFragment extends Fragment {


    public foodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<place> places = new ArrayList<place>();

        places.add(new place("Old Delhi", "The narrow gullies of Old Delhi narrate many stories through the overwhelming variety of street food that they offer. They’ll inspire you to pull out your cameras, explore new ways, and sometimes, even get into the kitchen and recreate. While walking through the chaotic maze of by-lanes, you can never be lost. If ever you are, you’ll probably catch the whiff of steaming samosas still hissing from the hot oil or the sweet aroma of crisp jalebis that will lead your senses. Temptation is everywhere and it’s hard to resist. The old city shares an intimate relationship with food, one that was founded during the Mughal era. Here, traditions rule and history is served sumptuously garnished with culinary secrets that have been passed down through generations.", R.drawable.old_delhi_food, "https://goo.gl/maps/YC4ySXkcNsT2"));
        places.add(new place("Pandara Road", "If you love to eat some spicy north Indian cuisine and Punjabi food, Pandara road is the best place to eat in Delhi. There is a wide range of veg/non-veg north-Indian & Punjabi restaurants and hotels which serve very delicious food with varieties of dishes. So, if you are looking to taste some varieties of delicious foods with Punjabi traditional style, then this is the place for you.", R.drawable.pandara_road, "https://goo.gl/maps/SrhXxteA1Gw"));
        places.add(new place("Khan Market", "Khan Market, a place where you’ll never be disappointed with their endless options, is one of the newest high end retail and food street markets in New Delhi. You can get there plenty of options for shopping, entertainment, nightout and eating out from bright sunny day to late in the evening. You can taste there verities of Indian and Chinese snacks, fast foods, dinning at some popular places and restaurants.", R.drawable.khan_market_food, "https://goo.gl/maps/282sJ4eMhHp"));
        places.add(new place("Connaught Place", "Connaught Place is not only blessed with Delhi’ top 5 star hotels, bunch of the big brand showrooms and street retail shops, and some of the best hot nightclubs, but also it is the best place to find the delicious food till late night. There are plenty of budget and premium restaurants in Connaught Place which may suite every pocket.", R.drawable.connaught_place, "https://goo.gl/maps/Qeg3PxfZr562"));
        places.add(new place("Nehru Place", "Nehru Places is one of the oldest and most crowded markets of Delhi which is best known as the largest computer (peripherals) markets in India. However, there is lot of street foods corner which offers varieties of snacks, fast foods and Chinese. But, one place I will highly and most recommended for you to enjoy its delicious foods at Punjabi style!! Yes, Standard Punjabi Khana (Food Corner).", R.drawable.nehru_place, "https://goo.gl/maps/GpYAHXcoedm"));

        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.primary_light);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
