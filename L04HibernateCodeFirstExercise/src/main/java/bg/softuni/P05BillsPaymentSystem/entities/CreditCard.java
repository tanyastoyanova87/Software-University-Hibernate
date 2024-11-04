package bg.softuni.P05BillsPaymentSystem.entities;

import javax.persistence.*;
import java.time.Month;
import java.time.Year;

@Entity
@Table(name = "credit_cards")
public class CreditCard extends BillingDetail {
    @Column(name = "card_type")
    private String cardType;

    @Column(name = "expiration_month")
    private Month expirationMonth;

    @Column(name = "expiration_year")
    private Year expirationYear;

    @OneToOne(mappedBy = "creditCard")
    private User user;

    public CreditCard() {
    }
}
