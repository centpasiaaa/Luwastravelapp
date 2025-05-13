package com.pasia.luwastravelapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.pasia.luwastravelapp.adapter.RecentsAdapter;
import com.pasia.luwastravelapp.adapter.TopPlacesAdapter;
import com.pasia.luwastravelapp.model.RecentsData;
import com.pasia.luwastravelapp.model.TopPlacesData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentRecycler, topPlacesRecycler;
    RecentsAdapter recentsAdapter;
    TopPlacesAdapter topPlacesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentsData> recentsDataList = new ArrayList<>();
        recentsDataList.add(new RecentsData("El Nido Palawan", "Philippines", "Php10,000.00", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Baler, Aurora", "Philippines", "Php4,000.00", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("El Nido Palawan", "Philippines", "Php10,000.00", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Baler, Aurora", "Philippines", "Php4,000.00", R.drawable.recentimage2));
        recentsDataList.add(new RecentsData("El Nido Palawan", "Philippines", "Php10,000.00", R.drawable.recentimage1));
        recentsDataList.add(new RecentsData("Baler, Aurora", "Philippines", "Php4,000.00", R.drawable.recentimage2));

        setRecentRecycler(recentsDataList);

        List<TopPlacesData> topPlacesDataList = new ArrayList<>();
        topPlacesDataList.add(new TopPlacesData("Chocolate Hills","Philippines","Php5,000.00",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chocolate Hills","Philippines","Php5,000.00",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chocolate Hills","Philippines","Php5,000.00",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chocolate Hills","Philippines","Php5,000.00",R.drawable.topplaces));
        topPlacesDataList.add(new TopPlacesData("Chocolate Hills","Philippines","Php5,000.00",R.drawable.topplaces));

        setTopPlacesRecycler(topPlacesDataList);
    }

    private void setRecentRecycler(List<RecentsData> recentsDataList){

        recentRecycler = findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recentRecycler.setLayoutManager(layoutManager);
        recentsAdapter = new RecentsAdapter(this, recentsDataList);
        recentRecycler.setAdapter(recentsAdapter);

    }

    private void setTopPlacesRecycler(List<TopPlacesData> topPlacesDataList){

        topPlacesRecycler = findViewById(R.id.top_places_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        topPlacesRecycler.setLayoutManager(layoutManager);
        topPlacesAdapter = new TopPlacesAdapter(this, topPlacesDataList);
        topPlacesRecycler.setAdapter(topPlacesAdapter);

    }
}