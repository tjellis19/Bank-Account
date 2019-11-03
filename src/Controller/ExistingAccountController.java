/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.View;
import Model.Model;
import java.awt.event.*;

/**
 *
 * @author tjell
 */
public class ExistingAccountController implements ActionListener {
    //------ Variables ------\\
    Model m;
    View v;
    
    //------ Constructors ------\\
    public ExistingAccountController(Model m, View v)
    {
        this.m = m;
        this.v = v;
        v.getOldAcc().getDeposit().addActionListener(this);
        v.getOldAcc().getWithdrawl().addActionListener(this);
        v.getOldAcc().getDelete().addActionListener(this);
    }
    
    //------ Additional Methods ------\\
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if (obj == v.getOldAcc().getDeposit())
        {
            System.out.println("Deposit button was clicked");
            for(int i = 0; i < m.getAccounts().size(); i++)
            {
                if(v.getOldAcc().getSelect().getSelectedItem().toString().equals(m.getAccounts().get(i)))
                {
                    int amount, add;
                    amount = Integer.parseInt(v.getOldAcc().getDepositAmount().getText());
                    add = m.getBalances().get(i) + amount;
                    m.getBalances().set(i, add);
                    v.getOldAcc().getDepositAmount().setText("");
                    m.update();
                }
            }
        }
        if (obj == v.getOldAcc().getWithdrawl())
        {
            System.out.println("Withdrawl button was clicked");
            for(int i = 0; i < m.getAccounts().size(); i++)
            {
                if(v.getOldAcc().getSelect().getSelectedItem().toString().equals(m.getAccounts().get(i)))
                {
                    int amount, subtract;
                    amount = Integer.parseInt(v.getOldAcc().getWithdrawlAmount().getText());
                    subtract = m.getBalances().get(i) - amount;
                    m.getBalances().set(i, subtract);
                    v.getOldAcc().getWithdrawlAmount().setText("");
                    m.update();
                }
            }
        }
        if (obj == v.getOldAcc().getDelete())
        {
         System.out.println("Delete button was clicked");
         for(int i = 0; i < m.getAccounts().size(); i++)
            {
                if(v.getOldAcc().getSelect().getSelectedItem().toString().equals(m.getAccounts().get(i)))
                {
                    m.getAccounts().remove(i);
                    m.getBalances().remove(i);
                    m.getTypes().remove(i);
                    m.update();
                }
            }
        }
    }
}
