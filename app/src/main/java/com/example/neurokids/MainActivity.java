package com.example.neurokids;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView1;
    RecyclerView.Adapter AdapterVertikal;
    RecyclerView.LayoutManager layoutManager;
    private ArrayList<model> dataItem;
    private ImageView imageAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = findViewById(R.id.recyleview);
        recyclerView1.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView1.setLayoutManager(layoutManager);
        recyclerView1.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        dataItem = new ArrayList<>();
        for(int i = 0; i < myitem.nama.length; i++ ){
            dataItem.add(new model(myitem.images[i] ,myitem.nama[i] ,myitem.penjelasan[i],myitem.PenjelasanLengkap[i]));
        }
        AdapterVertikal = new AdapterView(dataItem, this);
        recyclerView1.setAdapter(AdapterVertikal);





    }
}
