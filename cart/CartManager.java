package com.example.foodapp.cart;

import com.example.foodapp.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class CartManager {
    private static CartManager instance;
    private List<CartModel> cartItems;

    private CartManager() {
        // Private constructor to enforce singleton pattern
        cartItems = new ArrayList<>();
    }

    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public void addItemToCart(CartModel item) {
        cartItems.add(item);
    }

    public void removeItemFromCart(CartModel item) {
        cartItems.remove(item);
    }

    public void clearCart() {
        cartItems.clear();
    }

    public List<CartModel> getCartItems() {
        return cartItems;
    }

    // Add other methods for cart management as needed

    public double calculateTotalPrice() {
        double total = 0;
        for (CartModel item : cartItems) {
            try {
                total += Double.parseDouble(item.getPrice().replace("$", ""));
            } catch (NumberFormatException e) {
                // Handle parsing error
                e.printStackTrace();
            }
        }
        return total;
    }

}
