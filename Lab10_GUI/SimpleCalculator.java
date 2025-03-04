import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 600);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Create a text field to display the result
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        // Create input labels and fields of integer.
        JLabel input1Label = new JLabel("First Number: ");
        JTextField input1Field = new JTextField();
        JLabel input2Label = new JLabel("Second Number: ");
        JTextField input2Field = new JTextField();

        JButton addButton = new JButton("Addition (+)");
        JButton subtractButton = new JButton("Subtraction (-)");

        JLabel resultLabel = new JLabel();

        panel.add(input1Label);
        panel.add(input1Field);
        panel.add(input2Label);
        panel.add(input2Field);
        panel.add(addButton);
        panel.add(subtractButton);
        panel.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(input1Field.getText());
                    double num2 = Double.parseDouble(input2Field.getText());
                    double sum = num1 + num2;
                    resultLabel.setText("Result: " + Double.toString(sum));
                } catch (NumberFormatException ee) {
                    resultLabel.setText("Please enter numbers.");
                }
            }
        });
        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(input1Field.getText());
                    double num2 = Double.parseDouble(input2Field.getText());
                    double difference = num1 - num2;
                    resultLabel.setText("Result: " + Double.toString(difference));
                } catch (NumberFormatException ee) {
                    resultLabel.setText("Please enter numbers.");
                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
