package java.d28exception_enum;

import d28exception_enum.Cities;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //Cities c = new Cities(); HATA- enum'dan object uretilemez

        //1- Enum daki bir sabite nasil ulasabiliriz?
        d28exception_enum.Cities il = d28exception_enum.Cities.AMASYA;
        System.out.println(il); //AMASYA

        //2- BURSA sabitinin ismine ulasalim
        String ilIsmi = d28exception_enum.Cities.BURSA.getCityName();
        System.out.println(ilIsmi); //Bursa

        //3- Ankara'nin posta koduna ulasalim
        String postaKodu = d28exception_enum.Cities.ANKARA.getPostalCode();
        System.out.println(postaKodu); //06000

        //4- Antalya’nin plaka koduna ulasalim
        System.out.println(d28exception_enum.Cities.ANTALYA.getPlateCode()); //7

        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin
        //values() methodu enum icindeki tum datalari bir Array icinde bize verir

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        d28exception_enum.Cities[] sehirler = d28exception_enum.Cities.values();
        //System.out.println(Arrays.toString(sehirler)); //[ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI,...

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {
            //[ADANA, ADIYAMAN, AFYONKARAHİSAR, AĞRI,...
            for (Cities w : sehirler) {

                if (plaka == w.getPlateCode()) {
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        }
    }
}
