/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Milos Dragovic
 */
public class MIGLayout {

    JFrame frame = new JFrame("EMPLOYEES");
    JPanel panel = new JPanel();

    JLabel lblFirstName = new JLabel("First name :");
    JLabel lblLastName = new JLabel("Second name :");
    JTextField txtFirstName = new JTextField(20);
    JTextField txtLastName = new JTextField(20);
    
    JButton btnCreate = new JButton("CREATE");
    JButton btnDelete = new JButton("DELETE");

    public MIGLayout() {
        panel.setLayout(new MigLayout());
        panel.add(lblFirstName);
        panel.add(txtFirstName);
        panel.add(lblLastName);
        panel.add(txtLastName);
        panel.add(btnCreate);
        panel.add(btnDelete);
        
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MIGLayout();
            }
        });

    }
}
