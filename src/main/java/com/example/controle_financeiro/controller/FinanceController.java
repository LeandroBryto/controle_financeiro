package com.example.controle_financeiro.controller;



import com.example.controle_financeiro.model.Balance;
import com.example.controle_financeiro.model.Expense;
import com.example.controle_financeiro.model.Income;
import com.example.controle_financeiro.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class FinanceController {
    @Autowired
    private FinanceService financeService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add-expense")
    public String showAddExpenseForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "add-expense";
    }

    @PostMapping("/api/finance/expense")
    public String addExpense(@ModelAttribute Expense expense) {
        financeService.addExpense(expense);
        return "redirect:/";
    }

    @GetMapping("/add-income")
    public String showAddIncomeForm(Model model) {
        model.addAttribute("income", new Income());
        return "add-income";
    }

    @PostMapping("/api/finance/income")
    public String addIncome(@ModelAttribute Income income) {
        financeService.addIncome(income);
        return "redirect:/";
    }

    @GetMapping("/balance")
    public String getBalance(Model model) {
        Balance balance = financeService.getBalance();
        model.addAttribute("balance", balance);
        return "balance";
    }
}
