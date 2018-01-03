/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class CardLayoutt {

    JFrame frame = new JFrame("CARD LAYOUT");
    JPanel panelCont = new JPanel();
    JPanel panelFirst = new JPanel();
    JPanel panelSecond = new JPanel();
    JButton btnOne = new JButton("PREDJI NA DRUGI PANEL/WORKSPACE");
    JButton btnSecond = new JButton("PREDJI NA PRVI PANEL/WORKSPACE");
    CardLayout cl = new CardLayout();

    public CardLayoutt() {
        panelCont.setLayout(cl);
        
        panelFirst.add(btnOne);
        panelSecond.add(btnSecond);
        panelFirst.setBackground(Color.red);
        panelSecond.setBackground(Color.GREEN);
        
        panelCont.add(panelFirst, "1");
        panelCont.add(panelSecond, "2" );
        cl.show(panelCont, "1");
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCont, "2");
            }
        });
        btnSecond.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cl.show(panelCont, "1");
            }
        });
        frame.add(panelCont);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CardLayoutt();
            }
        });

    }
}
