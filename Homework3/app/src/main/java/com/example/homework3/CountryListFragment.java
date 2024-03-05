package com.example.homework3;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CountryListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CountryListFragment extends Fragment {

    List<Country> listCountry = new ArrayList<>();


//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    public CountryListFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static CountryListFragment newInstance(String param1, String param2) {
        CountryListFragment fragment = new CountryListFragment();
        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }


        listCountry.add(new Country("Бельгия", R.drawable.be, "Брюссель", 30688));
        listCountry.add(new Country("Канада", R.drawable.ca, "Оттава", 9985000));
        listCountry.add(new Country("Дания", R.drawable.dk, "Копенгаген", 42952));
        listCountry.add(new Country("Эстония", R.drawable.ee, "Таллин", 45339));
        listCountry.add(new Country("Франция", R.drawable.fr, "Париж", 643801));
        listCountry.add(new Country("Грузия", R.drawable.ge, "Тбилиси", 69700));
        listCountry.add(new Country("Хорватия", R.drawable.hr, "Загреб", 56594));
        listCountry.add(new Country("Венгрия", R.drawable.hu, "Будапешт", 93026));
        listCountry.add(new Country("Ирландия", R.drawable.ie, "Дублин", 70273));
        listCountry.add(new Country("Япония", R.drawable.jp, "Токио", 377973));




    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_country_list, container, false);

        ListView listView = (ListView) view.findViewById(R.id.MainListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getActivity(), listCountry);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), Card_country.class);
                intent.putExtra(Country.class.getSimpleName(), listCountry.get(position));
                startActivity(intent);
            }
        });

        listView.setAdapter(customBaseAdapter);

        return view;
    }
}