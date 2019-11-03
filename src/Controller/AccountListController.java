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
public class AccountListController {
    //------ Variables ------\\
    Model m;
    View v;
    
    //------ Constructors ------\\
    public AccountListController(Model m, View v)
    {
        this.m = m;
        this.v = v;
       //updateList(); 
    }
    
    //------ Additional Methods ------\\
    
    public void updateList()
    {
        v.getList().getList().setText(v.getList().text(m.getAccounts(), m.getTypes(), m.getBalances()));
        m.update();
    }/**/
}
