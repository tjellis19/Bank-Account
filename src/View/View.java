/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Model;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author tjell
 */
public class View  {
    //------ Variables ------\\
    private NewAccount newAcc;
    private ExistingAccount oldAcc;
    private AccountList list;
    
    //------ Constructors ------\\
    public  View()
    {
        newAcc = new NewAccount();
        oldAcc = new ExistingAccount();
        list = new AccountList();
        
    }
    
    public  View(Model m)
    {
        newAcc = new NewAccount(m);
        oldAcc = new ExistingAccount(m);
        list = new AccountList(m);
        
    }
}
