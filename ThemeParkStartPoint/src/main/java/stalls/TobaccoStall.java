package stalls;

import people.Visitor;

public class TobaccoStall extends Stall implements behaviours.ISecurity {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {

        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() < 18) {
            return false;
        } return true;
    }
}
