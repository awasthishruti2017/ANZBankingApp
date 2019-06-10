package com.anz.repository;

import com.anz.entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {

    @Query(value="SELECT * FROM ACCOUNT_DETAILS ad JOIN CUSTOMER_DETAILS cd ON (cd.id = ad.id) WHERE ad.id=?1 ", nativeQuery = true)
    List<AccountDetails> getAccountDetails(int customerId);
}
