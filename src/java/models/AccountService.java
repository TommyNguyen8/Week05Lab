package models;

/**
 *
 * @author 791662
 */
public class AccountService 
{         
    public User login(String username, String password)
    {
        if(username.equals("abe") || username.equals("barb"))
        {
            if(password.equals("password"))
            {
                password = null;
                User user = new User(username, password);
            
                return user;
            }
        }

        return null;
    }
}
