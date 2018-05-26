package com.sg.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.sg.myapplication.adapter.ProdukAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ProdukAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("HOME");

        setSupportActionBar(toolbar);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycleView);
        adapter = new ProdukAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

        List<ProdukModel> listProduk = new ArrayList<>();
        ProdukModel produkModel = new ProdukModel();
        produkModel.setNama("Buku");

        for (int i = 0; i<8; i++){
            listProduk.add(produkModel);
        }

        adapter.add(listProduk);



//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
