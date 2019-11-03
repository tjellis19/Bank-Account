/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.*;

/**
 *
 * @author tjell
 */
public class Model extends Observable{
    //------ Variables ------\\
    private ArrayList<String> accounts, types;
    private ArrayList<Integer> balances;
    
    //------ Constructors ------\\
    public Model()
    {
        accounts = new ArrayList<String>();
        types = new ArrayList<String>();
        balances = new ArrayList<Integer>();        
    }
    
    //------ Additional Methods ------\\
    public ArrayList<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<String> accounts) {
        this.accounts = accounts;
    }

    public ArrayList<String> getTypes() {
        return types;
    }

    public void setTypes(ArrayList<String> types) {
        this.types = types;
    }

    public ArrayList<Integer> getBalances() {
        return balances;
    }

    public void setBalances(ArrayList<Integer> balances) {
        this.balances = balances;
    }
    
    public void update()
    {
        setChanged();
        notifyObservers();
    }
}
