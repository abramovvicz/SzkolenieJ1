package day3;

public class TestSomeClass {
    public static void main(String[] args) {
        SomeClass someClass = new SomeClass() {
            @Override
            protected void write() {
                super.write();
            }

            @Override // rozszerzanie klasy anonimowo
            public void writeSomething() {
                System.out.println("inne stanowisko");
            } // dla protected też można
        }; // po takiej metodzie jest średnik
        someClass.writeSomething();
        someClass.write();
    }

}
