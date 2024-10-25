package java.d21oop;

import d21oop.Vehicle;

public class Car extends Vehicle {

    public String model = "Accord";
    public int year = 2024;

    public Car(){
        this("Sport");
        System.out.println("Sedan");
    }
    public Car(String tip){
        super();
        System.out.println("Sport");
    }

}
