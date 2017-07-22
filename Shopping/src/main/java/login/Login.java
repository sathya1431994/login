package login;
public class Login
{
    String username,password;
   //getter & setter methods
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username=username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    public String toString()
    {
        return username+" "+password;
    }
}