/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.View;
import Model.Model;

/**
 *
 * @author tjell
 */
public class ExistingAccountController {
    //------ Variables ------\\
    Model m;
    View v;
    
    //------ Constructors ------\\
    public ExistingAccountController(Model m, View v)
    {
        this.m = m;
        this.v = v;
    }
    
    //------ Constructors ------\\
    public void fill()
    {
        v.getOldAcc().getSelect().removeAllItems();
        for(int i = 0; i < m.getAccounts().size(); i++)
        {
            v.getOldAcc().getSelect().addItem(m.getAccounts().get(i).toString());
        }
    }
}
