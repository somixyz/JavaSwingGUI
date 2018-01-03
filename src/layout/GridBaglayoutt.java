/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class GridBaglayoutt {

    JFrame frame = new JFrame("GRIDBAG LAYOUT");
    JPanel panel = new JPanel();
    JButton btnOne = new JButton("PRVI");
    JButton btnSecond = new JButton("DRUGI");
    JButton btnThird = new JButton("TRECI");

    public GridBaglayoutt() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;  // sirina svih komponenti da bude jednaka, na osnovu najsire
        gbc.insets = new Insets(5, 5, 5, 5);  //razmak izmedju componenti
        
        gbc.gridx = 0;
        gbc.gridy = 0; 
        panel.add(btnOne,gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(btnSecond,gbc);
        gbc.gridwidth = 2;  // span kolona, dugme 3 sada je na 2 kolone
        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(btnThird,gbc);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GridBaglayoutt();
            }
        });

    }
}
