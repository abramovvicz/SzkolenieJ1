package day6.reflections;

public class Animal {
    public Animal() {

        System.out.println("powołanie konstruktora");
    }

    @RunIt
    public  static void staticMethod(){
        System.out.println("statyczna metoda");
    }


    //adnotacja to interfejs tylko zapisane z małpką
    //@inteface

    //możemy podawać paratmer, paramet®ów może być ich dużo
    //możemy stosować deafaulta


    @RunIt(name = "name")
    public void method1() {
        System.out.println("wywołanie method1");
    }

    @RunIt
    public void method2() {
        System.out.println("wywołanie method2");
    }


    public void method3() {
        System.out.println("wywołanie method3");
    }


    public void method4() {
        System.out.println("wywołanie method4");
    }


    public void method5() {
        System.out.println("wywołanie method5");
    }

}


