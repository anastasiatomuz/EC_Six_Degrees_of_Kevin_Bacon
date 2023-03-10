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
        this.levelsOfMovies = new ArrayList<>();
        this.levelsOfActors = new ArrayList<>();
        makeLevelOne(); //in terms of actors
        ArrayList<String> newlyCreatedActors = makeNewLevel(levelOneActors);
        for (int i = 0; i < 4; i ++){
            newlyCreatedActors = makeNewLevel(newlyCreatedActors);
        }
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
        levelsOfActors.add(levelOneActors);
        levelsOfMovies.add(levelOneMovies);
    }

    public ArrayList<String> makeNewLevel(ArrayList<String> actorNames){
        ArrayList<String> newLevelActor = new ArrayList<>();
        ArrayList<SimpleMovie> newLevelMovies = new ArrayList<>();
        for (String name : actorNames){
            for (SimpleMovie movie : movies){
                if (movie.getActors().contains(name)){
                    newLevelMovies.add(movie);
                    newLevelActor.addAll(movie.getActors());
                }
            }
        }
        levelsOfMovies.add(newLevelMovies);
        levelsOfActors.add(newLevelActor);
        return newLevelActor;
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
        ArrayList<String> track = new ArrayList<>();
        track.add(nameToLookFor);
        int degree = 0;
        boolean found = false;
        while (!found && degree < 6){
            if (levelsOfActors.get(degree).contains(nameToLookFor)){
                for (SimpleMovie movie : levelsOfMovies.get(degree)){
                    if (movie.getActors().contains(nameToLookFor)){
                        track.add(movie.getTitle());
                    }
                }
            }
            degree ++;
        }
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
