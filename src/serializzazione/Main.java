/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author parrarodriguez.manue
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Studente studente = new Studente("Mario","Rossi","MR072273TGH", 13);
        try {
            // <code>ObjectInputStream</code> ed <code>ObjectOutputStream</code> per la
            // serializzazione
            
            FileOutputStream  scrittore = new FileOutputStream("test.ser");
            ObjectOutputStream serializza = new ObjectOutputStream(scrittore);
            
            FileInputStream lettore = new FileInputStream("test.ser");
            ObjectInputStream deserializza = new ObjectInputStream(lettore);
            
            serializza.writeObject(9);
            serializza.writeObject("ciao");
            serializza.writeObject(0.25);
            //serializza.writeObject(true);
            //serializza.writeObject('o');
            serializza.flush();
            serializza.close();
            
            int numero = (int) deserializza.readObject();
            String oggetto = (String) deserializza.readObject();
            float decimale = (float) (double) deserializza.readObject();
            System.out.println("numero : "+numero);
            System.out.println("oggetto : "+oggetto);
            System.out.println("decimale : "+(int)decimale);
            lettore.close();
            /*
            
            long f = 10;
            for (int i = 0; i < 15625; i++) {
                serializza.writeLong(f);
            }
            
            for (int i = 0; i < 15625; i++) {
                System.out.println(deserializza.readLong());
            }
            */
        } catch (FileNotFoundException ex) {
            System.err.println("Impossibile trovare il file");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            System.err.println("Hai rotto Java!!");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}