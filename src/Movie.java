
public class Movie {

    private StateMovie state;

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private final String title;
    private int priceCode;

    public Movie(final String title, final int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
        this.state = Available.instance();
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(final int priceCode) {
        this.priceCode = priceCode;
    }

    public void returning(){
        this.state.returning(this);
    }

    public boolean renting(){
        return this.state.renting(this);
    }

    public void setState(StateMovie state){
        System.out.println("Turning state from " + this.state + " to " + state);
        this.state = state;
    }

    public String toString(){
        return (this.title + " (" + this.state + ")");
    }

}
