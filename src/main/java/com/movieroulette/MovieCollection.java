package com.movieroulette;

import java.util.ArrayList;
import java.util.Random;

public class MovieCollection {
    
    //Create an ArrayList to store movies
    private ArrayList<Movie> movies = new ArrayList<>();

    //Public method to add movies into the ArrayList 
    public void addMovie(Movie newMovie) {
        for (int i = 0; i < movies.size(); i++) {
            if (newMovie.getTitle().equalsIgnoreCase(movies.get(i).getTitle())) {
                System.out.println("This movie is already in the list!");
                return;
            }
        }
        movies.add(newMovie);
    }

    //Public method to list the movies in the ArrayList
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

    //Public method to remove a movie from the ArrayList
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

    //Public method to randomly select a movie from the list
    public Movie selectRandomMovie() {
        //Check if the movie list is empty beforehand
        if (movies.isEmpty()) {
            //System.out.println("Movie list is empty!");
            return null;
        }

        //Generate a random index for retrieval
        Random random = new Random();
        int movieIndex = random.nextInt(movies.size());
        Movie selectedMovie = movies.get(movieIndex);

        //System.out.println("The random movie for today is: " + selectedMovie.getTitle());
        return selectedMovie;
    }

}
