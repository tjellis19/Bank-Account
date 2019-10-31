/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author tjell
 */
public class View extends JFrame {
    //------ Variables ------\\
    private NewAccount newAcc = new NewAccount();
    private ExistingAccount oldAcc = new ExistingAccount();
    private AccountList list = new AccountList();
    
    //------ Constructors ------\\
    public  View()
    {
        super();
        setLayout(new GridLayout(2,1));
        add(newAcc);
        add(oldAcc);
        add(list);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(950, 750);
        setVisible(true);
    }
}
