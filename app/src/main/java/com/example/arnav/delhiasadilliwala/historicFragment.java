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
public class historicFragment extends Fragment {


    public historicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        ArrayList<place> places = new ArrayList<place>();

        places.add(new place("India Gate", "This imposing 42m-high stone memorial arch was designed by Lutyens in 1921. It pays tribute to around 90,000 Indian army soldiers who died in WWI, the Northwest Frontier operations and the 1919 Anglo-Afghan War. The chhatri behind it contained a statue of George V, later moved to Coronation Park. The arch has a constant buzz of tourists, budhdhi ke bal ('old lady's hair' – candyfloss) sellers and other hawkers.", R.drawable.india_gate, "https://goo.gl/maps/rvnx9DW24C72"));
        places.add(new place("Hauz Khas Fort and Village", "Built by Sultan Ala-ud-din Khilji in the 13th century, Hauz Khas means ‘noble tank', and its reservoir once covered 28 hectares. It collected enough water during the monsoon to last Siri Fort throughout the dry season. Today it's much smaller, but still a beautiful place to be, thronged by birds and surrounded by parkland. Alongside it are the ruins of Feroz Shah’s 14th-century madrasa (religious school) and tomb, which he had built before his death in 1388.", R.drawable.hauz_khas, "https://goo.gl/maps/J94CU5i3gqw"));
        places.add(new place("Humayun’s Tomb", "Humayun’s tomb is sublimely well proportioned, seeming to float above its symmetrical gardens. It's thought to have inspired the Taj Mahal, which it predates by 60 years. Constructed for the Mughal emperor in the mid-16th century by Haji Begum, his Persian-born wife, the tomb marries Persian and Mughal elements, with restrained decoration enhancing the architecture. The arched facade is inlaid with bands of white marble and red sandstone, and the building follows strict rules of Islamic geometry, with an emphasis on the number eight.", R.drawable.humayun_tomb, "https://goo.gl/maps/djpyG3gzme92"));
        places.add(new place("Jama Masjid", "A beautiful pocket of calm at the heart of Old Delhi's mayhem, India’s largest mosque is built on a 10m elevation, towering above the surrounding hubbub. It can hold a mind-blowing 25,000 people. The marble and red-sandstone ‘Friday Mosque’ was Shah Jahan’s final architectural triumph, built between 1644 and 1658. The four watchtowers were used for security. There are two minarets standing 40m high, one of which can be climbed for amazing views. All of the three gates allow access to the mosque.", R.drawable.jama_masjid, "https://goo.gl/maps/ouirm3wiGRM2"));
        places.add(new place("Tughlaqabad Fort", "This magnificent 14th-century ruin, half reclaimed by jungle and gradually being encroached on by villages, was Delhi's third incarnation, built by Ghiyas-ud-din Tughlaq. The sultan poached workers from the Sufi saint Nizam-ud-din, who issued a curse that shepherds would inhabit the fort. However, it's monkeys rather than shepherds that have taken over. There are fantastic emerald-green views. Interlinking underground rooms were used as storehouses.", R.drawable.tughlaqabad_fort, "https://goo.gl/maps/ghDhcL2t1TS2"));
        places.add(new place("Mehrauli Archaeological Park", "There are extraordinary riches scattered around Mehrauli, with over 440 monuments – from the 10th century to the British era – dotting a forest and the village itself. In the forest, most impressive are the time-ravaged tombs of Balban and Quli Khan, his son, and the Jamali Khamali mosque, attached to the tomb of the Sufi poet Jamali. To the west is the 16th-century Rajon ki Baoli, Delhi's finest step-well, with a monumental flight of steps.", R.drawable.mehrauli, "https://goo.gl/maps/zVvLuHAb4XD2"));

        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.primary_light);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
