package com.sd.address.v1;

import java.awt.event.*;
import javax.swing.*;

public class AddressListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton b = (JButton)e.getSource(); 
        String button = e.getActionCommand();
        if (button.equals("Add")) {
            System.out.println("Added.");
            b.setText("Added.");
        }
        else if (button.equals("Cancel")) {
            System.out.println("Canceled.");
            b.setText("Canceled.");
        }
    }
}