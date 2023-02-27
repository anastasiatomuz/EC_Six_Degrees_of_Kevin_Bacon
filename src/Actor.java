import java.util.ArrayList;

public class Actor {
    private String name;
    private ArrayList<SimpleMovie> moviesStarred;

    public Actor(String name, SimpleMovie firstMovie){
        this.name = name;
        moviesStarred.add(firstMovie);
    }

    public void addMovie(SimpleMovie newMovie){
        moviesStarred.add(newMovie);
    }

    public ArrayList<SimpleMovie> getMoviesStarred(){
        return moviesStarred;
    }

    public String getName(){
        return name;
    }
}
