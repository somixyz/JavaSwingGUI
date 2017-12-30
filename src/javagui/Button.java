/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javagui;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class Button {

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                JButton button = new JButton("Prihvati");
                frame.add(button);
//                button.setFont(new Font("Serif", Font.PLAIN, 18));
                button.setEnabled(true);
                button.setIcon(new ImageIcon(Button.class.getResource("javagui\\icon\\ok.png")));
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
