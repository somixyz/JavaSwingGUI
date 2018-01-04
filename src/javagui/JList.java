/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui;

import java.math.BigDecimal;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Milos Dragovic
 */
public class JList {
    
    JFrame frame = new JFrame("Storage");
    javax.swing.JList<Product> list = new javax.swing.JList<Product>();
    DefaultListModel<Product> model = new DefaultListModel<>();
    
    JLabel label = new JLabel();
    JPanel panel = new JPanel();
    JSplitPane splitPane = new JSplitPane();
    
    public JList() {
        list.setModel(model);
        
        model.addElement(new Product("Oranges", new BigDecimal("2.00"), "These are fresh oranges"));
        model.addElement(new Product("Apples", new BigDecimal("2.50"), "These are fresh apples"));
        model.addElement(new Product("Watermellow", new BigDecimal("1.70"), "These are fresh watermellows"));
        list.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            Product p = list.getSelectedValue();
            label.setText("Name: " + p.getName() + " ::: " + p.getPrice().toPlainString() + " ::: " + p.getDesc());
        });
        splitPane.setLeftComponent(new JScrollPane(list));
        panel.add(label);
        splitPane.setRightComponent(panel);
        
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(splitPane);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(JList::new);
        
    }
    
    private class Product {
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        public BigDecimal getPrice() {
            return price;
        }
        
        public void setPrice(BigDecimal price) {
            this.price = price;
        }
        
        public String getDesc() {
            return desc;
        }
        
        public void setDesc(String desc) {
            this.desc = desc;
        }
        
        String name;
        BigDecimal price;
        String desc;
        
        public Product(String name, BigDecimal price, String desc) {
            this.name = name;
            this.price = price;
            this.desc = desc;
        }
        
        @Override
        public String toString() {
            return name;
        }
        
    }
}
