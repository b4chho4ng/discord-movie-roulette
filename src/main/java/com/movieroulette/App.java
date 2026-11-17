package com.movieroulette;

public class App 
{
    public static void main( String[] args ) {

        MovieCollection movieCollection = new MovieCollection();

        movieCollection.addMovie(new Movie("Pulp Fiction", 1995, "crime", true));
        movieCollection.addMovie(new Movie("Mad Max: Fury Road", true));
        movieCollection.addMovie(new Movie("Stalker", false));
        movieCollection.addMovie(new Movie("A Few Good Man", false));
        movieCollection.addMovie(new Movie("Leon: The Professional", false));

        Movie randomMovie = movieCollection.getRandomMovie();
        System.out.println(randomMovie.getTitle());

        movieCollection.markMovieAsWatched(randomMovie.getTitle());

        Movie anotherRandomMovie = movieCollection.getRandomMovie();
        System.out.println(anotherRandomMovie.getTitle());

    }
}
