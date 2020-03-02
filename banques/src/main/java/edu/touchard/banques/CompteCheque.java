/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.banques;

/**
 *
 * @author psimier
 */
public class CompteCheque extends CompteBancaire{
    private final double decouvert;
    
    public CompteCheque(){
        super();
        this.decouvert = 0.0;
    }
    
    @Override
    public void deposer(double montant){
        if((montant + decouvert) > 0 && montant > 0){
            this.solde += montant;
        }     
        
    }
    
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Découvert autorisé : " + decouvert + "€");
        
    }
}
