package com.company.passport;

import java.util.Date;

/**
 * Created by M on 18-02-2017.
 */

public class TestPassport {

    public static void main(String[] args) {
        //Date(int year, int month, int date)
        Date birthDate = new Date(1987,0,22); //Remember to subtract 1 to the month
        Date expirationDate = new Date(2017,0,13);
        System.out.println("expirationDate.month: " + expirationDate.toString());

        long id = 1287564540101L;
        String Austrian = "Austrian";
        Passport myPassport = new Passport(id, "Conny", "Smith", Austrian, birthDate, expirationDate, 'F');
        boolean passportExpired = myPassport.isExpired();

        if (passportExpired == true) {
            System.out.println("You need to renew your passport");
        } else {
            System.out.println("Your passport is still valid");
        }
    }
}
