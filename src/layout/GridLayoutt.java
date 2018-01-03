/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class GridLayoutt {

    JFrame frame = new JFrame("GRID LAYOUT");
    JPanel panel = new JPanel();

    JButton btn1 = new JButton("PRVI");
    JButton btn2 = new JButton("DRUGI");
    JButton btn3 = new JButton("TRECI");
    JButton btn4 = new JButton("CETVRTI");

    public GridLayoutt() {
        panel.setLayout(new GridLayout(2, 2, 3, 3));
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        frame.add(panel);
//        btn1.setPreferredSize(new Dimension(50, 50)); ne radi se ovako, stvara se domino efekat
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
//        frame.setSize(300, 300);   DOMINO EFEKAT  !!!
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GridLayoutt();
            }
        });
    }
}
