/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_mvc_tisc.controllers;

import ejemplo_mvc_tisc.models.TiscManager;
import ejemplo_mvc_tisc.views.TiscRegisterForm;

/**
 *
 * @author Gabriel Huertas <gabriel970826@gmail.com>
 */
public class Controller {
    
    private TiscRegisterForm tiscRegisterForm;
    private TiscManager tiscManager;

    public Controller() {
        
        tiscManager = new TiscManager();
        tiscRegisterForm = new TiscRegisterForm(tiscManager);
        
    }
     
}
