package com.example.controle_financeiro.repository;

import com.example.controle_financeiro.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
