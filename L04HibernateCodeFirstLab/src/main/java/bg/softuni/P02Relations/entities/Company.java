package bg.softuni.P02Relations.entities;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private BigInteger id;

    @Basic
    private String name;

    public Company() {
    }
}
