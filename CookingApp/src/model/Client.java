package model;
import static File.CookingFile.saveToFileRecipe;

public class Client extends User {
    
    Client(String role, String username, String passwd, String name, String surname, String email){
        setRole(role);
        setUsername(username);
        setPassword(passwd);
        setName(name);
        setSurname(surname);
        setEmail(email);        
    }
    
    public boolean postRecipe(Recipe recipe){
        return saveToFileRecipe(recipe);
    }
    
    public boolean postMenu(int id, String name, String description){
        Menu menu = new Menu(id,name,description);
        //return saveToFileRecipe(recipe);
        return true;
    }
    
    public boolean postRecipe(String name, int valuation){
        
        //return saveToFileRecipe(recipe);
        return true;
    }
    
   
    
    public void setRole(String role) {
        this.role = role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getRole() {
        return role;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
    
    
    
}
