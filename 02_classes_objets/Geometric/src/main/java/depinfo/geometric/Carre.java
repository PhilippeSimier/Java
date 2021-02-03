package depinfo.geometric;

/**
 *
 * @author psimier
 */
public class Carre {
    
    private double cote;
    private String id;

    public Carre() {
        this.cote = 0;
        this.id = "Defaut";
    }

    public Carre(double cote, String id) {
        this.cote = cote;
        this.id = id;
    }
    
    public Carre( Carre autreCarre){
        this.cote = autreCarre.cote;
        this.id = "copie_" + autreCarre.id;
    }
    
    public double calculerAire(){
        return this.cote * this.cote;
    }
    
    
    
    
    
    
}
