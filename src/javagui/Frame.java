/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javagui;

import javax.swing.JFrame;

/**
 *
 * @author Milos Dragovic
 */
public class Frame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JFrame Title");
        Panel panel = new Panel();
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(320,240);
        frame.setVisible(true);
    }
}
