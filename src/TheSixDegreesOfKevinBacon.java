import java.util.*;

public class TheSixDegreesOfKevinBacon {
    private ArrayList<SimpleMovie> movies;
    private ArrayList<ArrayList<String>> levelsOfActors;
    private ArrayList<ArrayList<SimpleMovie>> levelsOfMovies;
    private ArrayList<String> levelOneActors;
    private ArrayList<SimpleMovie> levelOneMovies;

    public TheSixDegreesOfKevinBacon(String fileName){
        this.movies = MovieDatabaseBuilder.getMovieDB(fileName);

        this.levelOneActors = new ArrayList<>();
        this.levelOneMovies = new ArrayList<>();
        makeLevelOne(); //in terms of actors
        makeNewLevel(levelsOfActors);
    }

    public void makeLevelOne(){
        ArrayList<SimpleMovie> moviesWithBacon = new ArrayList<>();
        for (SimpleMovie movie : movies){
            if (movie.getActors().contains("Kevin Bacon")){
                levelOneMovies.add(movie);
                levelOneActors.addAll(movie.getActors());
            }
        }
        Collections.sort(levelOneActors);//not necessary I think
    }

    public void makeNewLevel(ArrayList<String> actorNames){
        ArrayList<String> newLevelActor = new ArrayList<>();
        ArrayList<SimpleMovie> newLevelMovies = new ArrayList<>();
        for (String name : actorNames){

        }
    }

    public HashMap<ArrayList<String>, ArrayList>

    public ArrayList<Actor> generateNewLevel(ArrayList<Actor> actorsToBranchFrom){
        ArrayList<SimpleMovie> moviesFromActors = new ArrayList<>();
        ArrayList<Actor> actorListV2 = new ArrayList<>();
        for (Actor actor : actorsToBranchFrom){
            ArrayList<SimpleMovie> moviesActorStarred = actor.getMoviesStarred();
        }
        return actorListV2;
    }

    public ArrayList<SimpleMovie> toTest(){
        return movies;
    }

    public void dummyTesting(String nameToLookFor){
        String track = "";
        int degree = 0;
        if (levelOneActors.contains(nameToLookFor)){
            for (SimpleMovie movie : levelOneMovies){
                if (movie.getActors().contains(nameToLookFor)){
                    track = nameToLookFor  + " -> " + movie.getTitle() + " -> Kevin Bacon";
                    degree ++;
                }
            }
        }



        if (track.equals("")){
            System.out.println("not found");
        }else{
            System.out.println(track);
        }
    }

    public void sortMovies(ArrayList<SimpleMovie> moviesList){
            moviesList.sort(Comparator.comparing(SimpleMovie::getTitle));
    }



}
