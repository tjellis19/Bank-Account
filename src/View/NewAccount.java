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
public class NewAccount extends JFrame implements Observer {
    //------ Variables ------\\
    public ArrayList<String> accounts;
    private JTextField accountName = new JTextField();
    private JPanel panel = new JPanel();
    private JTextField deposit = new JTextField();
    private JButton create = new JButton("Create");
    private JComboBox accountType = new JComboBox();
    private JLabel nameLabel, typeLabel, depositLabel;
    
    //------ Constructors ------\\
    public NewAccount()
    {
        super("Create New Account");
        setSize(400, 305);
        setLocation(50, 50);
        
        //--- Customize panel ---\\
        panel.setSize(425, 305);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
              
        //--- Add first label to panel ---\\
        nameLabel = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Account Name</b></font></div></html>");
        nameLabel.setBounds(135, 0, 150, 40);
        panel.add(nameLabel);
        
        //--- Add name text field to panel ---\\
        accountName.setBounds(75, 35, 250, 44);
        panel.add(accountName);
        
        //--- Add second label to panel ---\\
        typeLabel = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Account Type</b></font></div></html>");
        typeLabel.setBounds(135, 75, 150, 40);
        panel.add(typeLabel);
        
        //--- Add combobox to panel ---\\
        accountType.addItem("Savings Account");
        accountType.addItem("Checkings Account");
        accountType.setBounds(75, 115, 250, 30);
        panel.add(accountType);
        
        //--- Add third label to panel ---\\
        depositLabel = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Initial Deposit: $</b></font></div></html>");
        depositLabel.setBounds(50, 153, 150, 40);
        panel.add(depositLabel);
        
        //--- Add deposit text field to panel ---\\
        deposit.setBounds(195, 160, 125, 30);
        panel.add(deposit);
        
        //--- Add create button to panel ---\\
        create.setBounds(125, 210, 125, 30);
        panel.add(create);
        
        //--- Add paenel to frame ---\\
        add(panel);
        setVisible(true);
    }
    
    public NewAccount(Model m)
    {
        super("Create New Account");
        setSize(425, 305);
        setLocation(50, 50);
        
        //--- Customize panel ---\\
        panel.setSize(425, 305);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
              
        //--- Add first label to panel ---\\
        nameLabel = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Account Name</b></font></div></html>");
        nameLabel.setBounds(135, 0, 150, 40);
        panel.add(nameLabel);
        
        //--- Add name text field to panel ---\\
        accountName.setBounds(75, 35, 250, 44);
        panel.add(accountName);
        
        //--- Add second label to panel ---\\
        typeLabel = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Account Type</b></font></div></html>");
        typeLabel.setBounds(135, 75, 150, 40);
        panel.add(typeLabel);
        
        //--- Add combobox to panel ---\\
        accountType.addItem("Savings Account");
        accountType.addItem("Checkings Account");
        accountType.setBounds(75, 115, 250, 30);
        panel.add(accountType);
        
        //--- Add third label to panel ---\\
        depositLabel = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Initial Deposit: $</b></font></div></html>");
        depositLabel.setBounds(50, 153, 150, 40);
        panel.add(depositLabel);
        
        //--- Add deposit text field to panel ---\\
        deposit.setBounds(195, 160, 125, 30);
        panel.add(deposit);
        
        //--- Add create button to panel ---\\
        create.setBounds(125, 210, 125, 30);
        panel.add(create);
        
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

    public JTextField getAccountName() {
        return accountName;
    }

    public JTextField getDeposit() {
        return deposit;
    }

    public JButton getCreate() {
        return create;
    }

    public JComboBox getAccountType() {
        return accountType;
    }
    
    
}
