package com.sd.address.v0;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddressGUIMain {
    public static void main(String[] args) {
        JFrame f=new JFrame();
        JPanel panel=new JPanel(new GridLayout(7,2));
        f.getContentPane().add(panel);
        JLabel label1=new JLabel("Name");
        JLabel label2=new JLabel("Age");
        JLabel label3=new JLabel("Student ID");
        JLabel label4=new JLabel("Address");
        JLabel label5=new JLabel("Phone-Number");
        JLabel label6=new JLabel("Home-Number");
        JTextField areaTf1=new JTextField(20);
        JTextField areaTf2=new JTextField(20);
        JTextField areaTf3=new JTextField(20);
        JTextField areaTf4=new JTextField(20);
        JTextField areaTf5=new JTextField(20);
        JTextField aredTf6=new JTextField(20);
        JButton b1=new JButton("Add");
        JButton b2=new JButton("Cancel");
        b1.addActionListener(new AddressListener());
        panel.add(label1);
        panel.add(areaTf1);
        panel.add(label2);
        panel.add(areaTf2);
        panel.add(label3);
        panel.add(areaTf3);
        panel.add(label4);
        panel.add(areaTf4);
        panel.add(label5);
        panel.add(areaTf5);
        panel.add(label6);
        panel.add(aredTf6);
        panel.add(b1);
        panel.add(b2);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}