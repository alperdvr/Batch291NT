package java.d12loopsarrays;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        //Ornek 1: 0-100 arasi sayi tahmin etme oyununu do-while ile yaziniz.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //0 ile 100 arasinda rastgele bir sayi uretelim
        int rastgeleSayi = random.nextInt(101); //0-100 arasi sayi urettik

        //ODEV: 20(dahil) ile 100(dahil) arasında random sayi isteseydik?

        //Kullanicinin kac kere tahmin yaptigini takip etmek icin bir sayac olusturalim
        int denemeSayisi = 0;

        //Kullanicinin yaptigi tahmini saklamak icin bir degisken olusturalim
        int tahminEdilen; //Baslangic degerini birazdan kullanici girecek. int tahminEdilen = 0; yazsak calisir miydi?

        //Kullanicinin sayiyi dogru tahmin edip etmedigini kontrol etmek icin bir boolean degisken olusturalim
        boolean tahminDogrumu = false;

        //----------------------
        System.out.println("0-100 arasinda bir sayiyi tahmin etmeye calisin");

        do {

            //Kullanicidan tahmin alalim
            System.out.println("Tahminizi yapiniz");
            tahminEdilen = scanner.nextInt();

            //Sayaci bir artiralim
            denemeSayisi++;

            //Tahmini kontrol edelim
            if (tahminEdilen < rastgeleSayi) {
                System.out.println("Sayi daha buyuk");
            } else if (tahminEdilen > rastgeleSayi) {
                System.out.println("Sayi daha kucuk");
            } else {
                tahminDogrumu = true;
                System.out.println("Tebrikler, dogru tahmin");
                System.out.println("Deneme sayisi : " + denemeSayisi);
            }


        } while (!tahminDogrumu);

        scanner.close();
        //random objesini kapatmak gerekir mi?

    }
}
