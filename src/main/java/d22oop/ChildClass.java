package d22oop;

public class ChildClass extends ParentClass{

    @Override
    public Integer multiply(Integer a, Integer b) {
        //Parent class'in carpma methodunu cagirdik
        Integer sonuc = super.multiply(a, b); //20
        //--
        //Ek islevsellik katalim
        return sonuc + 10; //20 + 10 = 30

    }
}