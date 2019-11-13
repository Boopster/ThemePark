package attractions;

import people.Visitor;

public class Dodgems extends Attraction implements behaviours.ITicketed {

    private double defaultPrice;

    public Dodgems(String name, int rating) {

        super(name, rating);
        this.defaultPrice = 4.50;
    }


    public double defaultPrice() {
        return this.defaultPrice;
    }

    public double priceForVisitor(Visitor visitor) {
        if (visitor.getAge() < 12) {
            return defaultPrice()/2;
        } return defaultPrice();
    }
}


