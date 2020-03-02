
package edu.touchard.banques;
import java.util.Scanner;


/**
 *
 * @author psimier
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CompteBancaire compte0, compte1;
        CompteCheque  compte2;
        CompteEpargne compte3;
         
        double val;
        
        compte0 = new CompteBancaire();
        compte1 = new CompteBancaire(100.0);
        compte2 = new CompteCheque();
        compte2.deposer(500);
        
        compte3 = new CompteEpargne(100, 5);
        compte3.changerTaux(7.5);
        
        compte3.crediterInterets();
         
        
        compte0.afficher();
        compte1.afficher();
        compte2.afficher();
        compte3.afficher();
    }
    
}
