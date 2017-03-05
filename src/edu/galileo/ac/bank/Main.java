package edu.galileo.ac.bank;

/**
 * Created by M on 04-03-2017.
 */
public class Main {
    public static void main(String[] args){
        BankAccount a = new BankAccount(1234, 100.00);
        BankAccount b = new BankAccount(1255, 200.00);
        BankTeller john = new BankTeller();

        john.deposit(a, 100.00);
        ATM atm = new ATM(222);
        atm.withdraw(a, 50);
    }
}
