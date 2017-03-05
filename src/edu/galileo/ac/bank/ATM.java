package edu.galileo.ac.bank;

/**
 * Created by M on 04-03-2017.
 */
public class ATM {
    private int id;

    public ATM(int id){
        this.id = id;
    }

    public void withdraw(BankAccount account, double amount){
        boolean result = account.withdraw(amount);
        if(result){
            System.out.println("Succesful withdraw on ATM of $" + amount);
        }else{
            System.out.println("Error on ATM");
        }

    }
}
