package com.company.passport;

/**
 * Created by M on 18-02-2017.
 */
import java.util.Date;

public class Passport {
    long passportNumber;
    String lastName, firstNames, nationality;
    Date dateBirth, expirationDate;
    char gender; //'F' for female, 'M' for male

    public Passport (long id, String first, String last, String nationality, Date birthdate, Date expiration, char gender) {
        this.passportNumber = id;
        this.lastName = last;
        this.firstNames = first;
        this.nationality = nationality;
        dateBirth = birthdate;
        expirationDate = expiration;
        this.gender = gender;
    }

    public char getGender() {
        return this.gender;
    }

    public String getFullName() {
        return this.firstNames + " " + this.lastName;
    }

    public boolean isExpired() {
        Date today = new Date();

        //the current year represented by this date, minus 1900 for today.
        int currentYear = today.getYear() + 1900;
        System.out.println("currentYear: "+currentYear);

        int expirationYear = expirationDate.getYear();

        if (expirationYear < currentYear) {
            return true;
        }

        if (currentYear == expirationYear) {
            int currentMonth = today.getMonth();
            int expirationMonth = expirationDate.getMonth();
            if (currentMonth > expirationMonth) {
                return true;
            } else if (currentMonth == expirationMonth) {
                int currentDay = today.getDate();
                int expirationDay = expirationDate.getDate();
                if (currentDay >= expirationDay) {
                    return true;
                }
            }
        }
        return false;
    }
}