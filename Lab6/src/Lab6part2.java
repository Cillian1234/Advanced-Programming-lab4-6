import javax.swing.*;

public class Lab6part2 extends Frame {
    String string = null;
    JButton button = new JButton();
    JTextArea text = new JTextArea();
    Lab6part2() {

    }
}

class InnerInfoClass {
    public static void main(String[] args) {
        Lab6part2 run = new Lab6part2();

        Class classinfo = run.getClass();
        System.out.println(classinfo.getName());
    }
}
