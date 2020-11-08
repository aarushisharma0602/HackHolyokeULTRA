package com.example.nutritionapp;

public class Ingredient {
    private String name;
    private double servingSize;
    private String servingUnit;
    private double calories;
    private double fat;
    private double protein;
    private double carbs;
    private double sodium;

    public Ingredient(String name, String servingUnit, double servingSize) {
        this.name = name;
        this.servingSize = servingSize;
        this.servingUnit = servingUnit;
    }
    public Ingredient(String name, String servingUnit, double calories, double fat, double protein, double carbs, double sodium) {
        this.name = name;
        this.servingUnit = servingUnit;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.carbs = carbs;
        this.sodium = sodium;
    }

    public String getName() {
        return this.name;
    }

    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    public double getServingSize() {
        return servingSize;
    }

    public void setServingUnit(String servingUnit) {
        this.servingUnit = servingUnit;
    }

    public String getServingUnit() {
        return servingUnit;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setFat(double fat) {
        this.fat = fat;

    }
    public double getFat() {
        return this.fat;
    }

    public double getProtein() {
        return this.protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;

    }

    public double getCarbs() {
        return this.carbs;

    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }


    public double getSodium() {
        return this.sodium;

    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }




}

