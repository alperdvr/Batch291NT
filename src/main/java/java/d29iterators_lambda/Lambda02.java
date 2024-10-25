package java.d29iterators_lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 11, 10));
        printSquareOfOddElements(nums);

    } //main disi

    //ornek 1: Bir tamsayı listesi alan ve listedeki tek sayıların karelerini,
    // aynı satırda, aralarına boşluk koyarak yazdıran bir method oluşturunuz.(Functional)
    //example 1: Create a method that takes a list of integers and prints the squares
    // of the odd numbers in the list on the same line with a space between them.(Functional)

    //map(): Elemanları dönüştürmek için kullanılır.

    public static void printSquareOfOddElements(List<Integer> nums) {

        nums.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " ")); //9 25 121

    }


}
