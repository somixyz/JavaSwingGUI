/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javagui;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;

/**
 *
 * @author Milos Dragovic
 */
public class InternalFrame extends JFrame{
    JDesktopPane desktopPane = new JDesktopPane();
    JInternalFrame intFrame = new JInternalFrame("JInternalFrame NASLOV");
    
    public InternalFrame(){
        intFrame.setMaximizable(true);
        intFrame.setIconifiable(true);
        intFrame.setResizable(true);
        intFrame.setClosable(true);
        intFrame.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
        intFrame.setSize(320,240);
        intFrame.setVisible(true);
        desktopPane.add(intFrame);
        add(desktopPane);
    }
    
    public static void main(String[] args) {
        InternalFrame iFrame = new InternalFrame();
        iFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        iFrame.setSize(640,480);
        iFrame.setVisible(true);
//        JFrame frame = new JFrame();
        
    }
}
