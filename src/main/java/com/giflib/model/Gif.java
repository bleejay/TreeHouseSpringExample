package com.giflib.model;

import java.time.LocalDate;

public class Gif {

    private String name;
    private int categoryID;
    private LocalDate dateUploaded;
    private String username;
    private boolean favorite;

    public Gif(String name, int categoryID, LocalDate dateUploaded, String username, boolean favorite) {
        this.name = name;
        this.categoryID = categoryID;
        this.dateUploaded = dateUploaded;
        this.username = username;
        this.favorite = favorite;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(LocalDate dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favourite) {
        this.favorite = favourite;
    }

    public int getCategoryID() {return categoryID;}

    public void setCategoryID(int categoryID) { this.categoryID = categoryID; }
}
