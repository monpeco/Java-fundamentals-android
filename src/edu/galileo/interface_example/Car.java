package edu.galileo.interface_example;

import edu.galileo.Vehicle;

/**
 * Created by M on 05-03-2017.
 */
public class Car implements Vehicle {
    public String transportType = "Terrestral";
    public int wheels;

    public Car(int wheels){
        this.wheels = wheels;
    }

    public String getTransportType(){
        return this.transportType;
    }

    public boolean hasWheels(){
        return wheels>0;
    }

    public int getNumberOfWheels(){
        return wheels;
    }
}
