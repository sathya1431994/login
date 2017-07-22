package dao;
import login.Login;
import java.util.*;
public interface Shopdao
{ 
     List<Login> login(String uname,String pass);
}

