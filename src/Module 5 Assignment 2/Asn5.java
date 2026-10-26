import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<String>();
        ArrayList<Double> ratings = new ArrayList<Double>();

        movies.add("Spider-Man: Brand New Day");
        movies.add("The Odyssey");
        movies.add("Michael");
        movies.add("Obsession");

        ratings.add(9.0);
        ratings.add(8.0);
        ratings.add(6.5);
        ratings.add(10.0);

        System.out.println("=== Original list ===");
        System.out.println("Movies:");
        for (String movie : movies) {
            System.out.println("  " + movie);
        }
        System.out.println("Ratings:");
        for (Double rating : ratings) {
            System.out.println("  " + rating);
        }

        movies.set(1, "Moana");
        ratings.set(1, 9.0);
        movies.remove(0);
        ratings.remove(0);

        System.out.println();
        System.out.println("=== After changes ===");
        System.out.println("Movies:");
        for (String movie : movies) {
            System.out.println("  " + movie);
        }
        System.out.println("Ratings:");
        for (Double rating : ratings) {
            System.out.println("  " + rating);
        }
    }
}
