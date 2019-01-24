package day3.wildCard;

public class WildCardTest {

    class Family <T> {}
    interface GrandFather {}
    interface Father extends GrandFather{}
    interface Son extends Father{}

    void add1(Family<?> family){}  // ? kiedy chcemy wykorzystać listę ale nie wiemy jakiego typu
    void add2(Family<? extends Father> family){}  // w dół nie można po wyżej herarchi zadziałać≥
    void add3(Family<? super Father> family){} // w górę

    public void test(){
        add1(new Family<GrandFather>());
        add1(new Family<Father>());
        add1(new Family<Son>());
//    add2(new Family<GrandFather>()); // uzywamy extend wszystki eklasy ponizej klasy bazowej
        add2(new Family<Father>());
        add2(new Family<Son>());
    add3(new Family<GrandFather>());
        add3(new Family<Father>());
//        add3(new Family<Son>()); // uzywamy super wszystkie klasy powyzej klasy bazowej
    }
}
