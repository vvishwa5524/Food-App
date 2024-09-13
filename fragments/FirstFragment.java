package com.example.foodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;
import com.example.foodapp.adapters.FeaturedAdapter;
import com.example.foodapp.adapters.FeaturedVerAdapter;
import com.example.foodapp.models.FeaturedModel;
import com.example.foodapp.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment {
    List<FeaturedModel> featuredModelsList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    List<FeaturedVerModel> featuredVerModelsList;
    RecyclerView recyclerView2;
    FeaturedVerAdapter featuredVerAdapter;


    public FirstFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);

        recyclerView  = view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        featuredModelsList = new ArrayList<>();
        featuredModelsList.add(new FeaturedModel(R.drawable.fav1,"Featured 1","Description 1"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav2,"Featured 2","Description 2"));
        featuredModelsList.add(new FeaturedModel(R.drawable.fav3,"Featured 3","Description 3"));

        featuredAdapter = new FeaturedAdapter(featuredModelsList);
        recyclerView.setAdapter(featuredAdapter);



        recyclerView2  = view.findViewById(R.id.featured_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        featuredVerModelsList = new ArrayList<>();

        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 1","description 1","5.0","10:00 - 18:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2,"Featured 2","description 2","4.8","10:00 - 18:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3,"Featured 3","description 3","4.5","10:00 - 18:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver1,"Featured 4","description 4","5.0","10:00 - 18:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver2,"Featured 5","description 5","4.8","10:00 - 18:00"));
        featuredVerModelsList.add(new FeaturedVerModel(R.drawable.ver3,"Featured 6","description 6","4.5","10:00 - 18:00"));


        featuredVerAdapter = new FeaturedVerAdapter(featuredVerModelsList);
        recyclerView2.setAdapter(featuredVerAdapter);

        return view;
    }
}