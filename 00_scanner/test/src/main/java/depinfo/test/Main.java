
package depinfo.test;

import java.util.Scanner;

/**
 *
 * @author psimier
 */
public class Main {

    /**
     * @param args the command line arguments
     * programme de compréhension de la classe scanner
     */
    public static void main(String[] args) {
        
        String nom;
        String prenom;
        int age;
        float taille;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Prénom : ");
        prenom = sc.next();
        System.out.println("Nom : ");
        nom = sc.next();
        System.out.println("Age : ");
        age = sc.nextInt();
        System.out.println("Taille : ");
        taille = sc.nextFloat();
        
        System.out.println("Récapulatif : ");
        System.out.println(prenom);
        System.out.println(nom);
        System.out.println(age);
        System.out.println(taille);
        
        sc.close();          
    }
    
}
