package bg.softuni.P05BillsPaymentSystem.entities;

import javax.persistence.*;

@Entity
@Table(name = "bank_accounts")
public class BankAccount extends BillingDetail {
    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "swift_code")
    private String swiftCode;

    @OneToOne(mappedBy = "bankAccount")
    private User user;

    public BankAccount() {
    }
}
