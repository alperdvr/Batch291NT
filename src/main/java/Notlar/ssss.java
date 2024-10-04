package Notlar;

import java.util.Scanner;

public class ssss {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Noktalı virgül eklendi
        System.out.println("Lütfen yaşınızı giriniz"); // Tırnak işareti düzeltildi
        byte age = input.nextByte();

        if (age < 0) {
            System.out.println("Geçerli bir yaş giriniz"); // Tırnak işareti düzeltildi

        } else if (age < 5) {
            System.out.println("Bebek");

        } else if (age < 13) { // Parantez eklendi
            System.out.println("Çocuk");

        } else if (age < 21) {
            System.out.println("Genç");

        } else if (age < 31) {
            System.out.println("Yetişkin"); // Noktalı virgül eklendi

        } else {
            System.out.println("Tanımlanmamış yaş");
        }
    }
}