package day6.inhertiance;

public interface Zoo {
    void writeSth(String s);

    default void method(String a) {
        System.out.println("coś tam " + a);
    }
}
