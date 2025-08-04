package com.example.AKassignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public Movie createMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Optional<Movie> updateMovie(Long id, Movie movieDetails) {
        return movieRepository.findById(id).map(movie -> {
            movie.setTitle(movieDetails.getTitle());
            movie.setDirector(movieDetails.getDirector());
            movie.setGenre(movieDetails.getGenre());
            // Add other fields as needed
            return movieRepository.save(movie);
        });
    }

    public boolean deleteMovie(Long id) {
        return movieRepository.findById(id).map(movie -> {
            movieRepository.delete(movie);
            return true;
        }).orElse(false);
    }
} 