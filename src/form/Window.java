/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JWindow;

/**
 *
 * @author Milos Dragovic
 */
public class Window extends JWindow {
    
    JPanel panel = new JPanel();
    
    public Window() {
        panel.setBackground(Color.BLUE);
        add(panel);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount()==2){
                dispose();}
            }
        
        });
    }
    
    public static void main(String[] args) {
        Window w = new Window();
        w.setSize(640, 480);
        w.setVisible(true);
    }
}
