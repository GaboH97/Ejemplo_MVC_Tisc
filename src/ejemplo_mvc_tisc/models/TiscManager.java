/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo_mvc_tisc.models;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gabriel Huertas <gabriel970826@gmail.com>
 */
public class TiscManager {
    
    private ArrayList<Tisc> tiscs;

    public TiscManager() {
        tiscs = new ArrayList<>();
    }
    
    public void addTisc(Tisc tisc){
        tiscs.add(tisc);
    }
    
    public Tisc createTisc(String serial, String type, LocalDate expeditionDate, Double balance){
        return new Tisc(serial, type, expeditionDate, balance);
    }

    public ArrayList<Tisc> getTiscs() {
        return tiscs;
    }

    public void setTiscs(ArrayList<Tisc> tiscs) {
        this.tiscs = tiscs;
    }
    
}
