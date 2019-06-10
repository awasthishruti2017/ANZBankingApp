package com.anz.service;

import com.anz.entity.TransactionDetails;

import java.util.List;

public interface TransactionDetailsService {
    List<TransactionDetails> getTransactionDetails(int accountId);
}
