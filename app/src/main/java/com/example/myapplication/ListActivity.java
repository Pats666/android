package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {
    private ListView listView;
    private String[] data = {"a", "b","c", "d", "e","f","g","h","i","j","k"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        listView = findViewById(R.id.lw1);
        listView.setAdapter(new ArrayAdapter<String>(ListActivity.this, android.R.layout.simple_list_item_1,data));
    }
}