/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package component;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class ToolBar {
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JButton btnAdd = new JButton("ADD");
    JButton btnRemove = new JButton("REMOVE");
    JToolBar toolBar = new JToolBar();

    public ToolBar() {
        toolBar.add(textField);
        toolBar.add(btnAdd);
        toolBar.addSeparator();
        toolBar.add(btnRemove);
        toolBar.setFloatable(false); // dissable draging toolbar 
        toolBar.addSeparator();
        frame.add(toolBar,BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    
    
    
 public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ToolBar();
            }
        });

    }
}
