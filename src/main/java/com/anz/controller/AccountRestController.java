package com.anz.controller;


import com.anz.entity.AccountDetails;
import com.anz.entity.TransactionDetails;
import com.anz.service.AccountDetailsService;
import com.anz.service.TransactionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountRestController {

    @Autowired
    private AccountDetailsService accountDetailsService;

    @Autowired
    private TransactionDetailsService transactionDetailsService;

    public void setAccountDetailsService(AccountDetailsService accountDetailsService) {
        this.accountDetailsService = accountDetailsService;
    }

    public void setTransactionDetailsService(TransactionDetailsService transactionDetailsService) {
        this.transactionDetailsService = transactionDetailsService;
    }

    @GetMapping("/api/accountNumberList/{customerId}")
    public List<AccountDetails> getAccountDetails(@PathVariable(name="customerId") int customerId){
        return accountDetailsService.getAccountDetails(customerId);
    }

    @GetMapping("/api/transactionList/{accountId}")
    public List<TransactionDetails> getTransactionDetails(@PathVariable(name="accounId") int accountId){
        return transactionDetailsService.getTransactionDetails(accountId);
    }
}
