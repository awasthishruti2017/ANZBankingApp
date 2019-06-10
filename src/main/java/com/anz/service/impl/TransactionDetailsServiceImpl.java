package com.anz.service.impl;

import com.anz.entity.TransactionDetails;
import com.anz.repository.TransactionDetailsRespository;
import com.anz.service.TransactionDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TransactionDetailsServiceImpl implements TransactionDetailsService {

    @Autowired
    private TransactionDetailsRespository  transactionDetailsRespository;

    @Override
    public List<TransactionDetails> getTransactionDetails(int accountId) {

        List<TransactionDetails> transactionDetails = transactionDetailsRespository.getTransactionDetails(accountId);
        return transactionDetails;
    }

}
