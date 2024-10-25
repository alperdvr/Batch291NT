package java.d27exceptions;

public class E04 {
    public static void main(String[] args) {

        //4) ArrayIndexOutOfBoundsException: Bir dizi elemanına erişilmeye çalışıldığında,
        // dizi boyutunu aşan bir indeks kullanıldığında meydana gelir.

        String[] arr = {"j", "a", "v", "a"};
        //getElementFromArray(arr, 1); //a
        getElementFromArray(arr, 2);


    } //main disi

    public static void getElementFromArray(String[] s, int idx) {
        String el = s[idx];
        System.out.println(el);
    }


}
