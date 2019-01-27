package day5.internalClass;

public class OtherTest {

    public void method() {
        InternalTest.InternalStaticTest internalStaticTest = new InternalTest.InternalStaticTest();
        InternalTest.InternalStaticTest.a = 2;
        internalStaticTest.c = 2;
//      internalStaticTest.d=0;
    }

    public void method2() {
        InternalTest test = new InternalTest();
        InternalTest.InternalDynamic intD = test.new InternalDynamic();
        intD.c = 11;
    }
}
