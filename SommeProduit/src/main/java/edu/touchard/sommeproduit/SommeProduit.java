/*
 * Un programme qui calcule et affiche la somme et le produit de 4 réels simple précision
 */
package edu.touchard.sommeproduit;

import java.util.Scanner;

/**
 *
 * @author psimier
 */
public class SommeProduit {
    
     public static void main(String[] args) {
        int valeur[] = new int[4];
        Scanner sc = new Scanner(System.in);
        
        int somme = 0;
        int produit = 1;
        
        for (int i=0; i<4; i++){
           System.out.println("Donner valeur[" + i + "]"); 
           valeur[i] = sc.nextInt();
        }
        for (int i=0; i<4; i++){
           somme += valeur[i];
           produit *= valeur[i];
        }
        System.out.println("somme : " + somme);
        System.out.println("produit : " + produit);
        
        sc.close();
    }
    
}
