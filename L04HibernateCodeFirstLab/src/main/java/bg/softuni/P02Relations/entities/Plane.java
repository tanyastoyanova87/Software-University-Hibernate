package bg.softuni.P02Relations.entities;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "plane")
public class Plane extends Vehicle {

    @Column(name = "passenger_capacity")
    private Integer passengerCapacity;

    @Basic
    private String airline;

    @ManyToOne
    private Company company;

    public Plane() {
        super("plane");
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
}
