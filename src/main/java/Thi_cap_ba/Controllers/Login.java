package Thi_cap_ba.Controllers;

import Thi_cap_ba.View.LoginAdmin;
import eBookShop.Models.User;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Login {
    public Login(LoginAdmin view) {
    }

    public boolean signIn() {
        User obj = new User();
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/de_thi", "root", "");
                Statement stmt = conn.createStatement();
        ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your username: ");
            String name = input.nextLine();
            System.out.println("Enter your password: ");
            String pass = input.nextLine();
            String select = "Select * from user where name ='" + name + "' AND pass ='" + pass + "'";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                int id = rset.getInt("userID");
                String username = rset.getString("name");
                String password=rset.getString("pass");
                String type=rset.getString("type");
                String create = rset.getString("create");
                String update=rset.getString("update");
                obj = new User(id,username,password,type,create,update);
            }
            System.out.println("Sign in successfully");
        }catch(SQLException ex){
            ex.printStackTrace();
            return false;
        }
        return true;
    }

}
