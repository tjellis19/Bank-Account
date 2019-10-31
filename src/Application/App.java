package Application;

import Model.Model;
import View.View;
import Controller.Controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tjell
 */
public class App {
    public static void main(String[] args) {
        
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();
    }
}
