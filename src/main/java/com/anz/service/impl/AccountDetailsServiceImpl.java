package com.anz.service.impl;

import com.anz.entity.AccountDetails;
import com.anz.repository.AccountDetailsRepository;
import com.anz.service.AccountDetailsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AccountDetailsServiceImpl implements AccountDetailsService {

    @Autowired
    private AccountDetailsRepository accountDetailsRepository;

    @Override
    public List<AccountDetails> getAccountDetails(int customerId) {

        List<AccountDetails> accountDetails =accountDetailsRepository.getAccountDetails(customerId);
        return accountDetails;
    }
}
