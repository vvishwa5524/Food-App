package com.example.foodapp.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.adapters.CartAdapter;
import com.example.foodapp.cart.CartManager;
import com.example.foodapp.models.CartModel;

import java.util.List;

public class MyCartFragment extends Fragment {

    CartAdapter cartAdapter;
    RecyclerView recyclerView;
    CartManager cartManager;

    public MyCartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Use the CartManager to manage cart items
        cartManager = CartManager.getInstance();
        List<CartModel> cartItems = cartManager.getCartItems();

        // Initialize cart items if not already done
        if (cartItems.isEmpty()) {
            cartItems.add(new CartModel(R.drawable.s1, "Order 1", "4.5", "45"));
            cartItems.add(new CartModel(R.drawable.fav1, "Order 2", "4.0", "35"));
            cartItems.add(new CartModel(R.drawable.new1, "Order 3", "5.0", "44"));
            cartItems.add(new CartModel(R.drawable.s3, "Order 4", "4.5", "20"));
            cartItems.add(new CartModel(R.drawable.fav2, "Order 5", "4.0", "24"));
            cartItems.add(new CartModel(R.drawable.new5, "Order 6", "5.0", "14"));
        }

        cartAdapter = new CartAdapter(cartItems);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}
