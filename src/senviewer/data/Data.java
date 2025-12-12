package senviewer.data;

import senviewer.model.*;
import java.util.ArrayList;
import java.util.List;

public class Data {

    public static List<Movie> movies = new ArrayList<>();
    public static List<Serie> series = new ArrayList<>();
    public static List<Book> books = new ArrayList<>();
    public static List<Magazine> magazines = new ArrayList<>();

    public static void initializeData() {
        // Movies
        movies.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010));
        movies.add(new Movie("The Matrix", "Action", "The Wachowskis", 136, 1999));
        movies.add(new Movie("Interstellar", "Sci-Fi", "Christopher Nolan", 169, 2014));

        // Series
        series.add(new Serie("Breaking Bad", "Crime", 50));
        series.add(new Serie("Stranger Things", "Mystery", 25));
        series.add(new Serie("Game of Thrones", "Fantasy", 73));

        // Books
        books.add(new Book("1984", "1949", "Secker & Warburg", "1234567890"));
        books.add(new Book("To Kill a Mockingbird", "1960", "J.B. Lippincott & Co.", "0987654321"));

        // Magazines
        magazines.add(new Magazine("National Geographic", "2025-01-01", "NatGeo"));
        magazines.add(new Magazine("TIME", "2025-02-01", "Time Inc."));
    }
}
