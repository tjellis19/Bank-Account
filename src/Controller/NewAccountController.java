/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.View;
import Model.Model;
import java.awt.event.*;
import java.util.*;

/**
 *
 * @author tjell
 */
public class NewAccountController implements ActionListener {
    //------ Variables ------\\
    Model m;
    View v;
    Scanner input = new Scanner(System.in);
    
    //------ Constructors ------\\
    public NewAccountController(Model m, View v)
    {
        this.m = m;
        this.v = v;
        v.getNewAcc().getCreate().addActionListener(this);
    }
    
    //------ Additional Methods ------\\
    public void actionPerformed(ActionEvent e) {
        if(v.getNewAcc().getAccountName().getText().isEmpty() == false && v.getNewAcc().getDeposit().getText().isEmpty() == false)
        {
            System.out.println("Create button was clicked");
            v.getNewAcc().accounts.add(v.getNewAcc().getAccountName().getText());
            v.getNewAcc().getAccountName().setText("");
            m.getTypes().add(v.getNewAcc().getAccountType().getSelectedItem().toString());
            v.getNewAcc().balances.add(Integer.parseInt(v.getNewAcc().getDeposit().getText()));
            v.getNewAcc().getDeposit().setText("");
            v.getNewAcc().update(m, e);
            m.update();
        }
    }
    
}
