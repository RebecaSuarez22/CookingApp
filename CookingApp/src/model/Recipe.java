package model;

import java.util.ArrayList;

public class Recipe {
    int id;
    String name;
    String description;
    TypeRecipe type;
    String ingredients;
    int time;
    Difficulty difficulty;    
    public ArrayList<Instruction>instructions;
            

    public Recipe(int id, String name,String description, TypeRecipe type, String ingredients, int time, Difficulty difficulty) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.type = type;
        this.ingredients = ingredients;
        this.time = time;
        this.difficulty = difficulty;
    }
    
    public void addInstruction(Instruction instruction){
        this.instructions.add(instruction);
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

    public void setType(TypeRecipe type) {
        this.type = type;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
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
    
    public TypeRecipe getType() {
        return type;
    }

    public String getIngredients() {
        return ingredients;
    }

    public int getTime() {
        return time;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
    
    
    
}
