package d23oop_collections;

public class AudiRunner {
    public static void main(String[] args) {

        //Engine e = new Engine(); //HATA, interface'lerden object uretilmez

        AudiA4 a4 = new AudiA4();
        a4.turbo(); //Audi A4 turbo motor kullanir
        a4.analog(); //Audi A4 analog klima kullanir
        a4.esp(); //Audi A4 esp fren sistemi kullanir


        System.out.println("//-------------------------------");

        System.out.println(Engine.fiyat);
        System.out.println(AC.fiyat);
        System.out.println(Brake.fiyat);

        System.out.println("//-------------------------------");

        Engine.speed();
        a4.power();

        //Engine.price = 5000; HATA, yeni deger atanamaz

        System.out.println("//-------------------------------");

        AudiS5 s5 = new AudiS5();
        s5.turbo();
        s5.analog();
        s5.esp();
        s5.power();


    }
}