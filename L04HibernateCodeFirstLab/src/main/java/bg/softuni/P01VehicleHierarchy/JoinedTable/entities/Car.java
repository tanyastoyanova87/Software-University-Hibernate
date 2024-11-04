package bg.softuni.P01VehicleHierarchy.JoinedTable.entities;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue(value = "car")
public class Car extends Vehicle {
    @Basic
    private Integer seats;

    public Car() {
        super("car");
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }


}
