package org.example;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private static int noOfTransitions;


    public BankAccount() {
        this.balance = 0;
        this.accountHolder = "_";
    }

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }


    public static void transfer(BankAccount account1 ,BankAccount account2 , int amount){
        if(account1.balance>=amount){
            account1.balance -= amount;
            account2.balance +=amount;
            noOfTransitions++;
        }else{
            System.out.println("Transaction : "+ noOfTransitions+ " Failed");

        }
    }

    public static int getNoOfTransitions() {
        return noOfTransitions;
    }
}
