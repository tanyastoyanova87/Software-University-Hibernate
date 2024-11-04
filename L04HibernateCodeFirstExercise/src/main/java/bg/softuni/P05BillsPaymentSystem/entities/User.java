package bg.softuni.P05BillsPaymentSystem.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Basic
    private String email;

    @Basic
    private String password;

    @OneToMany(mappedBy = "user")
    private Set<BillingDetail> billingDetails;

    @OneToOne
    private CreditCard creditCard;

    @OneToOne
    private BankAccount bankAccount;

    public User() {
    }
}
