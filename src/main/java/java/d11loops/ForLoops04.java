package java.d11loops;

import java.util.Scanner;

public class ForLoops04 {
    public static void main(String[] args) {

        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
        Example 2:  Create the code that prints the following figure to the console.

              X X X X X
              X X X X X
              X X X X X    */

        Scanner input = new Scanner(System.in);

        System.out.println("Satir sayisini giriniz");
        int row = input.nextInt();

        System.out.println("Sutun sayisini giriniz");
        int column = input.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int k = 1; k <= column; k++) {

                System.out.print("X ");
            }

            System.out.println(); //print yanyana yazar. pointer'i bir alta aldik
        }

        //-------------
        /*Odev : Asagidaki sekli for-loop kullanarak çizdiriniz.
        Homework: Draw the following figure using for-loop.

            *
            * *
            * * *
            * * * *

        */


    }
}
