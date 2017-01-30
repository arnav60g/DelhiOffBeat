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
public class shoppingFragment extends Fragment {


    public shoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<place> places = new ArrayList<place>();


        places.add(new place("Janpath", "Janpath is such a beautiful representation of one of the most beautiful things about Delhi. It’s so incredibly eclectic and you’re bound to find something interesting, even if you’re barely even looking. From the Tibetan Market to the Gujarati Market, to the fancy stores, to the flea market, to the Central Cottage Industries Emporium. Whether or not you end up buying anything, Janpath is a shopping experience to be reckoned with. And psst, just btw, there’s no way you won’t end up getting something fun and cool, even in this heat.", R.drawable.janpath, "https://goo.gl/maps/WjNNzfRhd3N2"));
        places.add(new place("Chandni Chowk", "The streets of Chandni Chowk need no introduction—from movie titles to Bollywood songs, the name Chandni Chowk makes it to pop culture references quite often. This part of Delhi is known not just around the country, but around the world, and with good reason too—the charm is certainly unmatchable. Being pretty expansive and very, very crowded on all days of the week, finding your way around this area can be quite intimidating. From lehengas and sarees to spices and herbs of all kinds to stationery items and books, you can find anything you need if you know which street sells what.", R.drawable.chandni_chowk, "https://goo.gl/maps/UrPWESFZnCz"));
        places.add(new place("Dilli Haat", "This open-air food-and-crafts market is a cavalcade of colour and sells regional handicrafts from all over India; bargain hard. With lots of food stands it’s also a good place to sample cheap, delicious regional specialities – try food from Nagaland or Tamil Nadu (dishes are around ₹70 to ₹100).", R.drawable.dilli_haat, "https://goo.gl/maps/AmPEq9pFop72"));
        places.add(new place("Khan Market", "Khan Market named in honour of Khan Abdul Ghaffar Khan (popularly known as Frontier Gandhi), is definitely one of the high-end shopping streets. It is situated at the heart of Delhi and is close to India Gate.It ranks as the market with one of the highest rentals per square foot in the world.", R.drawable.khan_market_shop, "https://goo.gl/maps/9giht51a2o22"));
        places.add(new place("Sarojini Nagar", "The stories of all the stylish merchandise acquired at Sarojini Nagar aren’t just propagated urban legend; you just need to know where to go and you will most definitely head back home with {plastic} bags full of treasures. The two long lanes that effectively house every runway and high street trend, copied, exported and hung there in all their rejected glory to be pounced upon by some such chic-seeker.", R.drawable.sarojini_nagar, "https://goo.gl/maps/7MLpVGPWps32"));

        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.primary_light);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);


        return rootView;
    }


}
