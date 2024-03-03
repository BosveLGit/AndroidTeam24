package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Country> listCountry = new ArrayList<>();

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listCountry.add(new Country("Бельгия", R.drawable.be));
        listCountry.add(new Country("Канада", R.drawable.ca));
        listCountry.add(new Country("Дания", R.drawable.dk));
        listCountry.add(new Country("Эстония", R.drawable.ee));
        listCountry.add(new Country("Франция", R.drawable.fr));
        listCountry.add(new Country("Грузия", R.drawable.ge));
        listCountry.add(new Country("Хорватия", R.drawable.hr));
        listCountry.add(new Country("Венгрия", R.drawable.hu));
        listCountry.add(new Country("Ирландия", R.drawable.ie));
        listCountry.add(new Country("Япония", R.drawable.jp));

        listView = (ListView) findViewById(R.id.MainListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(MainActivity.this, listCountry);
        listView.setAdapter(customBaseAdapter);


    }
}