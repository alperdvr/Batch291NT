package java.d21oop;

import d21oop.Bird;
import d21oop.Cat;
import d21oop.Dog;

public class AnimalRunner {
    public static void main(String[] args) {

        d21oop.Dog d = new Dog();
        d.feedWithMilk(); //Mammals feed their babies with milk...
        d.drink(); //Animals drink...
        d.eat(); //Dogs eat...

        d21oop.Bird b = new Bird();
        b.tweet(); //Birds tweet...
        //b.eat(); //Animals eat...

        d21oop.Cat c = new Cat();
        c.feedWithMilk(); //Cats feed their babies with milk...

    }
}
