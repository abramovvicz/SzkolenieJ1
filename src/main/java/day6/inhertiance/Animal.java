package day6.inhertiance;

public class Animal implements Zoo {

public void sth(){
    System.out.println("coś tam");
}

    @Override
    public void writeSth(String s) {
        System.out.println("metoda writeSth z zoo"  );
    }
}
