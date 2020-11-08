package com.example.nutritionapp;

public class UnitConverter {
    public UnitConverter() {
    }
    public double getConversionFactor(Ingredient ingredient, String goalServingUnit, double goalServingSize) {
        double conversionFactor = 1;
        /* conversions that are 1:1 */
        if (ingredient.getServingUnit().equals(goalServingUnit)) {
            conversionFactor = getFactorSameUnit(ingredient, goalServingSize);
        }
        if (ingredient.getServingUnit().equals("grams") && goalServingUnit.equals("ml")) {
            conversionFactor = getFactorSameUnit(ingredient, goalServingSize);
        }
        if (ingredient.getServingUnit().equals("ml") && goalServingUnit.equals("grams")) {
            conversionFactor = getFactorSameUnit(ingredient, goalServingSize);
        }

        /* conversions from cups to x here */
        if (ingredient.getServingUnit().equals("cups") && goalServingUnit.equals("grams")) {
            conversionFactor = getFactorCupsToGrams(ingredient, goalServingSize);
        }
        if (ingredient.getServingUnit().equals("cups") && goalServingUnit.equals("tsp")) {
            conversionFactor = getFactorCupsToTsp(ingredient, goalServingSize);
        }
        if (ingredient.getServingUnit().equals("cups") && goalServingUnit.equals("tbsp")) {
            conversionFactor = getFactorCupsToTbsp(ingredient, goalServingSize);
        }
        if (ingredient.getServingUnit().equals("cups") && goalServingUnit.equals("ml")) {
            conversionFactor = getFactorCupsToMl(ingredient, goalServingSize);
        }

        /* conversions from grams to x here */
        if (ingredient.getServingUnit().equals("grams") && goalServingUnit.equals("cups")) {
            conversionFactor = getFactorGramsToCups(ingredient, goalServingSize);
        }
        if (ingredient.getServingUnit().equals("grams") && goalServingUnit.equals("tsp")) {
            conversionFactor = getFactorGramsToTsp(ingredient, goalServingSize);
        }
        if (ingredient.getServingUnit().equals("grams") && goalServingUnit.equals("tbsp")) {
            conversionFactor = getFactorGramsToCups(ingredient, goalServingSize);
        }

        /* conversions from tbsp to x here */
        if (ingredient.getServingUnit().equals("tbsp") && goalServingUnit.equals("tsp")) {
            conversionFactor = getFactorTbspToTsp(ingredient, goalServingSize);
        }

        /* conversions from tsp to x here */
        if (ingredient.getServingUnit().equals("tsp") && goalServingUnit.equals("cups")) {
            conversionFactor = getFactorTspToCups(ingredient, goalServingSize);
        }

        if (ingredient.getServingUnit().equals("tsp") && goalServingUnit.equals("tbsp")) {
            conversionFactor = getFactorTspToTbsp(ingredient, goalServingSize);
        }
        return conversionFactor;

    }

    public void convert(Ingredient ingredient, String goalServingUnit, double goalServingSize) {
        double conversionFactor = getConversionFactor(ingredient, goalServingUnit, goalServingSize);
        ingredient.setCalories((ingredient.getCalories() * conversionFactor));
        ingredient.setFat((ingredient.getFat() * conversionFactor));
        ingredient.setProtein((ingredient.getProtein() * conversionFactor));
        ingredient.setCarbs((ingredient.getCarbs() * conversionFactor));
        ingredient.setSodium((ingredient.getSodium() * conversionFactor));

        ingredient.setServingSize(goalServingSize);
        ingredient.setServingUnit(goalServingUnit);


    }


    public double getFactorSameUnit(Ingredient ingredient, double goalServingSize) {
        return ingredient.getServingSize() / goalServingSize;
    }

    /* cups to x */
    public double getFactorCupsToGrams(Ingredient ingredient, double goalServingSize) {
        double sizeInGrams = ingredient.getServingSize() * 200;
        return goalServingSize / sizeInGrams;
    }

    public double getFactorCupsToTbsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTbsp = ingredient.getServingSize() * 16;
        return goalServingSize / sizeInTbsp;
    }

    public double getFactorCupsToMl(Ingredient ingredient, double goalServingSize) {
        double sizeInMl = ingredient.getServingSize() * 236.588;
        return goalServingSize / sizeInMl;
    }

    public double getFactorCupsToTsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTsp = ingredient.getServingSize() * 48;
        return goalServingSize / sizeInTsp;
    }

    /* grams to x */
    public double getFactorGramsToCups(Ingredient ingredient, double goalServingSize) {
        double sizeInCups = ingredient.getServingSize() / 200;
        return goalServingSize / sizeInCups;
    }

    public double getFactorGramsToTsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTsp = ingredient.getServingSize() * 0.24;
        return goalServingSize / sizeInTsp;
    }

    public double getFactorGramsToTbsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTbsp = ingredient.getServingSize() / 14.3;
        return goalServingSize / sizeInTbsp;
    }

    public double getFactorGramsToMl(Ingredient ingredient, double goalServingSize) {
        double sizeInMl = ingredient.getServingSize() / 200;
        return goalServingSize / sizeInMl;
    }


    /* tbsp to x */

    public double getFactorTbspToTsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTsp = ingredient.getServingSize() / 3;
        return goalServingSize / sizeInTsp;
    }

    public double getFactorTbspToGrams(Ingredient ingredient, double goalServingSize) {
        double sizeInGrams = ingredient.getServingSize() * 21.25;
        return goalServingSize / sizeInGrams;
    }

    public double getFactorTbspToMl(Ingredient ingredient, double goalServingSize) {
        double sizeInMl = ingredient.getServingSize() * 14.7868;
        return goalServingSize / sizeInMl;
    }

    public double getFactorTbspToCups(Ingredient ingredient, double goalServingSize) {
        double sizeInCups = ingredient.getServingSize() * 0.0625;
        return goalServingSize / sizeInCups;
    }

    /* tsp to x */
    public double getFactorTspToCups(Ingredient ingredient, double goalServingSize) {
        double sizeInCups = ingredient.getServingSize() / 48;
        return goalServingSize / sizeInCups;
    }

    public double getFactorTspToGrams(Ingredient ingredient, double goalServingSize) {
        double sizeInGrams = ingredient.getServingSize() / 0.24;
        return goalServingSize / sizeInGrams;
    }

    public double getFactorTspToTbsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTbsp = ingredient.getServingSize() * 3;
        return goalServingSize / sizeInTbsp;
    }

    public double getFactorTspToMl(Ingredient ingredient, double goalServingSize) {
        double sizeInMl = ingredient.getServingSize() * 4.92892;
        return goalServingSize / sizeInMl;
    }

    /* ml to x */
    public double getFactorMlToCups(Ingredient ingredient, double goalServingSize) {
        double sizeInCups = ingredient.getServingSize() / 48;
        return goalServingSize / sizeInCups;
    }

    public double getFactorMlToGrams(Ingredient ingredient, double goalServingSize) {
        double sizeInGrams = ingredient.getServingSize() / 0.24;
        return goalServingSize / sizeInGrams;
    }

    public double getFactorMlToTbsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTbsp = ingredient.getServingSize() * 3;
        return goalServingSize / sizeInTbsp;
    }

    public double getFactorMlToTsp(Ingredient ingredient, double goalServingSize) {
        double sizeInTsp = ingredient.getServingSize() * 4.92892;
        return goalServingSize / sizeInTsp;
    }

}

