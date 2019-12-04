
package projectin;

import javax.swing.JFrame;

public class NewClass {
    public static void main(String[] args) {
       Test frame = new Test();
        frame.setVisible(true);
        frame.setBounds(100, 200, 400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Multiplication Table");
    }
}
