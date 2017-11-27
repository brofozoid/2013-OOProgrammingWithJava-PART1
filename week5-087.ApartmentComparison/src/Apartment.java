
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }
    
    public boolean larger(Apartment otherApart) {
        return (this.squareMeters > otherApart.squareMeters);
    }
    
    public int priceDifference(Apartment otherApart) {
        if (((this.squareMeters * this.pricePerSquareMeter) - (otherApart.squareMeters * otherApart.pricePerSquareMeter)) > 0) {
            return ((this.squareMeters * this.pricePerSquareMeter) - (otherApart.squareMeters * otherApart.pricePerSquareMeter));
        }
        return ((this.squareMeters * this.pricePerSquareMeter) - (otherApart.squareMeters * otherApart.pricePerSquareMeter)) * -1;
    }
    
    public boolean moreExpensiveThan(Apartment otherApart) {
        if (((this.squareMeters * this.pricePerSquareMeter) - (otherApart.squareMeters * otherApart.pricePerSquareMeter)) > 0) {
            return true;
        }
        return false;
    }
    
}
