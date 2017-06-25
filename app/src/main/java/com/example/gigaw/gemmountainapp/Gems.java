package com.example.gigaw.gemmountainapp;

/**
 * Created by gigaw on 6/24/2017.
 */

public class Gems {
    private String description;
    private boolean found;
    private String name;

    public Gems() {
        found = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFound() {
        return found;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFound(boolean found) {
        this.found = found;
    }

    public void setName(String name) {
        this.name = name;
    }
}
