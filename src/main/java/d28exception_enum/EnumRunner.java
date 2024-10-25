package d28exception_enum;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Cities c = new Cities(); HATA- enum'dan object uretilemez

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.AMASYA;
        System.out.println(il); //AMASYA

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu); //06000

        //4- Antalya’nin plaka koduna ulasalim
        System.out.println(Cities.ANTALYA.getPlateCode()); //7

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler)); //[ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI,...

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {

            for (Cities w : sehirler) {

                if (plaka == w.getPlateCode()) {
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        }
    }
}