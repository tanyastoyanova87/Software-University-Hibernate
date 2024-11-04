package bg.softuni.P01VehicleHierarchy.JoinedTable.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "truck")
public class Truck extends Vehicle {
    @Column(name = "load_capacity")
    private Double loadCapacity;

    public Truck() {
        super("type");
    }

    public Double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(Double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
