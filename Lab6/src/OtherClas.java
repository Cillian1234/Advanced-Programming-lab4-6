import javax.swing.*;
import java.awt.event.ActionListener;

public class OtherClas extends Frame {
    JButton calculate = new JButton("Calculate");
    JLabel result = new JLabel("Result here");
    JTextField input = new JTextField();
    OtherClas() {
        c.gridy = 0;
        panel.add(result, c);

        c.gridy = 1;
        panel.add(input, c);

        c.gridx = 0;
        c.gridy = 2;
        calculate.addActionListener(e -> {
            try {
                result.setText(String.valueOf(CalcCirc.calculateCircumference(Double.valueOf(input.getText()))));
            } catch (NumberFormatException ex) {
                result.setText("Please enter a number");
            }
        });
        panel.add(calculate, c);

        setVisible(true);
    }
    public static void main(String[] args) {
        OtherClas run = new OtherClas();
    }
}
