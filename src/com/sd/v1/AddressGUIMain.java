package com.sd.address.v1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Iterator;
 
public class AddressGUIMain {
  public static void main(String[] args) {    
    JFrame f=new JFrame();
    JPanel panel=new JPanel(new GridLayout(5,2));
    f.getContentPane().add(panel);
    JLabel label1=new JLabel("NAME");
    JLabel label2=new JLabel("ADDRESS");
    JLabel label3=new JLabel("PHONE-NUMBER");
    JTextField f1=new JTextField(20);
    JTextField f2=new JTextField(20);
    JTextField f3=new JTextField(20);
    JButton BTinsert=new JButton("REGISTER");
    JButton BTfindById=new JButton("FIND BY ID");
    JButton BTdelete=new JButton("DELETE");
    JButton BTfindAll=new JButton("SHOW ADDRESS LIST");

    BTinsert.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) {
        PersonDaoImpl personDaoImpl = new PersonDaoImpl();
        PersonVO person = new PersonVO();
        String fname=f1.getText();
        String faddress=f2.getText();
        person.setName(fname);
        person.setAddress(faddress);
        personDaoImpl.insert(person);
      }
    });
    /*BTdelete.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e) { 
      PersonDaoImpl personDaoImpl = new PersonDaoImpl();
        String fname=f1.getText();
        personDaoImpl.delete(fname);
        System.out.println("delete ...");
      }
    });*/
    BTfindAll.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) { 
        PersonDaoImpl personDaoImpl = new PersonDaoImpl();
        PersonVO person = new PersonVO();
        List persons=personDaoImpl.findAll();
        Iterator iter=persons.iterator();
        while(iter.hasNext()) {
          person=(PersonVO)iter.next();
          System.out.println(person.toString());
        }
      }
    });   
    /*BTfindById.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e) { 
        PersonDaoImpl personDaoImpl = new PersonDaoImpl();
        PersonVO person = new PersonVO();
        String fname=f1.getText();
        person=personDaoImpl.findById(fname);
        System.out.println("found by ID... "+person);
      }
    });*/
    panel.add(label1);
    panel.add(f1);
    panel.add(label2);
    panel.add(f2);
    panel.add(label3);
    panel.add(f3);
    panel.add(BTinsert);
    panel.add(BTdelete);
    panel.add(BTfindById);
    panel.add(BTfindAll);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.pack();
    f.setVisible(true);
  } 
}