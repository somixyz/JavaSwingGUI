/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class ButtoneEvent {

    JFrame frame = new JFrame();
    JButton button = new JButton("KLIKNI");

    public ButtoneEvent() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button.setBackground(Color.red);
            }
        });
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtoneEvent();
            }
        });
    }

//    private class Evt implements ActionListener{
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            button.setBackground(Color.red);
//       }}
    
        

}
