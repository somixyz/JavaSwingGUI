/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class FlowLayoutt {

    JFrame frame = new JFrame("FLOW LAYOUT");
    JPanel panel = new JPanel();
    JButton btn1 = new JButton("PRVI");
    JButton btn2 = new JButton("DRUGI");
    JButton btn3 = new JButton("TRECI");

    public FlowLayoutt() {
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT,3,3));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FlowLayoutt();
            }
        });
    }
}
