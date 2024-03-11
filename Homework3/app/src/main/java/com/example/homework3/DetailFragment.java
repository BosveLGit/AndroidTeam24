package com.example.homework3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {


    public DetailFragment() {
        // Required empty public constructor
    }


    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false);
    }

    // обновление текстового поля
    public void setSelectedItem(Country country) {

        View currentView = getView();


        ImageView flagIcon = (ImageView) currentView.findViewById(R.id.flagIcon);
        flagIcon.setImageResource(country.getIconFlag());

        TextView nameCountry = (TextView) currentView.findViewById(R.id.nameCountry);
        nameCountry.setText(country.getCountry());

        TextView nameCapital = (TextView) currentView.findViewById(R.id.nameCapital);
        nameCapital.setText(country.getCapital());

        TextView square = (TextView) currentView.findViewById(R.id.square);
        NumberFormat formatter = NumberFormat.getInstance(new Locale("RU"));
        String countrySquare = formatter.format(country.getSquare());
        square.setText(String.valueOf("Площадь " + countrySquare + " км2"));


        Button buttonClose = (Button) currentView.findViewById(R.id.buttonClose);
//        buttonClose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Card_country.this.finish();
//            }
//        });

    }
}