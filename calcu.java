import java.awt.event.*;
import javax.swing.*;

class Calculator extends JFrame implements ActionListener {
    private JTextField t1; 
    private JButton[] buttons = new JButton[16]; 
    private double res; 
    private String operation; 

    public Calculator() {
        setLayout(null); 
        setSize(640, 480); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        t1 = new JTextField(); 
        t1.setBounds(100, 100, 200, 30); 

        // Button labels and layout
        String[] buttonLabels = { "1", "2", "3", "+", "4", "5", "6", "-", 
                                   "7", "8", "9", "*", "/", "%", "=", "C" };
        
        for (int i = 0; i < buttonLabels.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttons[i].setBounds(100 + (i % 4) * 50, 140 + (i / 4) * 30, 50, 30);
            buttons[i].addActionListener(this);
            add(buttons[i]);
        }

        add(t1);
    }

    public void doAction(String op) {
        if (operation == null) { 
            operation = op; 
            res = Double.parseDouble(t1.getText()); 
            t1.setText(""); 
        } else {
            double input = Double.parseDouble(t1.getText());

            switch (operation) { 
                case "+":
                    res += input; 
                    break; 
                case "-":
                    res -= input; 
                    break; 
                case "*":
                    res *= input; 
                    break; 
                case "/":
                    if (input == 0) { 
                        JOptionPane.showMessageDialog(this, "Cannot divide by zero!");
                        return; 
                    }
                    res /= input; 
                    break; 
                case "%": 
                    res %= input; 
                    break; 
            } 

            if (op.equals("=")) { 
                t1.setText(String.valueOf(res)); 
                res = 0; 
                operation = null; 
            } else { 
                operation = op; 
                t1.setText(""); 
            } 
        } 
    }

    public void actionPerformed(ActionEvent e) { 
        for (int i = 0; i < buttons.length; i++) {
            if (e.getSource() == buttons[i]) {
                String label = buttons[i].getText();
                if ("C".equals(label)) {
                    t1.setText(""); 
                    res = 0; 
                    operation = null; 
                } else if ("=".equals(label)) {
                    doAction("=");
                } else if ("+".equals(label) || "-".equals(label) || 
                           "*".equals(label) || "/".equals(label) || 
                           "%".equals(label)) {
                    doAction(label);
                } else {
                    t1.setText(t1.getText() + label);
                }
                break;
            }
        }
    }

    public static void main(String args[]) { 
        new Calculator().setVisible(true);  
    } 
}
