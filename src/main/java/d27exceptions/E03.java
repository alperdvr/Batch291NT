package d27exceptions;

public class E03 {
    public static void main(String[] args) {

        //3) StringIndexOutOfBoundsException, bir String nesnesinin, karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.

        String s = "Java";
        //selectChar(s, 2); //v
        selectChar(s, 5);



    } //main disi

    public static void selectChar(String s, int idx) {

        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan index'leri kullanmayiniz : " + e.getMessage());
            e.printStackTrace(); //exception'i gormek istersek kullaniriz, burada exception firlatilmaz
        }
        System.out.println("App calisiyor");

    }


}