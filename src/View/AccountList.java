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
public class AccountList extends JFrame implements Observer {
     //------ Variables ------\\
    private JPanel panel = new JPanel();
    
     //------ Constructors ------\\
    public AccountList()
    {
        super("Account List");
        setSize(425, 605);
        setLocation(485, 50);
        
        //--- Customize panel ---\\
        panel.setSize(425, 605);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //--- Add paenel to frame ---\\
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
     public AccountList(Model m)
    {
        super("Account List");
        setSize(425, 605);
        setLocation(485, 50);
        
        //--- Customize panel ---\\
        panel.setSize(425, 605);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //--- Add paenel to frame ---\\
        add(panel);
        setVisible(true);
        m.addObserver(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //------ Additional Methods ------\\
    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }
}
