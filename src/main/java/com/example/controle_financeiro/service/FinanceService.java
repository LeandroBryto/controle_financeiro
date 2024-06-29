package com.example.controle_financeiro.service;

import com.example.controle_financeiro.model.Balance;
import com.example.controle_financeiro.model.Expense;
import com.example.controle_financeiro.model.Income;
import com.example.controle_financeiro.repository.ExpenseRepository;
import com.example.controle_financeiro.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceService {
    @Autowired
    private ExpenseRepository expenseRepository;
    @Autowired
    private IncomeRepository incomeRepository;

    public Expense addExpense(Expense expense) {
        return expenseRepository.save(expense);
    }

    public Income addIncome(Income income) {
        return incomeRepository.save(income);
    }

    public Balance getBalance() {
        List<Income> incomes = incomeRepository.findAll();
        List<Expense> expenses = expenseRepository.findAll();

        double totalIncome = incomes.stream().mapToDouble(Income::getAmount).sum();
        double totalExpenses = expenses.stream().mapToDouble(Expense::getAmount).sum();

        Balance balance = new Balance();
        balance.setTotalIncome(totalIncome);
        balance.setTotalExpenses(totalExpenses);
        balance.setNetBalance(totalIncome - totalExpenses);

        return balance;
    }
}

