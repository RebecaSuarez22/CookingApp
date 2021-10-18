package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import model.Admin;
import model.Client;

@SuppressWarnings("empty-statement")
public class UserFile {
    public static void saveToFileClient(Client client){
        
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
        
            File file = new File("User.txt");
            // Si el archivo no existe, se crea!
            if (!file.exists()) {
                file.createNewFile();
            }
            // flag true, indica adjuntar información al archivo.
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            //codigo,estadoMaterial,sucursal,signatura,ISBN,titulo,genero,editorial,idioma,prestable,nDisponible
            bw.write("1" + "#" + client.getUsername() + "#" + client.getPasswd() + "#" + client.getName() + "#" + client.getSurname() + "#" + client.getEmail() + "#" +  "\n");
            
                    
        }  catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                        //Cierra instancias de FileWriter y BufferedWriter
                if (bw != null)
                bw.close();
                if (fw != null)
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
    }
    
    public static void saveToFileAdmin(Admin admin){
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try{
            File file = new File("User.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            bw.write("2" + "#" + admin.getUsername() + "#" + admin.getPasswd() + "#" + admin.getName() + "#" + admin.getSurname() + "#" + admin.getEmail() + "#" +  "\n");
            
        } catch(IOException e){
            e.printStackTrace();
        } finally {
            try{
                if(bw != null) bw.close();
                if(fw != null) fw.close();
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        
    }
    
    public static int numUser;
    public static boolean searchUser(String user, String passwd){
        Scanner s = null;
        String userFind;
        String passwdFind;
        int nLines=0;
        numUser = 0;

	try {
            File file = new File("User.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            s = new Scanner(file);
            while (s.hasNextLine()) {
                    
                String line = s.nextLine(); 	
                char search = '#';
                    
                int firstCharU = 2;
                int firstCharP;
                    
                while(line.charAt(firstCharU) != search){
                    firstCharU++;
                }
                
                userFind = line.substring(2, firstCharU);
                firstCharP = firstCharU+1;
                        
                while(line.charAt(firstCharP) != search){
                    firstCharP++;
                }
                    
                
                passwdFind = line.substring(firstCharU+1,firstCharP);
                if(user.equals(userFind) && passwd.equals(passwdFind))
                    return true; 
                nLines++;
                numUser++;
                                     
                                        
            }
        return false;          
            

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
        return false;
  
    }
    
    /**********************************************************************
         Metodo para devolver el rol de un usuario
     * @param user
     * @return 
    ***********************************************************************/
    public static String userRole(String user){
        Scanner s = null;
        String userFind;
        String roleFind;
        int nLines=0;
        numUser = 0;

	try {
            File file = new File("User.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            s = new Scanner(file);
            while (s.hasNextLine()) {
                    
                String line = s.nextLine(); 	
                char search = '#';
                    
                int firstCharU = 2;
             
                    
                while(line.charAt(firstCharU) != search){
                    firstCharU++;
                }
                
                userFind = line.substring(2, firstCharU);
                             
                roleFind = line.substring(0,1);
                
                if(user.equals(userFind))return roleFind;
                     
                  
                nLines++;
                numUser++;
                     
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
       
    return "-1";
    }
    
    
    /**********************************************************************
         Metodo que devuelve true si un usuario es unico
     * @param user
     * @param email
     * @return 
    ***********************************************************************/
    public static boolean uniqueUser(String user, String email){
        Scanner s = null;
        String userFind;
        String emailFind;
        int nLines=0;
        int count1 = 0;
        int count2 = 0;

	try {
            File file = new File("User.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            s = new Scanner(file);
            while (s.hasNextLine()) {
                    
                String line = s.nextLine(); 	
                char search = '#';
                    
                int charU = 2;
                int charE = 0;
                int charE2 = 0;
                
                        
                while(line.charAt(charU) != search){
                    charU++;
                }
                
                userFind = line.substring(2, charU);
                charE = charU;
                charE2 = charU;
                count1 = 2;
                count2 = 2;
                
                
                while(count1 < 5){
                    if(line.charAt(charE) == search){
                        count1++;
                    }
                    charE++;
                }
                
                 while(count2 < 6){
                    if(line.charAt(charE2) == search){
                        count2++;
                    }
                    charE2++;
                }
              
                emailFind = line.substring(charE+1, charE2-1);
                if(user.equals(userFind) || email.equals(emailFind))
                    return false; 
                nLines++;
                                     
                                        
            }
        return true;          
            

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
        return false;
  
    }
}
