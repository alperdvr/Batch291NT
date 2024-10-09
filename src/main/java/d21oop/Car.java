package d21oop;

public class Car extends Vehicle {

    public Car(){
        super();
        System.out.println("Sedan");
    }
    public Car(String tip){
        super("Honda", 2024, "Elektrikli");
        System.out.println("Sport");

    }

}