package com.movieroulette;

public class App 
{
    public static void main( String[] args ) {

        MovieCollection movieCollection = new MovieCollection();

        movieCollection.addMovie(new Movie("Pulp Fiction"));
        movieCollection.addMovie(new Movie("American Beauty"));
        movieCollection.addMovie(new Movie("Mad Max: Fury Road"));
        //movieCollection.addMovie(new Movie("Mad Max: Fury Road"));

        Movie selectedMovie = movieCollection.selectRandomMovie();
        if (selectedMovie != null) {
            System.out.println(selectedMovie.getTitle());
        } else {
            System.out.println("No movie available!");
        }
    }
}
