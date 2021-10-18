package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
            bw.write(recipe.getId() + "#"+ recipe.getUserName() + "#" + recipe.getName() + "#" + recipe.getDescription() + "#" + recipe.getType() + "#" + recipe.getIngredients() + "#" + recipe.getTime() + "#" + recipe.getDifficulty() + "#" +  "\n");
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
    
    public static boolean saveToFileInstruction(String id, String instruction){
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try{
            File file = new File("CookingInstruction.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write(id + "#" + instruction + "#" + "\n");
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

    public static int searchRecipe(String id){
        Scanner s = null;
        String idFind;
        int nLines=0;


	try {
            File file = new File("Cooking.txt");
            s = new Scanner(file);
            while (s.hasNextLine()) {
                    
                String line = s.nextLine(); 	
                char search = '#';
                    
                int firstCharID = 0;
                    
                while(line.charAt(firstCharID) != search){
                    firstCharID++;
                }
                
                idFind = line.substring(0, firstCharID);

                if(id.equals(idFind))
                    return nLines; 
                nLines++;
                             
            }
        return -1;          
            

	} catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
	} finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null)
		s.close();
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
	}
        return -1;
  
    }
    
    
    public static int numberOfRecipes() throws IOException{
        FileReader fr;
        int lNumeroLineas = 0;
        try {
            fr = new FileReader("Cooking.txt");
            BufferedReader bf = new BufferedReader(fr);            

            while ((bf.readLine())!=null) {
                lNumeroLineas++;
            }
            return lNumeroLineas;
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CookingFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException e){
            return 0;
        }
        
        return lNumeroLineas;
    }
    
    public static String[] idR = new String[100];
    public static String[] userNameR = new String[100];
    public static String[] nameR = new String[100];
    public static String[] descriptionR = new String[100];
    public static String[] typeR = new String[100];
    public static String[] ingredientsR = new String[100];
    public static String[] timeR = new String[100];
    public static String[] difficultyR = new String[100];
    
    
    
     /**********************************************************************
               Metodo que devuelve la información de una receta
     * @return 
    ***********************************************************************/
    public static String[] recipeData(){
        //String del tamaño del numero de datos que tenemos
        String[] datos = new String[9];
        File fichero = new File("Cooking.txt");
        Scanner s = null;
        int nnLinea = 0;

	try {
            // Leemos el contenido del fichero
            s = new Scanner(fichero);
            // Leemos linea a linea el fichero
            while (s.hasNextLine()) {
                    
                String linea = s.nextLine(); 	// Guardamos la linea en un String
                char buscar = '#';
                int usu = 0;
                int contra;
                int dni;
                int nombre;
                int apellido;
                int email;
                int telefono;
                int libros;
                   
                //id
                while(linea.charAt(usu) != buscar){
                    usu++;
                }
                idR[nnLinea]=linea.substring(0,usu); 
                contra=usu+1;
                
                //UserName
                while(linea.charAt(contra) != buscar){
                    contra++;
                }  
                userNameR[nnLinea]=linea.substring(usu+1,contra); 
                dni=contra+1;                   
                    
                    
                //Name
                while(linea.charAt(dni) != buscar){
                    dni++;
                } 
                nameR[nnLinea]=linea.substring(contra+1,dni); 
                nombre=dni+1;
                    
                    
                //Description
                while(linea.charAt(nombre) != buscar){
                    nombre++;
                } 
                descriptionR[nnLinea]=linea.substring(dni+1,nombre); 
                apellido=nombre+1;
                    
                    
                //Type
                while(linea.charAt(apellido) != buscar){
                    apellido++;
                } 
                typeR[nnLinea]=linea.substring(nombre+1,apellido); 
                email=apellido+1;
                    
                    
                //Ingredients
                while(linea.charAt(email) != buscar){
                    email++;
                } 
                ingredientsR[nnLinea]=linea.substring(apellido+1,email); 
                telefono=email+1;
                    
                    
                //Time
                while(linea.charAt(telefono) != buscar){
                    telefono++;
                } 
                timeR[nnLinea]=linea.substring(email+1,telefono); 
                libros=telefono+1;
                    
                    
                //Difficulty
                while(linea.charAt(libros) != buscar){
                    libros++;
                }
                difficultyR[nnLinea]=linea.substring(telefono+1,libros);                          
                nnLinea++;               
                    
            }
                    

	} catch (Exception ex) {
		System.out.println("Mensaje: " + ex.getMessage());
	} finally {
		// Cerramos el fichero tanto si la lectura ha sido correcta o no
		try {
			if (s != null)
				s.close();
		} catch (Exception ex2) {
			System.out.println("Mensaje 2: " + ex2.getMessage());
		}
	}
        return datos;
    }
    
    public static int nInstructions;
    public static String[] searchInstructions(String id){
        Scanner s = null;
        String idFind;
        String[] instructions = new String[15];
        String instruction;
        nInstructions = 0;


	try {
            File file = new File("CookingInstruction.txt");
            s = new Scanner(file);
            while (s.hasNextLine()) {
                    
                String line = s.nextLine(); 	
                char search = '#';
                    
                int firstCharID = 0;
                int firstCharI;
                    
                while(line.charAt(firstCharID) != search){
                    firstCharID++;
                }
                
                idFind = line.substring(0, firstCharID);
                
                firstCharI = firstCharID+1;
                        
                while(line.charAt(firstCharI) != search){
                    firstCharI++;
                }                    
                
                instruction = line.substring(firstCharID+1,firstCharI);

                if(id.equals(idFind)){
                    instructions[nInstructions] = instruction;
                    nInstructions++;
                }                    
                             
            }
        return instructions;          
            

	} catch (Exception ex) {
            System.out.println("Mensaje: " + ex.getMessage());
	} finally {
            // Cerramos el fichero tanto si la lectura ha sido correcta o no
            try {
                if (s != null)
		s.close();
            } catch (Exception ex2) {
                System.out.println("Mensaje 2: " + ex2.getMessage());
            }
	}
        return instructions;
  
    }
}


