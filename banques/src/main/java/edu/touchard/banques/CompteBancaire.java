package edu.touchard.banques;

/**
 *
 * @author psimier
 */
public class CompteBancaire {
    static private int dernier;
    protected int numero;
    protected double solde;
    
    
    
    /**
     * Constructeur par défaut
     */
    public CompteBancaire(){
        this.numero = dernier++;
        this.solde = 0.0;
        
    }
    
    /**
     * Constructeur de la classe Compte bancaire
     * @param soldeInitial 
     */
    public CompteBancaire(double soldeInitial){
        this.numero = dernier++;
        this.solde = soldeInitial;
        System.out.println("Constructeur de Compte Bancaire ");
        System.out.println("avec solde initiale ");
        
    }
    /**
     * Constructeur de copie
     * @param autre un autre compte bancaire
     */
    public CompteBancaire(CompteBancaire autre){
        this.numero = dernier++;
        this.solde = autre.solde;
       
    }
    
    public void deposer(double montant){
        if(montant > 0){
            this.solde += montant;
        }
        
        
    }
    
    public void retirer(double montant){
        if(solde  >= montant && montant > 0){
            solde -= montant;
        }
        
    }
    
    public double consulterSolde(){
        return this.solde;
    }
    
    
    
    public void afficher(){
        
        System.out.println("Compte Bancaire n° : " + numero);
        System.out.println("Solde : " + solde);
        
    }
    
    
}
