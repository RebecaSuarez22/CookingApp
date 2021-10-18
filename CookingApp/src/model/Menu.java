package model;

import java.util.ArrayList;

public class Menu {
    int id;
    String name;
    String description;
    public ArrayList<Recipe>recipes;
    
    Menu(int id, String name, String description){
        this.id = id;
        this.name = name;
        this.description = description;
        recipes = new ArrayList<Recipe>();
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRecipes(ArrayList<Recipe> recipes) {
        this.recipes = recipes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }
    


    
    
}
