package java.d28exception_enum;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        String[] arr = {"j", "a", "v", "a"};
        //getElementFromArray(arr, 2); //v
        getElementFromArray(arr, 5);


    } //main disi

    public static void getElementFromArray(String[] s, int idx) {

        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index numarasi " + (s.length - 1) + " den buyuk olamaz");
            //index numarasi 3 den buyuk olamaz
        }

    }


}
