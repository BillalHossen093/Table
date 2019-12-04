    
package projectIn;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Test extends JFrame {

    private Container c;
    private JLabel imageLabel, textLabel;
    private JTextField t;
    private JTextArea a;
    private JButton b;
    private ImageIcon img;
    private Font f;
    private Cursor cur;

    Test() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.BOLD, 20);
        img = new ImageIcon(getClass().getResource("images4.jpg"));
        imageLabel = new JLabel(img);
        imageLabel.setBounds(3, 3, 375, 213);
        c.add(imageLabel);
        textLabel = new JLabel("Enter any Number:");
        textLabel.setBounds(30, 230, 250, 50);
        textLabel.setFont(f);
        textLabel.setForeground(Color.BLUE);
        c.add(textLabel);

        t = new JTextField();
        t.setBounds(225, 235, 130, 50);
        t.setBackground(Color.GREEN);
        t.setHorizontalAlignment(JTextField.CENTER);
        t.setFont(f);
        c.add(t);

        t.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String value = t.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You did'n any number");
                } else {
                    a.setText("");
                    int num = Integer.parseInt(t.getText());
                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;
                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String inc = String.valueOf(i);
                        a.append(n + " X " + inc + " = " + r + "\n");
                    }
                }
            }
        });

        cur = new Cursor(Cursor.HAND_CURSOR);
        b = new JButton("Clear");
        b.setBounds(235, 300, 80, 37);
        b.setCursor(cur);
        c.add(b);

        a = new JTextArea();
        a.setBounds(1, 380, 380, 380);
        a.setBackground(Color.GREEN);
        a.setFont(f);
        c.add(a);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                a.setText("");
                String def = null;
                t.setText(def);
            }
        });

    }

    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);
        frame.setBounds(100, 200, 400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Multiplication Table");
    }

}

    

