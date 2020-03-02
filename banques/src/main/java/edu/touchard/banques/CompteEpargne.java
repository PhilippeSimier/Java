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
public class CompteEpargne extends CompteBancaire{
    
    private double taux;

    public CompteEpargne(double soldeInit, double tauxInit) {
        super(soldeInit);
        this.taux = tauxInit;
        System.out.println("Constructeur de Compte Epargne ");
    }
    
    @Override
    public void afficher(){
        super.afficher();
        System.out.println("Taux : " + taux+ "%");
        
        
    }
    
    public double calculerInterets(){   
        return solde * taux/100;
    } 
    
    public void crediterInterets(){
        solde += calculerInterets();   
        
    }
    
    public void changerTaux(double _taux){
        this.taux = _taux;
    }
    
    
    
}
