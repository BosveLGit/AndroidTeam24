package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
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

        listView = (ListView) findViewById(R.id.MainListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(MainActivity.this, listCountry);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, Card_country.class);
                intent.putExtra(Country.class.getSimpleName(), listCountry.get(position));
                startActivity(intent);
            }
        });

        listView.setAdapter(customBaseAdapter);

    }
}