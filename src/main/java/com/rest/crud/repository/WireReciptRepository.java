package com.rest.crud.repository;

import com.rest.crud.model.WireRecipt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WireReciptRepository extends JpaRepository<WireRecipt, String> {
}
