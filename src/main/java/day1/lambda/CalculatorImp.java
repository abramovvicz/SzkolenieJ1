package day1.lambda;

public class CalculatorImp {

    public static void main(String[] args) {
        System.out.println(new CalculatorImp().add(7, 4));
        System.out.println(new CalculatorImp().substruct(7, 4));

    }

//    private int add(int a, int b) {
//        Calculator calc = new Calculator() { // pelna implementacja intefejsu anonimowa implementacja interfejsuu
//            @Override
//            public int calc(int a, int b) {
//                return a + b;
//            }
//        };
//        return calc.calc(a, b);
//    }
//interfejs funkcyjny musi mieć tylko jedną implementacje metody abstrakcyjnej tylko do lambdy

    private int add(int a, int b) {
        Calculator calc = (x, y) -> x + y;
        return calc.calc(a, b);
    }

    private int substruct(int a, int b) {
        Calculator calc = (x, y) -> x - y;
        return calc.calc(a, b);
    }

    private int divide(int a, int b) {
        Calculator calc = (x, y) -> x / y;
        return calc.calc(a, b);
    }
}
