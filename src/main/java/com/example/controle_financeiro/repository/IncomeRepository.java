package com.example.controle_financeiro.repository;


import com.example.controle_financeiro.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}

