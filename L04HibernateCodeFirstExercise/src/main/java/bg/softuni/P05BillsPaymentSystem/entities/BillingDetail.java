package bg.softuni.P05BillsPaymentSystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "billing_details")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class BillingDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @Basic
    private String number;

    @Basic
    private String owner;

    @ManyToOne
    private User user;

    public BillingDetail() {
    }
}
