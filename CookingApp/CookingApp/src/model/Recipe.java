package model;

import java.util.ArrayList;

public class Recipe {
    String id;
    String userName;
    String name;
    String description;
    TypeRecipe type;
    String ingredients;
    String time;
    Difficulty difficulty;   
    int likes;
    public ArrayList<Instruction>instructions;
            

    public Recipe(String id, String userName, String name,String description, TypeRecipe type, String ingredients, String time, Difficulty difficulty, int likes) {
        this.id = id;
        this.userName = userName;
        this.name = name;
        this.description = description;
        this.type = type;
        this.ingredients = ingredients;
        this.time = time;
        this.difficulty = difficulty;
        this.likes = likes;
    }
    
    public void addInstruction(Instruction instruction){
        this.instructions.add(instruction);
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void setUsername(String userName) {
        this.userName = userName;
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

    public void setTime(String time) {
        this.time = time;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }
    

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
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

    public String getTime() {
        return time;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }
    
    
    
}
