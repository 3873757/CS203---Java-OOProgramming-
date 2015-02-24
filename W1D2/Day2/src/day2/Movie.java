package day2;

public class Movie {

    String title;
    String genre;
    int rating;

    public Movie(String title, String genre, int rating) {

        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String toString() {
        return "Title of the Movie is:  " + title + " Genre of the movie is : " + genre + "  Rate of the movie is : " + rating;
    }

    void playIt() {
        System.out.println("Playing the moie");
    }
}