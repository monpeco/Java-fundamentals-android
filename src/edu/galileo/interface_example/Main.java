package edu.galileo.interface_example;

/**
 * Created by M on 05-03-2017.
 */
public class Main{

    public static void main(String[] args) {
        Car taxi = new Car(4);
        System.out.println("Taxi has wheels? " + taxi.hasWheels());
        System.out.println("Number of wheels? " + taxi.getNumberOfWheels());
    }
}
