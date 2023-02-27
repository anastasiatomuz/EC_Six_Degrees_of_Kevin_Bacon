import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TheSixDegreesOfKevinBacon test = new TheSixDegreesOfKevinBacon("src/movie_data");
        ArrayList<SimpleMovie> movies = test.toTest();
//        for (SimpleMovie movie : movies) {
//            System.out.println(movie);
//        }
//        System.out.println("Number of movies: " + movies.size());
        test.dummyTesting("Lori Singer");



    }
}