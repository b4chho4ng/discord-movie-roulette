package com.movieroulette;

public class App 
{
    public static void main( String[] args ) {

        MovieCollection movieCollection = new MovieCollection();

        movieCollection.addMovie(new Movie("Pulp Fiction"));
        movieCollection.addMovie(new Movie("American Beauty"));
        movieCollection.addMovie(new Movie("Mad Max: Fury Road"));
        //movieCollection.addMovie(new Movie("Mad Max: Fury Road"));

        movieCollection.listMovies();

        movieCollection.removeMovie("Pulp Fiction");
        movieCollection.listMovies();
    }
}
