package com.example.myapplication.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;


public class RecycleActivity extends AppCompatActivity {

    private List<Item> itemList = new ArrayList<>();

    private List<Item> filter (List<Item>strings,String text){
        List<Item> filterItem = new ArrayList<>();

        for (Item i : strings){
            if (i.getText().contains(text))
                filterItem.add(i);
        }
        return filterItem;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        initItem();
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        RecycleItemAdapter adapter = new RecycleItemAdapter(itemList);
        recyclerView.setAdapter(adapter);

        SearchView searchView = findViewById(R.id.recycle_search);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                List<Item> filterItem = filter(itemList,newText);
                adapter.setFilter(filterItem);
                return true;
            }
        });
    }

    private void initItem() {
        for(int i = 0;i < 100; i++) {
            Item n = new Item(i + "");
            itemList.add(n);
        }
    }
}
