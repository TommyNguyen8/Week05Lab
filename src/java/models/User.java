package models;

/**
 *
 * @author 791662
 */
public class User 
{
    String user = "";
    String pass = "";
    
    public User()
    {
        
    }
    
    public User(String username, String password)
    {
        user = username;
        pass = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
