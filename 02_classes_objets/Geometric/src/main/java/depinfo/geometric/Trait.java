package depinfo.geometric;

public class Trait {
    
    private Point debut;
    private Point fin;
    private int epaisseur;
    private String style; 
    
    
    // constructeur par défaut
    public Trait() {
        this.debut = new Point();
        this.fin = new Point();
        this.epaisseur = 1;
        this.style = "continu";
        
    }

    public Trait(Point debut, Point fin) {
        this.debut = debut;
        this.fin = fin;
        this.epaisseur = 1;
        this.style = "continu";
    }
    
    public double calculerLongueur(){
       return debut.calculerDistancePoint(fin);
    }
    
    
    
}
