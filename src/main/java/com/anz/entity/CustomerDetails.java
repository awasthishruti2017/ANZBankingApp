package com.anz.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table
public class CustomerDetails implements Serializable {

    private static final long serialVersionUID = 3128678690361520217L;

    @Id
    @Column(name = "CUST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "CUSTOMER_NAME")
    private String name;

    @OneToMany(targetEntity = AccountDetails.class, mappedBy = "CUST_ID", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<AccountDetails> accountDetails;

    @OneToMany(targetEntity = TransactionDetails.class, mappedBy ="CUST_ID" , orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<TransactionDetails> transactionDetails;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<AccountDetails> getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(Set<AccountDetails> accountDetails) {
        this.accountDetails = accountDetails;
    }

    public Set<TransactionDetails> getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(Set<TransactionDetails> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
