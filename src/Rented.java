/**
 * Created by JoãoGabriel on 04/04/2016.
 */
public class Rented {
    private static Rented instance;

    private Rented() {}

    public static Rented instance(){
        if(instance == null){
            instance = new Rented();
        }
        return instance;
    }

    public boolean renting(Movie movie){
        System.out.println("The Movie " + movie + " is not available.");
        return false;
    }

    public void returning(Movie movie){
        System.out.println("Ok, the Movie " + movie + " was returned.");
        movie.setState(Available.instance());
    }

    public String toString(){
        return "Rented";
    }
}
