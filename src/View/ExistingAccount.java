/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Model;
import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author tjell
 */
public class ExistingAccount extends JFrame implements Observer {
     //------ Variables ------\\
    private JPanel panel = new JPanel();

    //------ Constructors ------\\
    public ExistingAccount()
    {
        super("Delete Existing Account");
        setSize(425, 305);
        setLocation(50, 370);
        
        //--- Customize panel ---\\
        panel.setSize(425, 305);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //--- Add paenel to frame ---\\
        add(panel);
	setVisible(true);

    }
    
     public ExistingAccount(Model m)
    {
        super("Delete New Account");
        setSize(425, 305);
        setLocation(50, 370);
        
        //--- Customize panel ---\\
        panel.setSize(425, 305);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //--- Add paenel to frame ---\\
        add(panel);
        setVisible(true);
        m.addObserver(this);

    }
     
    //------ Additional Methods ------\\
    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
