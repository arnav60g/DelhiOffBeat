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
public class architectureFragment extends Fragment {


    public architectureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<place> places = new ArrayList<place>();

        places.add(new place("Swaminarayan Akshardham Temple", "Explore the marvelous Akshardham Temple and witness the enormity of this exceptional monument under the guidance and knowledge of your expert guide. Visit the temple and appreciate its splendor, and as the sun sets, watch the amazing musical fountain show. The magnificent monument officially opened in 2005, and is situated on the banks of the Yamuna river in the eastern face of the city.Explore the alluring beauty of this majestic monument as your guide unfolds the legends and stories connected with the temple.", R.drawable.akshardham_temple, "https://goo.gl/maps/yqKJ1V13J6C2"));
        places.add(new place("Bahai House of Worship", "Designed for tranquil worship, Delhi's beautiful Lotus Temple offers a rare pocket of calm in the hectic city. This architectural masterpiece was designed by Iranian-Canadian architect Fariburz Sahba in 1986. It is shaped like a lotus flower, with 27 delicate-looking white-marble petals. The temple was created to bring faiths together; visitors are invited to pray or meditate silently according to their own beliefs. The attached visitor centre tells the story of the Bahai faith. Photography is prohibited inside the temple.", R.drawable.lotus_temple, "https://goo.gl/maps/TByZXLu2wfK2"));
        places.add(new place("Jantar Mantar", "This is one of five observatories built by Maharaja Jai Singh II, ruler of Jaipur. Constructed in 1725, Jantar Mantar (derived from the Sanskrit word for ‘instrument’, but which has also become the Hindi word for 'abracadabra') is a collection of curving geometric buildings that are carefully calibrated to monitor the movement of the stars and planets.", R.drawable.jantar_mantar, "https://goo.gl/maps/5zzYTaXYE3D2"));
        places.add(new place("Lodi Gardens", "Delhi's loveliest escape was originally named after the wife of the British Resident, Lady Willingdon, who had two villages cleared in 1936 in order to landscape a park to remind her of home. Today named after their Lodi-era tombs, the gardens, favoured getaway for Delhi's elite and courting couples, contain the 15th-century Bara Gumbad tomb and mosque, the strikingly different tombs of Mohammed Shah and Sikander Lodi, and the Athpula (eight-piered) bridge across the lake, which dates from Emperor Akbar’s reign.", R.drawable.lodhi_garden, "https://goo.gl/maps/PkiT77tMMVN2"));
        places.add(new place("Garden of the 5 Senses", "For a restful stroll in southern Delhi, these landscaped gardens are filled with intriguing contemporary sculptures, wind chimes and lily ponds, and are popular with couples. There are several upmarket restaurants and bars close to Gate 3. To get here take an autorickshaw from Saket metro station.", R.drawable.garden_five_senses, "https://goo.gl/maps/h4xawLTqgn62"));

        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.primary_light);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }


}
