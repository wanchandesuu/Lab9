package com.example.Lab9.repository;

import com.example.Lab9.model.DepositTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositRepository extends JpaRepository<DepositTransaction, Long> {
}
