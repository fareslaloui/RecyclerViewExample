package com.knightcoder.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerAdapterUI adapter;
    private RecyclerView recyclerView;
    private List<Data> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mList=new ArrayList<>();

        Data data1=new Data("Meat","20g","225Cal");
        mList.add(data1);
        Data data2=new Data("Food","10g","110Cal");
        mList.add(data2);
        Data data3=new Data("Beans","12g","125Cal");
        mList.add(data3);
        Data data4=new Data("Sweets","5g","1000Cal");
        mList.add(data4);


        recyclerView=findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter=new RecyclerAdapterUI(this, mList);

        recyclerView.setAdapter(adapter);
    }
}