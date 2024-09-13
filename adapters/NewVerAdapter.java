package com.example.foodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.models.FeaturedVerModel;
import com.example.foodapp.models.NewVerModel;

import java.util.List;

public class NewVerAdapter extends RecyclerView.Adapter<NewVerAdapter.ViewHolder>{

    List<NewVerModel> list;

    public NewVerAdapter(List<NewVerModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.new_ver_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.timing.setText(list.get(position).getTiming());
        holder.rating.setText(list.get(position).getRating());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name,rating,description,timing;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView =itemView.findViewById(R.id.detailed_img);
            name =itemView.findViewById(R.id.detailed_name);
            rating=itemView.findViewById(R.id.detailed_rating);
            description=itemView.findViewById(R.id.detailed_des);
            timing=itemView.findViewById(R.id.detailed_timing);

        }
    }

}


