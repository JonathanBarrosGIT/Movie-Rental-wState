
public abstract class MovieState {
    public abstract void returning(Movie movie);
    public abstract boolean renting(Movie movie);

    public String toString(){
        return "Unknown";
    }
}
