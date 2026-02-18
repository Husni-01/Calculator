import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculatorUI extends JFrame implements ActionListener {

    private JTextField num1Field, num2Field;
    private JLabel resultLabel;

    public CalculatorUI() {

        // Set window title
        setTitle("Simple Calculator");
        setSize(350, 250);
        setLocationRelativeTo(null); // Center on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Create components
        JLabel num1Label = new JLabel("Enter first number:");
        num1Field = new JTextField();

        JLabel num2Label = new JLabel("Enter second number:");
        num2Field = new JTextField();

        JButton addButton = new JButton("+");
        JButton subButton = new JButton("-");
        JButton mulButton = new JButton("*");
        JButton divButton = new JButton("/");

        resultLabel = new JLabel("Result: ");

        // Add action listeners
        addButton.addActionListener(this);
        subButton.addActionListener(this);
        mulButton.addActionListener(this);
        divButton.addActionListener(this);

        // Add components to frame
        add(num1Label);
        add(num1Field);

        add(num2Label);
        add(num2Field);

        add(addButton);
        add(subButton);

        add(mulButton);
        add(divButton);

        add(resultLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            double result = 0;

            String command = e.getActionCommand();

            switch (command) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        resultLabel.setText("Error: Division by zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
            }

            resultLabel.setText("Result: " + result);

        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input! Enter numbers only.");
        }
    }

    public static void main(String[] args) {
        new CalculatorUI();
    }
}
