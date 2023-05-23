package com.example.cooking;

public class Dish {

    private String kitchen;
    private String name;
    private String description;
    private String ingredients;
    private String time;
    private String recipe;
    private int resource;

    public Dish(String kitchen, String name, String description, String ingredients, String time, String recipe, int resource) {

        this.kitchen = kitchen;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.time = time;
        this.recipe = recipe;
        this.resource = resource;

    }

    public String getKitchen() {
        return kitchen;
    }
    public void setKitchen() {
        this.kitchen = kitchen;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription() {
        this.description = description;
    }

    public String getIngredients() {
        return ingredients;
    }
    public void setIngredients() {
        this.ingredients = ingredients;
    }

    public String getTime() {
        return time;
    }
    public void setTime() {
        this.time = time;
    }

    public String getRecipe() {
        return recipe;
    }
    public void setRecipe() {
        this.recipe = recipe;
    }

    public int getResource() {
        return resource;
    }
    public void setResource() {
        this.resource = resource;
    }
}
