package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int CountNum = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        CountNum++;
        TextView app_title = findViewById(R.id.app_title);
        app_title.setText(String.valueOf(CountNum));
    }

    public void buttonSetName(View view) {
        TextView NameView = findViewById(R.id.NameView);

        EditText editText = findViewById(R.id.editText);
        if(editText.getText().toString().isEmpty()) {
            NameView.setText("Привет, Аноним!");
        } else {
            NameView.setText("Привет, " + editText.getText() + "!");
        }

    }

}