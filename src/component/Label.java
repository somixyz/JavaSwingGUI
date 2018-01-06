/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package component;

import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Milos Dragovic
 */
public class Label {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel prikaz");
        JLabel label = new JLabel();
        label.setText("Pozdrav");
        label.setFont(new Font("Consolas", Font.PLAIN, 24));
//        frame.add(label);
        JLabel label1 = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\acer e1\\Downloads\\Razne Slike\\iron.jpg"));
        frame.add(label1);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
