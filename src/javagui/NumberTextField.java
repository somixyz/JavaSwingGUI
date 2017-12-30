/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class NumberTextField {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JNumberTextField num = new JNumberTextField();
                num.setColumns(15);
                num.setFormat(JNumberTextField.DECIMAL);
                num.setMaxLength(7);
                num.setPrecision(4);
                num.setAllowNegative(true);
                
                JFrame frame = new JFrame();
                frame.add(num);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}
