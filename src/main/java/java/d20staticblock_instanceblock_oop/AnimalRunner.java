package java.d20staticblock_instanceblock_oop;

import d20staticblock_instanceblock_oop.Bird;
import d20staticblock_instanceblock_oop.Dog;

public class AnimalRunner {
    public static void main(String[] args) {

        d20staticblock_instanceblock_oop.Dog d = new Dog();
        d.feedWithMilk(); //Mammals feed their babies with milk...
        d.drink(); //Animals drink...

        d20staticblock_instanceblock_oop.Bird b = new Bird();
        b.tweet(); //Birds tweet...
        b.eat(); //Animals eat...

    }
}
