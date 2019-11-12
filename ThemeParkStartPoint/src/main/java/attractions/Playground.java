package attractions;

import people.Visitor;

public class Playground extends Attraction implements behaviours.ISecurity {

    public Playground(String name, int rating) {

        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 15) {
            return false;
        } return true;
    }
}
