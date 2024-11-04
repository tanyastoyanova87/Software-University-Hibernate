package bg.softuni.P02Relations.entities;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "drivers")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private BigInteger id;

    @Column(name = "full_name")
    private String fullName;

    @ManyToMany
    private Set<Truck> trucks;

    public Driver() {
        this.trucks = new HashSet<>();
    }
}
