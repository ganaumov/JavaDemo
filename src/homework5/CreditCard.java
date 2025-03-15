package homework5;

import java.util.Scanner;

public class CreditCard {
    int balance;
    int accountNumber;

    public CreditCard(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addBalance(int amount) {
        balance += amount;
    }

    public void minusBalance(int amount) {
        balance -= amount;
    }

    public void showInfo() {
        System.out.println("Информация о кредитной карте:");
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Текущий баланс: " + balance + " рублей");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}