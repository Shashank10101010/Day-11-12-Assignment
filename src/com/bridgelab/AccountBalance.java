package com.bridgelab;

import java.util.Scanner;

public class AccountBalance {
    private static int amount = 5000;

    int getAmount() {
        return amount;
    }

    void Debit(int amount) {
        if (amount >= this.amount) {
            System.out.println("Debit amount exceeded account balance");
            return;
        }
        this.amount = this.amount - amount;
        System.out.println("Great! You have withdrawn your money, Remaining balance is now  : " + this.getAmount() + " Rs");
    }
}

class GetBalance extends AccountBalance {
    public static void main(String[] args) {
        GetBalance getBalance = new GetBalance();
        System.out.println(" Enter the amount that you want to withdraw : ");
        Scanner scanner = new Scanner(System.in);
        getBalance.Debit(scanner.nextInt());
    }
}


