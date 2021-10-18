package model;
import static file.CookingFile.saveToFileRecipe;


public class Client extends User {
    
    Client(String role, String username, String passwd, String name, String surname, String email){
        setRole(role);
        setUsername(username);
        setPasswd(passwd);
        setName(name);
        setSurname(surname);
        setEmail(email);        
    }
    
    public static boolean postRecipe(String id, String username, String name, String description, TypeRecipe type, String ingredients, String time, Difficulty difficulty){
        Recipe recipe = new Recipe(id, username,name, description, type, ingredients, time, difficulty,0);
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
    
   
    
    @Override
    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
    public String getRole() {
        return role;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPasswd() {
        return passwd;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }
    
    
    
}
