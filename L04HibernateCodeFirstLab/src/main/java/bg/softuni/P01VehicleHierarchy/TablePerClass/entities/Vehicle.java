package bg.softuni.P01VehicleHierarchy.TablePerClass.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "vehicle")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private long id;

    @Basic
    private String type;

    @Basic
    private String model;

    @Basic
    private BigDecimal price;

    @Column(name = "fuel_type")
    private String fuelType;

    protected Vehicle() {
    }

    protected Vehicle(String type) {
        this.fuelType = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
