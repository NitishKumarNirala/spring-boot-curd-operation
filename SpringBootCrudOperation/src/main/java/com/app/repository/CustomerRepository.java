package com.app.repository;

import javax.persistence.RollbackException;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Customerdetail;

@Repository
@Transactional(rollbackOn=RollbackException.class)
public interface CustomerRepository extends JpaRepository<Customerdetail, Long> {

}
