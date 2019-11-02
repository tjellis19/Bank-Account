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
    private JComboBox select = new JComboBox();
    private JLabel getAccount, balance;
    private JTextField depositAmount = new JTextField();
    private JButton deposit = new JButton("Deposit");
    private JTextField withdrawlAmount = new JTextField();
    private JButton withdrawl = new JButton("Withdrawl");
    private JTextField accountBalance = new JTextField();
    private JButton delete = new JButton("Delete");

    //------ Constructors ------\\
    public ExistingAccount()
    {
        super("Access Existing Account");
        setSize(425, 305);
        setLocation(50, 370);
        
        //--- Customize panel ---\\
        panel.setSize(425, 305);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //--- Add first label to panel ---\\
        getAccount = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Select Account</b></font></div></html>");
        getAccount.setBounds(15, 5, 120, 40);
        panel.add(getAccount);
        
        //--- Add combobox to panel ---\\
        select.setBounds(145, 15, 235, 35);
        panel.add(select);
        
        //--- Add deposit text field to panel ---\\
        depositAmount.setBounds(15, 65, 230, 40);
        panel.add(depositAmount);
        
        //--- Add deposit button to panel ---\\
        deposit.setBounds(265, 65, 100, 40);
        panel.add(deposit);
        
        //--- Add withdrawl text field to panel ---\\
        withdrawlAmount.setBounds(15, 125, 230, 40);
        panel.add(withdrawlAmount);
        
        //--- Add withdrawl button to panel ---\\
        withdrawl.setBounds(265, 125, 100, 40);
        panel.add(withdrawl);
        
        //--- Add second label to panel ---\\
        balance = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Balance</b></font></div></html>");
        balance.setBounds(15, 185, 120, 40);
        panel.add(balance);
        
        //--- Add balance text field to panel ---\\
        accountBalance.setBounds(100, 185, 120, 40);
        panel.add(accountBalance);
        
        //--- Add delete button to panel ---\\
        delete.setBounds(290, 210, 90, 40);
        panel.add(delete);
        
        //--- Add paenel to frame ---\\
        add(panel);
	setVisible(true);

    }
    
     public ExistingAccount(Model m)
    {
        super("Access Existing Account");
        setSize(425, 305);
        setLocation(50, 370);
        
        //--- Customize panel ---\\
        panel.setSize(425, 305);
        panel.setBackground(Color.white);
        panel.setLayout(null);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        
        //--- Add first label to panel ---\\
        getAccount = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Select Account</b></font></div></html>");
        getAccount.setBounds(15, 5, 120, 40);
        panel.add(getAccount);
        
        //--- Add combobox to panel ---\\
        select.setBounds(145, 15, 235, 35);
        panel.add(select);
        
        //--- Add deposit text field to panel ---\\
        depositAmount.setBounds(15, 65, 230, 40);
        panel.add(depositAmount);
        
        //--- Add deposit button to panel ---\\
        deposit.setBounds(265, 65, 100, 40);
        panel.add(deposit);
        
        //--- Add withdrawl text field to panel ---\\
        withdrawlAmount.setBounds(15, 125, 230, 40);
        panel.add(withdrawlAmount);
        
        //--- Add withdrawl button to panel ---\\
        withdrawl.setBounds(265, 125, 100, 40);
        panel.add(withdrawl);
        
        //--- Add second label to panel ---\\
        balance = new JLabel("<html><div style = 'text-align: center;'><font size = 5><b>Balance</b></font></div></html>");
        balance.setBounds(15, 185, 120, 40);
        panel.add(balance);
        
        //--- Add balance text field to panel ---\\
        accountBalance.setEditable(false);
        accountBalance.setBounds(100, 185, 120, 40);
        panel.add(accountBalance);
        
        //--- Add delete button to panel ---\\
        delete.setBounds(290, 210, 90, 40);
        panel.add(delete);
        
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

    public JComboBox getSelect() {
        return select;
    }

    public JTextField getDepositAmount() {
        return depositAmount;
    }

    public JButton getDeposit() {
        return deposit;
    }

    public JTextField getWithdrawlAmount() {
        return withdrawlAmount;
    }

    public JButton getWithdrawl() {
        return withdrawl;
    }

    public JTextField getAccountBalance() {
        return accountBalance;
    }

    public JButton getDelete() {
        return delete;
    }
    
    
}
