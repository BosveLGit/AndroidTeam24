package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int layout = R.layout.my_item_list;

        ListView MainListView = findViewById(R.id.MainListView);
        String[] counties = getResources().getStringArray(R.array.counties);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                layout, counties);

        // какой дурак (разработчик платформы) придумал назвать xml test_list_item?
        // Неужели других названий не удалось придумать?


        MainListView.setAdapter(adapter);

    }
}