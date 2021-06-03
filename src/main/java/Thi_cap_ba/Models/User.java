package Thi_cap_ba.Models;

import java.util.Date;

public class User {
   private int userID;
   private String name;
   private String pass;
   private String type;
   private Date creat;
   private Date update;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreat() {
        return creat;
    }

    public void setCreat(Date creat) {
        this.creat = creat;
    }

    public Date getUpdate() {
        return update;
    }

    public void setUpdate(Date update) {
        this.update = update;
    }

    public User(int userID, String name, String pass, String type, Date creat, Date update) {
        this.userID = userID;
        this.name = name;
        this.pass = pass;
        this.type = type;
        this.creat = creat;
        this.update = update;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", type='" + type + '\'' +
                ", creat=" + creat +
                ", update=" + update +
                '}';
    }
}