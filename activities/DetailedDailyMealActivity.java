package com.example.foodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.DetailedDailyAdapter;
import com.example.foodapp.models.DetailedDailyModel;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyMealActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<DetailedDailyModel> detailedDailyModelList;
    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed_daily_meal);

        String type = getIntent().getStringExtra("type");

        recyclerView =findViewById(R.id.detailed_rec);
        imageView=findViewById(R.id.img1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModelList = new ArrayList<>();
        dailyAdapter = new DetailedDailyAdapter(this,detailedDailyModelList);
        recyclerView.setAdapter(dailyAdapter);


        if(type != null && type.equalsIgnoreCase("breakfast")){
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav1,"BreakFast","description","4.4","40","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav2,"BreakFast","description","4.4","40","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.fav3,"BreakFast","description","4.4","40","10:00 - 18:00"));
            dailyAdapter.notifyDataSetChanged();

        }

        if(type != null && type.equalsIgnoreCase("sweets")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s1,"Sweets 1","description","4.4","40","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s2,"Sweets 2","description","4.4","50","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s3,"Sweets 3","description","4.4","60","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.s4,"Sweets 4","description","4.4","30","10:00 - 18:00"));
            dailyAdapter.notifyDataSetChanged();

        }
        if(type != null && type.equalsIgnoreCase("lunch")){
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop1,"Lunch 1","description","4.0","40","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop2,"Lunch 2","description","4.9","50","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop3,"Lunch 3","description","4.8","60","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop4,"Lunch 4","description","4.6","30","10:00 - 18:00"));
            dailyAdapter.notifyDataSetChanged();

        }

        if(type != null && type.equalsIgnoreCase("dinner")){
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop9,"Dinner 1","description","4.4","40","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop8,"Dinner 2","description","4.4","50","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop7,"Dinner 3","description","4.4","60","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.pop6,"Dinner  4","description","4.4","30","10:00 - 18:00"));
            dailyAdapter.notifyDataSetChanged();

        }
        if(type != null && type.equalsIgnoreCase("coffee")){
            imageView.setImageResource(R.drawable.sweets);
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.co1,"Coffee 1","description","4.4","40","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.co2,"Coffee 2","description","4.5","50","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.co3,"Coffee 3","description","4.9","60","10:00 - 18:00"));
            detailedDailyModelList.add(new DetailedDailyModel(R.drawable.co4,"Coffee 4","description","4.45","30","10:00 - 18:00"));
            dailyAdapter.notifyDataSetChanged();

        }

    }
}