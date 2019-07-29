package com.deepesh.customlistadapter;

public class User {

    int icon;
    String name;

    public User() {
    }

    public User(int icon, String name) {
        this.icon = icon;
        this.name = name;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "icon=" + icon +
                ", name='" + name + '\'' +
                '}';
    }
}
