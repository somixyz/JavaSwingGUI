/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Milos Dragovic
 */
public class ComboBox {

    JFrame frame = new JFrame("JComboBox frame");
    JPanel panel = new JPanel();
//    JLabel label = new JLabel();
    JComboBox<String> comboBox = new JComboBox<String>();
    DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
    JTextField txtAdd = new JTextField(15);
    JButton btnAdd = new JButton("ADD");
    JButton btnRemove = new JButton("REMOVE");
    String selectedValue;

    public ComboBox() {
//        comboBox.addItem(new ImageIcon(this.getClass().getResource("/javagui/icon/sova.png")));
//        comboBox.addItem(new ImageIcon(this.getClass().getResource("/javagui/icon/riba.png")));
//        comboBox.addItem(new ImageIcon(this.getClass().getResource("/javagui/icon/macak.png")));
        comboBox.setModel(model);

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
//                    ImageIcon icon = (ImageIcon)e.getItem();
//                    label.setIcon(icon);
                    selectedValue = model.getSelectedItem().toString();
                }
            }
        });
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeElement(selectedValue);
            }
        });
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.addElement(txtAdd.getText());
            }
        });
        panel.add(txtAdd);
        panel.add(btnAdd);
        panel.add(comboBox);
        panel.add(btnRemove);
//        panel.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ComboBox();
            }
        });

    }
}
