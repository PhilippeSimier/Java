/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.touchard.factoriel;

/**
 *
 * @author psimier
 */

import java.util.Scanner;

public class Factoriel {
        public static void main(String[] args) {
        int n;
        int resultat;
        
        Scanner clavier = new Scanner(System.in);
        n = clavier.nextInt();
        
        Factoriel fc = new Factoriel();
        resultat = fc.calculer(n);
       
        System.out.println(n + "! = " + resultat);
        
       
        //Factoriel f= new Factoriel();        
        //System.out.println(n + "! = " + f.calculer(n));
        clavier.close();
        
        
    }

       
    private  int calculer(int n){
        
        int factoriel = 1;
        for (int i=1; i <= n; i++ ){
            factoriel *= i;
        }
        return factoriel;
    }    
}
