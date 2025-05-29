package edu.upc.dsa.models;

public class Insignias {
    int id;
    String user;
    String name;
    String avatar;

    public Insignias() {
    }
    public Insignias(String user, String name, String avatar) {
        this.user = user;
        this.name = name;
        this.avatar = avatar;
    }
    public Insignias(int id, String user, String name, String avatar) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.avatar = avatar;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getUser() {return user;}
    public void setUser(String user) {this.user = user;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getAvatar() {return avatar;}
    public void setAvatar(String avatar) {this.avatar = avatar;}
}
