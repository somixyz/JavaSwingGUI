/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Milos Dragovic
 */
public class TextFieldEvent {

    JFrame frame = new JFrame("JTEXTFIELD EVENT");
    JPanel panel = new JPanel();
    JButton button = new JButton("OK");
    JTextField textField = new JTextField("", 20);

    public TextFieldEvent() {
//        textField.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                textField.setText("OVO JE TEKST");
//            }
//        });

//        textField.setEditable(false);
//        textField.addFocusListener(new FocusListener() {
//            @Override
//            public void focusGained(FocusEvent e) {
//                textField.setText("");
//            }
//            
//            @Override
//            public void focusLost(FocusEvent e) {
//                textField.setText("UNESI TEKST");                
//            }
//        });
        textField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }

            public void warn() {
                button.setText(textField.getText());
            }
        });
        panel.add(textField);
        panel.add(button);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldEvent();
            }

        });
    }
}
