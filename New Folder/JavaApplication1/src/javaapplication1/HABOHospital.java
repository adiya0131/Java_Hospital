/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Dell
 */
public class HABOHospital
extends JFrame{
public HABOHospital() throws HeadlessException{
    super("Эмнэлгийн нэвтрэх хэсэг");
    this.setSize(700, 800);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        HABOHospital mainFrame = new HABOHospital();
        JPanel northPanel = new JPanel();
        JPanel centerPanel = new JPanel(new GridLayout(8,2,10,10));
        JPanel southPanel = new JPanel();
        HABOHospital loginFrame = new HABOHospital();
        
        
        
        JButton a = new JButton();
        
        JButton b = new Jbutton();
        
        mainFrame.setVisible(true);
        mainFrame.add(a);
        loginFrame.setVisible(false);
        loginFrame.add(b);
        // TODO code application logic here oadiya
    }

    private static class Jbutton extends JButton {

        public Jbutton() {
        }
    }
}
