package day4.testSwing;

import javax.swing.*;

public class MainSwingTest{
    public static void main(String[] args) {
        JFrame swingFrame = new JFrame();
        JButton jButton = new JButton("Click");
        jButton.addActionListener(x-> System.out.println("CLIKNIĘCIE "));
        swingFrame.add(jButton);
        swingFrame.setName("Test name");
        swingFrame.setSize(640, 480);
        swingFrame.setTitle("New Title");
        swingFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        swingFrame.setVisible(true);

    }
}
