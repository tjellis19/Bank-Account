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
    private Model m;
    private JPanel panel = new JPanel();
    private JTextArea list = new JTextArea();
    private String text;
    
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
        this.m = m;
        
        //--- Customize panel ---\\
        panel.setSize(425, 605);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //--- Add text area to panel ---\\
        list.setEditable(false);
        list.setTabSize(24);
        list.setText(defaultText());
        list.setBounds(10, 10, 400, 580);
        panel.add(list);
        
        //--- Add paenel to frame ---\\
        add(panel);
        setVisible(true);
        m.addObserver(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    //------ Additional Methods ------\\
    @Override
    public void update(Observable o, Object arg) {
        text = "";
        for(int i = 0; i < m.getAccounts().size(); i++)
        {
            text += m.getAccounts().get(i) + "   |   " + m.getTypes().get(i) + "   |   Balance: $" + m.getBalances().get(i) + "\n";
        }
        list.setText(text);
        repaint();
    }
    
    private String defaultText()
    {
        String text = "Nothing yet!!";
        return text;
    }

    public JTextArea getList() {
        return list;
    }
    
    
}
