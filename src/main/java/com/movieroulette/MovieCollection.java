package com.movieroulette;

import java.util.ArrayList;
import java.util.Random;

public class MovieCollection {
    
    //CREATE AN ARRAYLIST TO STORE ALL THE MOVIES
    private ArrayList<Movie> movies = new ArrayList<>();


    
    //PUBLIC METHOD TO ALL NEW MOVIES INTO THE MOVIE LIST
    public void addMovie(Movie newMovie) {
        for (int i = 0; i < movies.size(); i++) {
            if (newMovie.getTitle().equalsIgnoreCase(movies.get(i).getTitle())) {
                System.out.println("This movie is already in the list!");
                return;
            }
        }
        movies.add(newMovie);
    }


    
    //PUBLIC METHOD TO LIST ALL MOVIES IN THE LIST
    public void listMovies() {
        if (movies.isEmpty()) {
            System.out.println("The list is empty!");
            return;
        }
        System.out.println("The movie list contains: ");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }


    
    //PUBLIC METHOD TO REMOVE A MOVIE FROM THE LIST
    public void removeMovie(String title) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().equalsIgnoreCase(title)) {
                movies.remove(i);
                System.out.println("Movie removed!");
                return;
            }
        }
        System.out.println("Movie not found:(");
    }
    


    //PUBLIC METHOD TO MAKE A LIST OF MOVIES YOU HAVENT WATCHED
    public ArrayList<Movie> getUnwatchedMovies() {
        ArrayList<Movie> unwatchedMovies = new ArrayList<>();
        for (int i = 0; i < movies.size(); i++) {
            if (!movies.get(i).isWatched()) {
                unwatchedMovies.add(movies.get(i));
            }
        }
        return unwatchedMovies;
    }



    //PUBLIC METHOD TO RANDOMLY SELECT A MOVIE FROM THE UNWATCHED LIST
    public Movie getRandomMovie() {
        //Get unwatched movie list first
        ArrayList<Movie> unwatchedMovies = getUnwatchedMovies();
        //Check if the movie list is empty beforehand
        if (unwatchedMovies.isEmpty()) {
            return null;
        }

        //Generate a random index for retrieval
        Random random = new Random();
        int movieIndex = random.nextInt(unwatchedMovies.size());
        Movie selectedMovie = unwatchedMovies.get(movieIndex);

        //System.out.println("The random movie for today is: " + selectedMovie.getTitle());
        return selectedMovie;
    }




    //PUBLIC METHOD TO MARK A MOVIE STATUS TO WATCHED
    public void markMovieAsWatched(String title) {
        for (int i = 0; i < movies.size(); i++) {
            if (movies.get(i).getTitle().equalsIgnoreCase(title)) {
                if (!movies.get(i).isWatched()) {
                    movies.get(i).setWatched(true);
                    System.out.println("You have finished watching this movie!");
                }
                else {
                    System.out.println("You have already watched this movie!");
                }
                return;
            }
        } 
        System.out.println("Can not find movie");
    }





}
