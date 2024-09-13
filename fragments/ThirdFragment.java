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
import com.example.foodapp.adapters.NewAdapter;
import com.example.foodapp.adapters.NewVerAdapter;
import com.example.foodapp.models.FeaturedModel;
import com.example.foodapp.models.FeaturedVerModel;
import com.example.foodapp.models.NewModel;
import com.example.foodapp.models.NewVerModel;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragment extends Fragment {

    List<NewModel> newModelsList;
    RecyclerView recyclerView;
    NewAdapter newAdapter;

    List<NewVerModel> newVerModelsList;
    RecyclerView recyclerView2;
    NewVerAdapter newVerAdapter;

    public ThirdFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_third, container, false);

        recyclerView  = view.findViewById(R.id.new_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        newModelsList = new ArrayList<>();
        newModelsList.add(new NewModel(R.drawable.new1,"New1 1","Description 1"));
        newModelsList.add(new NewModel(R.drawable.new2,"New 2","Description 2"));
        newModelsList.add(new NewModel(R.drawable.new3,"New 3","Description 3"));

        newAdapter = new NewAdapter(newModelsList);
        recyclerView.setAdapter(newAdapter);


        recyclerView2  = view.findViewById(R.id.new_ver_rec);
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));
        newVerModelsList = new ArrayList<>();

        newVerModelsList.add(new NewVerModel(R.drawable.new4,"New 1","description 1","5.0","10:00 - 18:00"));
        newVerModelsList.add(new NewVerModel(R.drawable.new5,"New 2","description 2","4.8","10:00 - 18:00"));
        newVerModelsList.add(new NewVerModel(R.drawable.new6,"New 3","description 3","4.5","10:00 - 18:00"));
        newVerModelsList.add(new NewVerModel(R.drawable.new7,"New 4","description 4","5.0","10:00 - 18:00"));
        newVerModelsList.add(new NewVerModel(R.drawable.new8,"New 5","description 5","4.8","10:00 - 18:00"));
        newVerModelsList.add(new NewVerModel(R.drawable.new9,"New 6","description 6","4.5","10:00 - 18:00"));


        newVerAdapter = new NewVerAdapter(newVerModelsList);
        recyclerView2.setAdapter(newVerAdapter);


        return view;
    }
}