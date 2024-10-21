package com.example.Pizzeria.model;

import java.util.List;

public class Pizza {
    private String name;
    private List<String> ingredients;
    private int calories;
    private double price;


    public Pizza(String name, List<String> ingredients, int calories, double price) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
