package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] arrayCountries = {"Бельгия", "Канада", "Дания"
            , "Эстония", "Франция", "Грузия"
            , "Хорватия", "Венгрия", "Ирландия", "Япония"};
    int[] arrayFlags = {R.drawable.be, R.drawable.ca, R.drawable.dk
            , R.drawable.ee, R.drawable.fr, R.drawable.ge
            , R.drawable.hr, R.drawable.hu, R.drawable.ie, R.drawable.jp};


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.MainListView);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(MainActivity.this, arrayCountries, arrayFlags);
        listView.setAdapter(customBaseAdapter);






//        ListView MainListView = findViewById(R.id.MainListView);
//        String[] counties = getResources().getStringArray(R.array.counties);
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//                layout, counties);
//
//        MainListView.setAdapter(adapter);

    }
}