/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

/**
 *
 * @author Milos Dragovic
 */
public class ScrollPane extends JFrame {

    JLabel label = new JLabel();
    JScrollPane scrollPane = new JScrollPane();

    public ScrollPane() {
        label.setIcon(new ImageIcon("C:\\Users\\acer e1\\Downloads\\Razne Slike\\iron.jpg"));
        scrollPane.setViewportView(label);
        add(scrollPane);
    }
    
        

    public static void main(String[] args) {
        ScrollPane sp = new ScrollPane();
        sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sp.setSize(1024,800);
        sp.setVisible(true);
    }
}
