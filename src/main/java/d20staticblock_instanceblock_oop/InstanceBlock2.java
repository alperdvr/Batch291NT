package d20staticblock_instanceblock_oop;

public class InstanceBlock2 {

    public int year;

    //Instance block olusturalim
    {
        System.out.println("Herkese selam");
    }

    //2 tane constructor uretelim
    public InstanceBlock2() {
        //Tekrar eden kodu buradan alip Instance block icine yapistirdik
    }

    public InstanceBlock2(int year) {
        //Tekrar eden kodu buradan alip Instance block icine yapistirdik
        this.year = year;
    }
}