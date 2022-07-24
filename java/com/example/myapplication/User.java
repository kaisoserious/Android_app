package com.example.myapplication;

public class User {
    String name;
    String psw;

    public User(String name, String psw) {
        this.name = name;
        this.psw = psw;
    }
    @Override
    public String toString() {
        return "{" +
                "账号='" + name + '\'' +
                ", 密码='" + psw + '\'' +
                '}';
    }
}
