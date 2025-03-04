import javax.swing.*;
import java.awt.*;

public class SimpleCalculatorWithMenu {
    public static void main(String[] args) {
        // Frame settings
        JFrame frame = new JFrame("Simple Calculator with Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 1000);

        // Menu settings
        JMenuBar menuBar = new JMenuBar();
        JMenu modeMenu = new JMenu("Mode");
        JMenuItem normalMode = new JMenuItem("Normal");
        JMenuItem scientificMode = new JMenuItem("Scientific");
        modeMenu.add(normalMode);
        modeMenu.add(scientificMode);
        menuBar.add(modeMenu);
        frame.setJMenuBar(menuBar);

        // Normal panel and Scientific panel
        JPanel normalPanel = (JPanel) createNormalPanel();
        JPanel scientificPanel = (JPanel) createScientificPanel();

        // Add panels to the frame.
        frame.setLayout(new CardLayout());
        frame.add(normalPanel, "Normal");
        frame.add(scientificPanel, "Scientific");

        // CardLayout creation
        CardLayout cardLayout = (CardLayout) frame.getContentPane().getLayout();
        cardLayout.show(frame.getContentPane(), "Normal");

        // Menu item action listener to switch between panels
        normalMode.addActionListener(e -> cardLayout.show(frame.getContentPane(), "Normal"));
        scientificMode.addActionListener(e -> cardLayout.show(frame.getContentPane(), "Scientific"));

        frame.setVisible(true);
    }

    public static Component createNormalPanel() {
        JPanel normalPanel = new JPanel();
        normalPanel.setLayout(new GridLayout(5,2,10,10));

        JLabel input1Label = new JLabel("First Number: ");
        JTextField input1Field = new JTextField();
        JLabel input2Label = new JLabel("Second Number: ");
        JTextField input2Field = new JTextField();

        JButton addButton = new JButton("Add (+)");
        JButton subButton = new JButton("Subtract (-)");
        JButton mulButton = new JButton("Multiply (*)");
        JButton divButton = new JButton("Divide (/)");
        JLabel resultLabel = new JLabel("Result: ");

        normalPanel.add(input1Label);
        normalPanel.add(input1Field);
        normalPanel.add(input2Label);
        normalPanel.add(input2Field);
        normalPanel.add(addButton);
        normalPanel.add(subButton);
        normalPanel.add(mulButton);
        normalPanel.add(divButton);
        normalPanel.add(resultLabel);

        addButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(input1Field.getText());
                double num2 = Double.parseDouble(input2Field.getText());
                double sum = num1 + num2;
                resultLabel.setText("Result: " + sum);
            } catch (NumberFormatException ee) {
                resultLabel.setText("Invalid input.");
            }
        });
        subButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(input1Field.getText());
                double num2 = Double.parseDouble(input2Field.getText());
                double result = num1 - num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ee) {
                resultLabel.setText("Invalid input.");
            }
        });
        mulButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(input1Field.getText());
                double num2 = Double.parseDouble(input2Field.getText());
                double result = num1 * num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ee) {
            resultLabel.setText("Invalid input.");
            }
        });
        divButton.addActionListener(e -> {
            try {
                double num1 = Double.parseDouble(input1Field.getText());
                double num2 = Double.parseDouble(input2Field.getText());
                if (num2==0) {
                    resultLabel.setText("Cannot divide by zero.");
                    return;
                }
                double result = num1 / num2;
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ee) {
                resultLabel.setText("Invalid input.");
            }
        });
        return normalPanel;
    }

    public static Component createScientificPanel() {
        JPanel scientificPanel = new JPanel();
        scientificPanel.setLayout(new GridLayout(4,2,10,10));

        JLabel inputLabel = new JLabel("Number: ");
        JTextField inputField = new JTextField();

        JButton sinButton = new JButton("Sin");
        JButton cosButton = new JButton("Cos");
        JButton tanButton = new JButton("Tan");
        JButton logButton = new JButton("Log");
        JLabel resultLabel = new JLabel("Result: ");

        scientificPanel.add(inputLabel);
        scientificPanel.add(inputField);
        scientificPanel.add(sinButton);
        scientificPanel.add(cosButton);
        scientificPanel.add(tanButton);
        scientificPanel.add(logButton);
        scientificPanel.add(resultLabel);

        sinButton.addActionListener(e -> {
            try {
                double num = Double.parseDouble(inputField.getText());
                double result = Math.sin(Math.toRadians(num));
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ee) {
                resultLabel.setText("Invalid input.");
            }
        });
        cosButton.addActionListener(e -> {
            try {
                double num = Double.parseDouble(inputField.getText());
                double result = Math.cos(Math.toRadians(num));
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ee) {
                resultLabel.setText("Invalid input.");
            }
        });
        tanButton.addActionListener(e -> {
            try {
                double num = Double.parseDouble(inputField.getText());
                double result = Math.tan(Math.toRadians(num));
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ee) {
                resultLabel.setText("Invalid input.");
            }
        });
        logButton.addActionListener(e -> {
            try {
                double num = Double.parseDouble(inputField.getText());
                double result = Math.log(num);
                resultLabel.setText("Result: " + result);
            } catch (NumberFormatException ee) {
                resultLabel.setText("Invalid input.");
            }
        });

        return scientificPanel;
    }
}
