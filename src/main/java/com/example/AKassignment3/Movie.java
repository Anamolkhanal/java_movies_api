package com.example.AKassignment3;

import jakarta.persistence.*;

/**
 * Represents a Movie entity for the movie collection.
 */
@Entity
@Table(name = "movies")
public class Movie {
    /**
     * The unique identifier for the movie.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * The title of the movie.
     */
    private String title;

    /**
     * The studio that produced the movie.
     */
    private String studio;

    /**
     * The genre of the movie.
     */
    private String genre;

    /**
     * The director of the movie.
     */
    private String director;

    /**
     * The writers of the movie (comma-separated).
     */
    private String writers;

    /**
     * The actors in the movie (comma-separated).
     */
    private String actors;

    /**
     * The release year of the movie.
     */
    private int year;

    /**
     * The running time of the movie in minutes.
     */
    private int runningTime;

    /**
     * A brief description of the movie.
     */
    private String description;

    /**
     * The MPA (Motion Picture Association) film rating (e.g., G, PG, R).
     */
    private String mpaRating;

    /**
     * A link to the movie poster.
     */
    private String posterLink;

    /**
     * The critics' rating for the movie.
     */
    private double criticsRating;

    /**
     * The rating of the movie (e.g., IMDb rating).
     */
    private double rating;

    // Constructors, getters, and setters

    public Movie() {}

    public Movie(String title, String studio, String genre, String director, String writers, String actors, int year, int runningTime, String description, String mpaRating, String posterLink, double criticsRating, double rating) {
        this.title = title;
        this.studio = studio;
        this.genre = genre;
        this.director = director;
        this.writers = writers;
        this.actors = actors;
        this.year = year;
        this.runningTime = runningTime;
        this.description = description;
        this.mpaRating = mpaRating;
        this.posterLink = posterLink;
        this.criticsRating = criticsRating;
        this.rating = rating;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getDirector() { return director; }
    public void setDirector(String director) { this.director = director; }

    public String getWriters() { return writers; }
    public void setWriters(String writers) { this.writers = writers; }

    public String getActors() { return actors; }
    public void setActors(String actors) { this.actors = actors; }

    public int getYear() { return year; }
    public void setYear(int year) { this.year = year; }

    public int getRunningTime() { return runningTime; }
    public void setRunningTime(int runningTime) { this.runningTime = runningTime; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getMpaRating() { return mpaRating; }
    public void setMpaRating(String mpaRating) { this.mpaRating = mpaRating; }

    public String getPosterLink() { return posterLink; }
    public void setPosterLink(String posterLink) { this.posterLink = posterLink; }

    public double getCriticsRating() { return criticsRating; }
    public void setCriticsRating(double criticsRating) { this.criticsRating = criticsRating; }

    public double getRating() { return rating; }
    public void setRating(double rating) { this.rating = rating; }
} 