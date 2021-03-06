package com.thoughtworks.accountbalance;

/**
 * Created by dan on 6/13/15.
 */
public class Account {
    private int balance;

    Account(int startingBalance){
        this.balance = startingBalance;
    }

    public void credit(int creditAmount){
        this.balance += creditAmount;
    }

    public void debit(int debitAmount){
        if((balance-debitAmount) >= 0){
            this.balance -= debitAmount;
        }
    }

    public int getBalance(){
        return this.balance;
    }
}
