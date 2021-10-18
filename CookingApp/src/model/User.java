package model;
import static File.UserFile.saveToFileClient;
import static File.UserFile.searchUser;
import static File.UserFile.uniqueUser;
import model.Recipe;

public abstract class User {
    String role;
    String username;
    String passwd;
    String name;
    String surname;
    String email;
    
    public static boolean logIn(String username, String passwd){
        boolean find = searchUser(username, passwd);
        return find;
    }
    
    public static boolean singIn(String role, String username, String passwd, String name, String surname, String email){
        boolean unique = uniqueUser(username, email);
        if(unique){
            Client client= new Client("1", username,passwd,name,surname,email); 
            saveToFileClient(client);
        }
        return unique;
    }
    
 
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPasswd() {
        return passwd;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPassword(String passwd) {
        this.passwd = passwd;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
