/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import layout.MIGLayout;

/**
 *
 * @author Milos Dragovic
 */
public class OptionPane {

    JFrame frame = new JFrame("JOPTIONPANE");
    JPanel panel = new JPanel();
    JButton btn = new JButton("Call dialog");
    JTextArea txtArea = new JTextArea(10, 10);

    public OptionPane() {
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

//                JOptionPane.showMessageDialog(null, new JScrollPane(txtArea), "Message dialog", JOptionPane.ERROR_MESSAGE);
//                JOptionPane.showMessageDialog(null, "Connection failed", "Message dialog", JOptionPane.ERROR_MESSAGE);

//                String title = JOptionPane.showInputDialog(null, "enter title for jframe: ");
//                frame.setTitle(title);

                int result = JOptionPane.showConfirmDialog(null, "Are you sure you want to close a JFrame ?", "Select an option", JOptionPane.OK_CANCEL_OPTION);
                if (result == JOptionPane.OK_OPTION) {
                    frame.dispose();
                }
            }
        });
        panel.add(btn);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OptionPane();
            }
        });

    }
}
