/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class TextField {

    JFrame frame = new JFrame("JTEXT ");
    JTextField textField = new JTextField("Pozdrav");

    public TextField() {
        textField.setFont(new Font("Verdana", Font.PLAIN, 18));
//        textField.setEditable(false);
//        textField.setEnabled(false);
        textField.setText("Novi tekst");
        String s = textField.getText();
        frame.setTitle(s);
        frame.add(textField);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            new TextField();
            }
            
        });
    }
}
