package com.rest.crud.repository;

import com.rest.crud.model.AccountBillPayee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountBillPayeeRepository extends JpaRepository<AccountBillPayee, String> {
}
