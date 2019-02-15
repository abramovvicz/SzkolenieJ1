package day5.internalClass;

public class InternalTest {
    public static int aa = 7;
    private static int bb = 12;
    public int cc = 13;
    private int dd = 15;

    public void internalTest() {
        InternalStaticTest in = new InternalStaticTest();
        InternalStaticTest.a = 1;
        InternalStaticTest.b = 2;
        in.c = 3;
        in.d = 4;


    }

    public static class InternalStaticTest {   // to jest ok w użyciu
        public static int a = 7;
        private static int b = 12;
        public int c = 13;
        private int d = 15;

        public void method2() {
            InternalTest internalStatic = new InternalTest();
            InternalTest.aa = 2;
            InternalTest.bb = 2;
            internalStatic.cc = 2;
            internalStatic.dd = 3;
        }
    }


    public class InternalDynamic { // to jest ciężkie w użyciu  i nie łatwie
        //nie można tworzy zmiennych i metod statycznych

        //        public  static int a = 7;
//        private  static int b = 12;
        public int c = 13;
        private int d = 15;

        public void method2() {
            InternalTest internalStatic = new InternalTest();
            InternalTest.aa = 2;
            InternalTest.bb = 2;
            internalStatic.cc = 2;
            internalStatic.dd = 3;
        }

        public void method3() {
            InternalDynamic internalDynamic = new InternalDynamic();
//            InternalDynamic.a = 2;//
//            InternalDynamic.b = 2;//
            internalDynamic.c = 2;
            internalDynamic.d = 3;
        }
    }
}


