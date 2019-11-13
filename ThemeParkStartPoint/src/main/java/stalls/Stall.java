package stalls;

public abstract class Stall implements behaviours.IReviewed {

    private String name;
    private String ownerName;
    private int rating;
    private ParkingSpot parkingSpot;

    public Stall(String name, String ownerName, int rating, ParkingSpot parkingSpot) {
        this.name = name;
        this.ownerName = ownerName;
        this.rating = rating;
        this.parkingSpot = parkingSpot;
    }

    public String getName() {
        return name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getRating() { return rating; }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
