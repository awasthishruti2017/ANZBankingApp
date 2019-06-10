package com.anz.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="TRANSACTION_DETAILS")
public class TransactionDetails implements Serializable {

    private static final long serialVersionUID = 7130245740714408942L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUST_ID", insertable = false, updatable = false)
    private int customer_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_NUMBER", insertable = false, updatable = false)
    private int accountNumber;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "VALUE_DATE")
    private Date valueDate;

    @Column(name = "CURRENCY")
    private String currency;

    @Column(name = "DEBIT_AMOUNT")
    private double debitAmount;

    @Column(name = "CREDIT_AMOUNT")
    private double creditAmoumt;

    @Column(name = "DEBIT_OR_CREDIT")
    private String debitOrCredit;

    @Column(name = "TRANSACTION_NARRATIVE")
    private String transactionNarrative;



    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(double debitAmount) {
        this.debitAmount = debitAmount;
    }

    public double getCreditAmoumt() {
        return creditAmoumt;
    }

    public void setCreditAmoumt(double creditAmoumt) {
        this.creditAmoumt = creditAmoumt;
    }

    public String getDebitOrCredit() {
        return debitOrCredit;
    }

    public void setDebitOrCredit(String debitOrCredit) {
        this.debitOrCredit = debitOrCredit;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }
}
