/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class TextArea {

    JFrame frame = new JFrame("JTEXTAREA");
    JTextArea textArea = new JTextArea("Pozdrav", 10, 30);
    JScrollPane scrollPane = new JScrollPane(textArea);

    public TextArea() {
        textArea.append("SVIMA");
        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextArea();
            }

        });
    }
}
