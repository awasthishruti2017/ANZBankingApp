package com.anz.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="ACCOUNT_DETAILS")
public class AccountDetails  implements Serializable {

    private static final long serialVersionUID = 7033072006266318342L;

    @Column(name="CUSTOMER_ID")
    private int id;

    @Column(name = "ACCOUNT_NUMBER")
    private int accountNumber;

    @Column(name = "ACCOUNT_NAME")
    private String name;

    @Column(name = "ACCOUNT_TYPE")
    private String type;

    @Column(name = "BALANCE_DATE")
    private Date balanceDate;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "OPENING_BALANCE")
    private double openingBalance;

    @OneToMany(targetEntity = TransactionDetails.class, mappedBy = "ACCOUNT_NUMBER", orphanRemoval = false, fetch = FetchType.LAZY)
    private Set<TransactionDetails> transactionDetails;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Set<TransactionDetails> getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(Set<TransactionDetails> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }
}
