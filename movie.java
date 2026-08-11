public class Movie {
    private int movieId;
    private String name;
    private String genre;
    private String language;
    private int duration;

    public Movie(int movieId, String name, String genre, String language, int duration) {
        this.movieId = movieId;
        this.name = name;
        this.genre = genre;
        this.language = language;
        this.duration = duration;
    }

    public int getMovieId() {
        return movieId;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return movieId + " | " + name + " | " + genre +
                " | " + language + " | " + duration + " mins";
    }
}
