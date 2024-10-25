package java.d28exception_enum;

import d28exception_enum.InvalidStudentGradeException;

public class ExceptionRunner {
    public static void main(String[] args) {

        studentGrade(-45);

    } //main disi

    public static void studentGrade(int not) {
        //System.out.println(not);
        if (not < 0 || not > 100) {

            try {
                throw new d28exception_enum.InvalidStudentGradeException("ogrenci notu sifirdan kucuk veya yuzden buyuk girilemez");
            } catch (InvalidStudentGradeException e) {
               e.printStackTrace(); //hatanin ayrintilarini gosterir
            }

        } else {
            System.out.println(not);
        }


    }

}
