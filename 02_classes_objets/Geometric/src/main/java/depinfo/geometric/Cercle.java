
package depinfo.geometric;

/**
 *
 * @author psimier
 */
public class Cercle {
    private double diametre;
    private String id;

    public Cercle() {
        diametre = 0.0;
        id = "Origin";
    }

    public Cercle(double diametre, String id) {
        this.diametre = diametre;
        this.id = id;
    }
    
    public double calculerAire(){
         return (Math.PI * diametre * diametre / 4);    
    }
    
    public double calculerPerimetre(){
        return (Math.PI * diametre);
    }
    




}

