package java.d21oop;

import d21oop.Mammal;

public class Cat extends Mammal {

    public void meow() {
        System.out.println("Cats meow...");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their babies with milk...");
    }


}
