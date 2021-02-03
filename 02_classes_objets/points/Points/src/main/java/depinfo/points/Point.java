
package depinfo.points;

/**
 *
 * @author psimier
 */
public class Point {
    
    // Attributs
    private double x;
    private double y;
    private String id;
    
    // Methode Constructeur par défaut
    public Point(){
        this.x = 0;
        this.y = 0;
        this.id = "Origine";
    }
    
    // Methode constructeur avec paramètres
    public Point(double x, double y, String id){
        this.x = x;
        this.y = y;
        this.id = id;
    }
    
    public Point (Point p){
        this.x = p.getX();
        this.y = p.getY();
        this.id = p.getId()+ "(copie)";
    }

    // Les Méthodes Getters
    public String getId() {
        return id;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Les Méthodes Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    // Méthode pour afficher à l'écran l'abscisse et l'ordonnée du point.
    public void afficher(){
        System.out.println(this.id + " (" + this.x + " , " +  this.y + ")");
    }
    
    // Méthode pour déplacer selon l'offset (dx,dy)
    public void translater(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }
    
    // Méthode pour calculer la distance du point par rapport à l'origine
    public double calculerDistance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
    
    // Méthode pour calculer la distance entre la point courant et le point en paramètre.
    public double calculerDistancePoint(Point p){
        double dx = this.x -p.x;
        double dy = this.y -p.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
