package java.d19stringbuilder_buffer_accessmodifier_static;

import d19stringbuilder_buffer_accessmodifier_static.Student2;

public class Student2Runner {
    public static void main(String[] args) {

        System.out.println(d19stringbuilder_buffer_accessmodifier_static.Student2.stdName); //Ali Can
        //static class member'lara ulasmak icin sadece class ismi yeterlidir
        d19stringbuilder_buffer_accessmodifier_static.Student2 ali = new d19stringbuilder_buffer_accessmodifier_static.Student2();
        System.out.println(ali.age); //18
        //age, non-static oldugu icin, ona ulasmak icin object olusturmak zorundayiz

        Student2.staticMethod(); //Ben static bir methodum
        ali.nonStaticMethod(); //Ben non-static bir methodum

    }
}
