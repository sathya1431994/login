package dao;
import login.Login;
import order.Order;
import java.util.*;
import java.sql.*;
public interface Shopdao
{ 
    List<Login> login(String uname,String pass);
    void register(Login l);
    ResultSet order();
    ResultSet login_entries();
    void delete(String uname);
    void insert(Order or);
    void delete_items(String gname);
    void update(Order or);
}

