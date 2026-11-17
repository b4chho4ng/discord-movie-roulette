package com.movieroulette;

public class Movie {
    private String title;
    private int releaseYear;
    private String genre;
    private boolean watched;



    public Movie() {} //Empty Constructor



    //Name only constructor
    public Movie(String title) {
        this.title = title;
    }



    //Full Constructor
    public Movie(String title, int releaseYear, String genre, boolean watched) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.watched = watched;
    }



    //Constructor with only title and watched status
    public Movie(String title, boolean watched) {
        this.title = title;
        this.watched = watched;
    }


    //Basic getters
    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public String getGenre() {
        return genre;
    }
    public boolean isWatched() {
        return watched;
    }




    //Basic setters
    public void setTitle(String title) {
        this.title = title;
    } 
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setWatched(boolean watched) {
        this.watched = watched;
    }
}
