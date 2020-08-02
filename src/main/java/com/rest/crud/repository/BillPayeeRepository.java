package com.rest.crud.repository;

import com.rest.crud.model.BillPayee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillPayeeRepository extends JpaRepository<BillPayee, String> {
}
