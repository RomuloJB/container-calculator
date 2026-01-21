package com.container.calculator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.container.calculator.models.Calculation;

@Repository
public interface CalculationRepository extends JpaRepository<Calculation, Long> {
    
}
