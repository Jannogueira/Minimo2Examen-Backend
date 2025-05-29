package edu.upc.dsa.models;

public class Insignia {
    String user;
    String name;
    String avatar;

    public Insignia() {
    }
    public Insignia(String user, String name, String avatar) {
        this.user = user;
        this.name = name;
        this.avatar = avatar;
    }
    public String getUser() {return user;}
    public void setUser(String user) {this.user = user;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAvatar() {return avatar;}
    public void setAvatar(String avatar) {this.avatar = avatar;}
}
