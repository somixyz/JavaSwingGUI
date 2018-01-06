/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Milos Dragovic
 */
public class Panel extends JPanel{

    BufferedImage image; 
    public Panel(){
        try{
        image = ImageIO.read(new File("C:\\Users\\acer e1\\Downloads\\Razne Slike\\theirongiant.jpg"));
        }catch(Exception e){
        e.printStackTrace();}
    } 
    public void paintComponent(Graphics g){
//        g.drawImage(image, 0, 0, this);
     g.setColor(Color.RED);
     g.fillRect(10, 10, 100, 50);
    }
}
