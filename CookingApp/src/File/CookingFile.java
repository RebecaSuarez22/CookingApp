package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import model.User;
import model.Admin;
import model.Client;
import model.Recipe;


public class CookingFile {
    public static boolean saveToFileRecipe(Recipe recipe){
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try{
            File file = new File("Cooking.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(recipe.getId() + "#" + recipe.getName() + "#" + recipe.getDescription() + "#" + recipe.getType() + "#" + recipe.getIngredients() + "#" + recipe.getTime() + "#" + recipe.getDifficulty() + "#" +  "\n");
            return true;
            
        } catch(IOException e){
            e.printStackTrace();
            return false;
        } finally {
            try{
                if(bw != null) bw.close();
                if(fw != null) fw.close();
            } catch(IOException e){
                e.printStackTrace();                
            }
        }
        
    }
}


