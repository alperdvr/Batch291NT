package java.d21oop;

import d21oop.Car;

public class Honda extends Car {

    public String model = "Civic";
    public int year = 2023;

    public Honda() {
        System.out.println("super.model = " + super.model);
        System.out.println("this.year = " + this.year);
        System.out.println("Civic");
    }
    public Honda(String model){ //2
        super();
        System.out.println("Accord");
    }

}
