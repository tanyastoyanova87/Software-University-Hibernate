package bg.softuni.P02Relations.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "plate_numbers")
public class PlateNumber {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private BigInteger id;

    @Basic
    private String number;

    public PlateNumber() {
    }
}
