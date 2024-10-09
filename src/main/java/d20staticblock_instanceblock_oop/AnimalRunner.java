package d20staticblock_instanceblock_oop;

public class AnimalRunner {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.feedWithMilk(); //Mammals feed their babies with milk...
        d.drink(); //Animals drink...

        Bird b = new Bird();
        b.tweet(); //Birds tweet...
        b.eat(); //Animals eat...

    }
}