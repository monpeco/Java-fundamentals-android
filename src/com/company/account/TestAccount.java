package com.company.account;

/**
 * Created by M on 18-02-2017.
 */
public class TestAccount {

    public static void main (String[] args){
        Account alice = new Account("Alice", 100);
        Account bob = new Account("Bob");

        System.out.println(alice); // prints variable location on JVM
        System.out.println(bob);
    }



}
