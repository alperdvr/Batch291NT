package java.d28exception_enum;

public class E05 {
    public static void main(String[] args) {

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 0;
        String s = "My Java";
        //getCharFromString(s, a, b);
        getCharFromString2(s, a, b);

    } //main disi

    //1.yol:
    public static void getCharFromString(String s, int a, int b) {

        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (ArithmeticException e) {
            System.out.println("Sifira bolme yapilamaz " + e.getMessage()); //Sifira bolme yapilamaz / by zero

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandiniz " + e.getCause());
        }

    }

    //2.yol: Tum exception turlerini tek bir catch'te yakalamak icin "Exception" adli parent kullanilir
    public static void getCharFromString2(String s, int a, int b) {

        try {

            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);

        } catch (Exception e) {

            System.err.println("Bir istisna olustu :" + e.getClass());

        }

    }


}
