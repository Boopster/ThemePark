package attractions;

import people.Visitor;

public class RollerCoaster extends Attraction implements behaviours.ISecurity, behaviours.ITicketed {

    private double defaultPrice;

    public RollerCoaster(String name, int rating) {

        super(name, rating);
        this.defaultPrice = 8.40;
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() > 12 && visitor.getHeight() > 145.00) {
            return true;
        } return false;
    }

    public double defaultPrice() {
         return this.defaultPrice;
    }

    public double priceForVisitor(Visitor visitor) {
        if (visitor.getHeight() > 200.00) {
            return defaultPrice() * 2;
        } return defaultPrice();
    }
}
