package bg.softuni.P02Relations.entities;

import javax.persistence.Basic;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "car")
public class Car extends Vehicle {
    @Basic
    private Integer seats;

    @OneToOne
    private PlateNumber plateNumber;

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
