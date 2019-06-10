package com.anz.repository;


import com.anz.entity.TransactionDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionDetailsRespository extends JpaRepository<TransactionDetails, Integer> {

    @Query(value="SELECT * FROM TRANSACTION_DETAILS td JOIN ACCOUNT_DETAILS ad ON (ad.ACCOUNT_NUMBER = td.ACCOUNT_NUMBER) WHERE ad.id=?1 ", nativeQuery = true)
    List<TransactionDetails> getTransactionDetails(int accountId);

}
