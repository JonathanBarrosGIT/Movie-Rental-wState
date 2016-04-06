
public class Available extends MovieState{

    private static Available instance;
    private Available(){}

    public static Available instance(){
        if(instance == null){
            instance = new Available();
        }
        return instance;
    }

    public boolean renting(Movie movie){
        System.out.println("Renting the book: " + movie);
        movie.setState(Rented.instance());
        return true;
    }

    public void returning(Movie movie){
        System.out.println("I already have the book " + movie);
    }

    public String toString(){
        return "Available";
    }
}
