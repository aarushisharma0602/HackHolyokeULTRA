package com.example.nutritionapp;

import java.util.HashMap;
import java.util.Set;

public class IngredientMap {
    private HashMap<String, Ingredient> ingredientMap;

    public IngredientMap(){
        ingredientMap = new HashMap<String, Ingredient>();
        ingredientMap.put("Flour", new Ingredient("Flour", "cups", 455, 1.2, 13, 95, 3));
        ingredientMap.put("Oats", new Ingredient("Oats", "cups", 307, 5, 11, 55, 0));
        ingredientMap.put("Egg", new Ingredient("Eggs", "grams", 70, 5, 6, 0, 185));
        ingredientMap.put("Butter", new Ingredient("Butter", "grams", 100, 12, 0.1, 0, 2));
        ingredientMap.put("Milk", new Ingredient("Milk", "cups", 150, 8, 8, 12, 120));
        ingredientMap.put("Rice", new Ingredient("Rice", "cups", 166, 1, 7, 35, 5));
        ingredientMap.put("Cheese", new Ingredient("Cheese", "cups", 440, 36, 28, 35, 5));
        ingredientMap.put("Peanuts", new Ingredient("Peanuts", "tbsp", 80, 5, 3, 4, 150));
        ingredientMap.put("Yogurt", new Ingredient("Yogurt", "grams", 61, 5, 4, 4.7, 36));
        ingredientMap.put("Cream", new Ingredient("Cream", "cups", 469, 46, 6, 9, 96));
    }

    public void addIngredient(Ingredient ingredient) {
        ingredientMap.put(ingredient.getName(), ingredient);
    }

    public Ingredient getIngredient(String ingredient) {
        return ingredientMap.get(ingredient);
    }

    public Set getIngredients() {
        return ingredientMap.entrySet();
    }

    // for testing only
    public void viewIngredients() {
        Set<String> set = ingredientMap.keySet();
        for(String s: set) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

    }
}

