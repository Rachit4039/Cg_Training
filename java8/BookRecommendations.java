import java.util.*;
import java.util.stream.Collectors;

class Book {
    private String title;
    private String author;
    private String genre;
    private double rating;

    public Book(String title, String author, String genre, double rating) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }
}

class BookRecommendation {
    private String title;
    private double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + " (Rating: " + rating + ")";
    }
}

public class BookRecommendations {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Dune", "Frank Herbert", "Science Fiction", 4.5),
                new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.2),
                new Book("Neuromancer", "William Gibson", "Science Fiction", 4.1),
                new Book("Hyperion", "Dan Simmons", "Science Fiction", 4.6),
                new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.3),
                new Book("1984", "George Orwell", "Dystopian", 4.4)
        );

        int pageNumber = 1; 
        int pageSize = 5;

        List<BookRecommendation> recommendations =
                books.stream()
                        .filter(b -> b.getGenre().equals("Science Fiction"))
                        .filter(b -> b.getRating() > 4.0)
                        .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                        .sorted(Comparator.comparingDouble(BookRecommendation::getRating).reversed())
                        .limit(10)
                        .skip((long) (pageNumber - 1) * pageSize)
                        .limit(pageSize)
                        .collect(Collectors.toList());

        System.out.println("Book Recommendations (Page " + pageNumber + "):");
        recommendations.forEach(System.out::println);
    }
}
