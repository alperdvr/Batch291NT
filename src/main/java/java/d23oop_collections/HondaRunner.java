package java.d23oop_collections;

import d23oop_collections.Accord;
import d23oop_collections.Civic;

public class HondaRunner {
    public static void main(String[] args) {

        //Honda h = new Honda(); //HATA-Honda abstract bir class'tir. Abstract class'lardan object uretilmez

        d23oop_collections.Civic c = new Civic();
        c.engine(); //Gas 1.6 Eco

        d23oop_collections.Accord a = new Accord();
        a.engine(); //Gas 2.0 Turbo

        a.music(); //Pro

    }
}
