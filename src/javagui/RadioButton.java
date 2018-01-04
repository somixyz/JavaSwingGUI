/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class RadioButton {
    
    JFrame frame = new JFrame("JRadioButton frame");
    JPanel panel = new JPanel();
    
    JRadioButton rdbGreen = new JRadioButton("Green");
    JRadioButton rdbRed = new JRadioButton("Red");
    ButtonGroup btnGroup = new ButtonGroup();

    public RadioButton() {
        rdbGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton source = (JRadioButton) e.getSource();
                if (source.isSelected()) {
                    panel.setBackground(Color.GREEN);
                }
                if (!source.isSelected()) {
                    panel.setBackground(Color.WHITE);
                }
                panel.repaint();
            }            
        });
        
        rdbRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JRadioButton source = (JRadioButton) e.getSource();
                if (source.isSelected()) {
                    panel.setBackground(Color.RED);
                }
                if (!source.isSelected()) {
                    panel.setBackground(Color.WHITE);
                }
                panel.repaint();
            }            
        });
        btnGroup.add(rdbRed);
        btnGroup.add(rdbGreen);
        panel.add(rdbGreen);
        panel.add(rdbRed);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RadioButton();
            }
        });
        
    }
}
