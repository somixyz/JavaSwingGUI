/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package component;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import layout.MIGLayout;

/**
 *
 * @author Milos Dragovic
 */
public class PasswordFieldComp {

    JFrame frame = new JFrame("JPassword frame ");
    JPanel panel = new JPanel();
    JPasswordField passwordField = new JPasswordField(20);
    JButton btn = new JButton("Perform check");

    public PasswordFieldComp() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                passwordField.getText();   //nije bezbedno, string je immutable, ostaju u string pool-u
                char[] input = passwordField.getPassword();
                if (checkIfCorrect(input)) {
                    JOptionPane.showMessageDialog(null, "Password is correct ");
                } else {

                    JOptionPane.showMessageDialog(null, "Password is incorrect");
                }
            }
        });
        passwordField.setEchoChar('*');
        panel.add(passwordField);
        panel.add(btn);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private boolean checkIfCorrect(char[] arr) {
        boolean isCorrect = false;
        char[] correctPass = {'1', '2', '3'};

        if (arr.length != correctPass.length) {
            isCorrect = false;
        } else {
            isCorrect = Arrays.equals(arr, correctPass);
        }
        Arrays.fill(correctPass, '0');
        return isCorrect;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PasswordFieldComp();
            }
        });

    }
}
