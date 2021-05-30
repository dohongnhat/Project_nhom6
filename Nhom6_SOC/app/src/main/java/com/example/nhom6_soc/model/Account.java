package com.example.nhom6_soc.model;

public class Account {
    int id;
    String username;
    String password;
    String role;
    String address;

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Account() {
    }

    public Account(int id, String username, String password, String role, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
