package com.example.controle_financeiro.model;

public class Balance {
    private double totalIncome;
    private double totalExpenses;
    private double netBalance;

    // Getters and Setters


    public double getTotalIncome() {
        return totalIncome;
    }

    public void setTotalIncome(double totalIncome) {
        this.totalIncome = totalIncome;
    }

    public double getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(double totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public double getNetBalance() {
        return netBalance;
    }

    public void setNetBalance(double netBalance) {
        this.netBalance = netBalance;
    }
}

