package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView MainListView = findViewById(R.id.MainListView);
        String[] counties = getResources().getStringArray(R.array.counties);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.test_list_item, counties);

        // почему эта херовина не растягивается? Указал же padding
        // почему нельзя выбрать new_item_list ??? один и тот же код!

        MainListView.setAdapter(adapter);

    }
}