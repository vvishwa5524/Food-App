package com.example.foodapp.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.foodapp.R;

import com.example.foodapp.adapters.FeaturedVerAdapter;
import com.example.foodapp.adapters.PopularAdapter;
import com.example.foodapp.adapters.PopularVerAdapter;

import com.example.foodapp.models.FeaturedVerModel;
import com.example.foodapp.models.PopularModel;
import com.example.foodapp.models.PopularVerModel;

import java.util.ArrayList;
import java.util.List;


public class SecondFragment extends Fragment {
    List<PopularModel> popularModelsList;
    RecyclerView recyclerView;
    PopularAdapter popularAdapter;

    List<PopularVerModel> popularVerModelsList;
    RecyclerView recyclerView2;
    PopularVerAdapter popularVerAdapter;



    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_second, container, false);

        recyclerView  = view.findViewById(R.id.popular_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        popularModelsList = new ArrayList<>();
        popularModelsList.add(new PopularModel(R.drawable.pop1,"Popular 1","Description 1"));
        popularModelsList.add(new PopularModel(R.drawable.pop2,"Popular 2","Description 2"));
        popularModelsList.add(new PopularModel(R.drawable.pop3,"Popular 3","Description 3"));

        popularAdapter = new PopularAdapter(popularModelsList);
        recyclerView.setAdapter(popularAdapter);


        recyclerView2  = view.findViewById(R.id.popular_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        popularVerModelsList = new ArrayList<>();

        popularVerModelsList.add(new PopularVerModel(R.drawable.pop4,"Popular 1","description 1","5.0","10:00 - 18:00"));
        popularVerModelsList.add(new PopularVerModel(R.drawable.pop5,"Popular 2","description 2","4.8","10:00 - 18:00"));
        popularVerModelsList.add(new PopularVerModel(R.drawable.pop6,"Popular 3","description 3","4.5","10:00 - 18:00"));
        popularVerModelsList.add(new PopularVerModel(R.drawable.pop7,"Popular 4","description 4","5.0","10:00 - 18:00"));
        popularVerModelsList.add(new PopularVerModel(R.drawable.pop8,"Popular 5","description 5","4.8","10:00 - 18:00"));
        popularVerModelsList.add(new PopularVerModel(R.drawable.pop9,"Popular 6","description 6","4.5","10:00 - 18:00"));


        popularVerAdapter = new PopularVerAdapter(popularVerModelsList);
        recyclerView2.setAdapter(popularVerAdapter);


        return view;
    }
}