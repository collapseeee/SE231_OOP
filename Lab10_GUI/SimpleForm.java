import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Simple Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create a panel to hold the components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2)); // row,col settings

        // Create a label and text field for the name
        JLabel nameLabel = new JLabel("Enter your name:");
        JTextField nameField = new JTextField();

        // Create a label and text field for the age
        JLabel ageLabel = new JLabel("Enter your age:");
        JTextField ageField = new JTextField();

        // Create a button to submit the form
        JButton submitButton = new JButton("Submit");

        // Create a label to display the greeting message
        JLabel greetingLabel = new JLabel("");

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(submitButton);
        panel.add(new JLabel("")); // Empty cell for layout purposes
        panel.add(greetingLabel);
        panel.add(new JLabel("")); // Empty cell for layout purposes

        // Add an action listener to the button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                greetingLabel.setText("Hello, " + name + "! (" + age + " years old.)");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }
}
