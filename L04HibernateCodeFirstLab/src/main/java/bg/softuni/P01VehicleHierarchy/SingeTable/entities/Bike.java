package bg.softuni.P01VehicleHierarchy.SingeTable.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value = "bike")
public class Bike extends Vehicle {

    public Bike() {
        super("bike");
    }
}
