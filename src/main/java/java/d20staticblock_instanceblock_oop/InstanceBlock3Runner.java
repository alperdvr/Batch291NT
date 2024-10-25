package java.d20staticblock_instanceblock_oop;

import d20staticblock_instanceblock_oop.InstanceBlock3;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        //Her ornek(instance-object), belirlenen varsayilan degerlere sahiptir

        d20staticblock_instanceblock_oop.InstanceBlock3 car1 = new d20staticblock_instanceblock_oop.InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakit Turu: Benzin

        d20staticblock_instanceblock_oop.InstanceBlock3 car2 = new d20staticblock_instanceblock_oop.InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakit Turu: Benzin

        //Bir instance daha olustursam o da default degerlerle baslar
        //Ancak constructorlarla ozellestirilebilir

        d20staticblock_instanceblock_oop.InstanceBlock3 car3 = new d20staticblock_instanceblock_oop.InstanceBlock3("Kirmizi", "Dizel");
        System.out.println("Araba Rengi: " + car3.color); //Araba Rengi: Kirmizi
        System.out.println("Araba Yakit Turu: " + car3.fuelType); //Araba Yakit Turu: Dizel

        d20staticblock_instanceblock_oop.InstanceBlock3 car4 = new InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakit Turu: Benzin

    }
}
