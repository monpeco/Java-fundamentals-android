package edu.galileo.interface_example;

/**
 * Created by M on 05-03-2017.
 */
public class Main{

    public static void main(String[] args) {
        Car taxi = new Car(4);
        System.out.println("Taxi has wheels? " + taxi.hasWheels());
        System.out.println("Number of wheels? " + taxi.getNumberOfWheels());

        PokerCard eigthOfSpades = new PokerCard(4,8);
        PokerCard tenOfHearts = new PokerCard(3,10);
        PokerCard tenOfClubs = new PokerCard(2,10);

        System.out.println(eigthOfSpades.compareTo(tenOfHearts));
        System.out.println(tenOfHearts.compareTo(tenOfClubs));
        System.out.println(eigthOfSpades.compareTo(eigthOfSpades));

        /*output:
            Taxi has wheels? true
            Number of wheels? 4
            -1
            1
            0
        */
    }
}
