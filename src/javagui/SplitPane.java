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
import javax.swing.JSplitPane;

/**
 *
 * @author Milos Dragovic
 */
public class SplitPane extends JFrame {

    JLabel label1 = new JLabel();
    JLabel label2 = new JLabel();
    JSplitPane splitpPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(label1), new JScrollPane(label2));

    public SplitPane(){
        label1.setIcon(new ImageIcon("C:\\Users\\acer e1\\Downloads\\Razne Slike\\iron.jpg"));
        label2.setIcon(new ImageIcon("C:\\Users\\acer e1\\Downloads\\Razne Slike\\theirongiant.jpg"));
        add(splitpPane);
    }
    public static void main(String[] args) {
        SplitPane sp = new SplitPane();
        sp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        sp.setSize(1024,600);
        sp.setVisible(true);
    }
}
