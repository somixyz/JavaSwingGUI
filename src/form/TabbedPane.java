/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author Milos Dragovic
 */
public class TabbedPane extends JFrame {

    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JLabel label = new JLabel("Prvi");
    JLabel label1 = new JLabel("Drugi");
    JTabbedPane tabbedPane = new JTabbedPane();

    public TabbedPane() {
        panel.add(label);
        panel1.add(label1);

        tabbedPane.add("PRVI PANEL", panel);
        tabbedPane.add("DRUGI PANEL", panel1);
        add(tabbedPane);
    }

    public static void main(String[] args) {
        TabbedPane tp = new TabbedPane();
        tp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        tp.setSize(600,400);
        tp.setVisible(true);
    }
}
