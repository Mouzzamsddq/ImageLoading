package com.example.imageloading;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<String> imagesUriList;
    AdapterImages adapterImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        imagesUriList=new ArrayList<>();
        dataPrepare();
        adapterImages = new AdapterImages(imagesUriList,MainActivity.this);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(manager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapterImages);


    }
    private void dataPrepare()
    {
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-1_1.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-2_1.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-3_1.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-4_1.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-5_1.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-6_1.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-7_0.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-8_1.jpg");
        imagesUriList.add("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-9_1.jpg");

    }
}





