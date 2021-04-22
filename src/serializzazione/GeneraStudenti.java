/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parrarodriguez.manue
 */
public class GeneraStudenti implements Runnable{
    private final static String[] nomi = {"Manuel", "Paolo", "Lucrezia", "Elisa", "Andrea"},
                                  cognomi = {"Parra", "Torresani", "Zarattini", "Del Corno", "Zagato"},
                                  registro = {"UGDUGU787U7","GRE3GFB934TR3","89GHF34GR3G","89RHNW8Y83","IY8ERBH893FGH8"};

    public GeneraStudenti() {
    }
    
    @Override
    public void run() {
        try {
            for (int i = 0;; i++) {
                Studente s = new Studente(nomi[(int)(Math.random()*4)],cognomi[(int)(Math.random()*4)],registro[(int)(Math.random()*4)]);
                Thread.sleep(1000);
                System.out.println(s.toString());
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(GeneraStudenti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
