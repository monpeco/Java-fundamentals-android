package com.company.account;

/**
 * Created by M on 18-02-2017.
 */
public class Account {
    public static int nextAccoutn=1;

    public String name;
    public int accountNumber;
    public int balance;

    public Account(String _name){
        name = new String(_name);
        accountNumber = nextAccoutn;
        balance = 0;

        nextAccoutn++;
    }

    public Account(String _name, int _balance){
        name = new String(_name);
        accountNumber = nextAccoutn;
        balance = _balance;

        nextAccoutn++;
    }

    public void deposit (int _deposit){
        balance = balance + _deposit;
    }

    public String toString(){
        return "\nname: " + name + "\naccount: "+ accountNumber + "\nbalance:" + balance;
    }
}
