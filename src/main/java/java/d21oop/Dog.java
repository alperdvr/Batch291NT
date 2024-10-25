package java.d21oop;

import d21oop.Animal;
import d21oop.Mammal;

public class Dog extends Mammal {

    //Herkes Cat class'ta feedWithMilk() methodunu override etsin?

    public void bark() {
        System.out.println("Dogs bark...");
    }

    @Override //Anotation
    public void eat(){
        System.out.println("Dogs eat...");
    }

    @Override
    public Animal create(){
        return new Dog(); //upcasting - Java bunu otomatik yapar
        //Dog class'tan bir object urettik ve disari
        //Animal data tipiyle return ettim
        //downcasting - otomatik yapilmaz
    }

    @Override
    public int add(int a, int b){
        return a + b;
        //primitive data tipleri arasinda parent-child iliskisi yoktur
        //primitive'lerde return type degistirilemez
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }




}
