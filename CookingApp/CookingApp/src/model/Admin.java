package model;

import static file.UserFile.saveToFileAdmin;
import static file.UserFile.uniqueUser;

public class Admin extends User {
    
    Admin(String role, String username, String password, String name, String surname, String email){
        setRole(role);
        setUsername(username);
        setPasswd(password);
        setName(name);
        setSurname(surname);
        setEmail(email);       
    }
    
    //Mirar si se pasa Client o id
    //######
    public static boolean deleteClient(Client client){
        return false;
    }
    
    //Mirar si se pasa Recipe o id
    //######
    public static boolean deleteRecipe(Recipe recipe){
        return false;
    }
    
    public boolean addAdmin(String role, String username, String password, String name, String surname, String email){
        boolean unique = uniqueUser(username, email);
        if(unique){
            Admin admin= new Admin("2", username, passwd, name, surname, email); 
            saveToFileAdmin(admin);
        }
        return unique;
    }
    
    
}
