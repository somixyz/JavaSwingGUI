/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class BorderLayoutt {

    JFrame frame = new JFrame("BORDER LAYOUT");
    JButton btn1 = new JButton("SEVER");
    JButton btn2 = new JButton("JUG");
    JButton btn3 = new JButton("CENTAR");
    JButton btn4 = new JButton("ZAPAD");
    JButton btn5 = new JButton("ISTOK");

    public BorderLayoutt() {
        frame.setLayout(new BorderLayout());
        frame.add(btn1, BorderLayout.NORTH);
        frame.add(btn2, BorderLayout.SOUTH);
        frame.add(btn3, BorderLayout.CENTER);
        frame.add(btn4, BorderLayout.WEST);
        frame.add(btn5, BorderLayout.EAST);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
             new BorderLayoutt();
            }
        });
    }

}
