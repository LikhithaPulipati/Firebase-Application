package com.example.likhi.fiirebaseapplication;

public class Model {
    String name,sroll;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSroll() {
        return sroll;
    }

    public void setSroll(String sroll) {
        this.sroll = sroll;
    }

    public Model(String name, String sroll) {
        this.name = name;
        this.sroll = sroll;
    }
}
