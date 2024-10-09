package d20staticblock_instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        //Her ornek(instance-object), belirlenen varsayilan degerlere sahiptir

        InstanceBlock3 car1 = new InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakit Turu: Benzin

        InstanceBlock3 car2 = new InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakit Turu: Benzin

        //Bir instance daha olustursam o da default degerlerle baslar
        //Ancak constructorlarla ozellestirilebilir

        InstanceBlock3 car3 = new InstanceBlock3("Kirmizi", "Dizel");
        System.out.println("Araba Rengi: " + car3.color); //Araba Rengi: Kirmizi
        System.out.println("Araba Yakit Turu: " + car3.fuelType); //Araba Yakit Turu: Dizel

        InstanceBlock3 car4 = new InstanceBlock3();
        //Araba Rengi: Siyah
        //Araba Yakit Turu: Benzin

    }
}