/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Model;
import View.View;

/**
 *
 * @author tjell
 */
public class Controller {
    //------ Variables ------\\
    private NewAccountController newAcc;
    private ExistingAccountController oldAcc;
    private AccountListController list;
    
    //------ Constructors ------\\
    public Controller(Model m, View v) {
        newAcc = new NewAccountController(m, v);
        list = new AccountListController(m, v);
        oldAcc = new ExistingAccountController(m, v);
    }
}
