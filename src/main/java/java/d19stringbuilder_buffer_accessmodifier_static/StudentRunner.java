package java.d19stringbuilder_buffer_accessmodifier_static;

import d19stringbuilder_buffer_accessmodifier_static.Student;

public class StudentRunner {
    public static void main(String[] args) {

        //Student class'tan bir instance olusturalim
        d19stringbuilder_buffer_accessmodifier_static.Student ali = new Student();

        System.out.println("ali.stdName = " + ali.stdName); //ali.stdName = Ali Can
        System.out.println("ali.email = " + ali.email); //ali.email = alican@gmail.com
        System.out.println("ali.address = " + ali.address); //ali.address = Istanbul

        System.out.println(ali);

    }
}
