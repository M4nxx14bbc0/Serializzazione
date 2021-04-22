/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializzazione;

import java.io.Serializable;

/**
 *
 * @author parrarodriguez.manue
 */
public class Studente implements Serializable {
    private String nome, cognome; 
    private final String registro;
    private int eta;

    public Studente(String nome, String cognome, String registro) {
        this.nome = nome;
        this.cognome = cognome;
        this.registro = registro;
    }
    
    @Override
    public String toString(){
        return "Studente = nome : "+nome+", cognome : "+cognome+", eta : "+eta+", registro = "+registro+";";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRegistro() {
        return registro;
    }
}