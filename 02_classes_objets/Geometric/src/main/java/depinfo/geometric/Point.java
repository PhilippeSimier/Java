package depinfo.geometric;

/**
 *
 * @author psimier
 */
public class Point {
    
    private double x;
    private double y;
    private double z;
    private String id;

    // Constructeur par défaut 
    public Point() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.id = "Origine";
    }

    public Point(double x, double y, String id) {
        this.x = x;
        this.y = y;
        this.z = 0;
        this.id = id;
    }
    
    // Constructeur par copie
    public Point(Point autrePoint){
        this.x = autrePoint.x;
        this.y = autrePoint.y;
        this.z = autrePoint.z;
        this.id = autrePoint.id + "_copie";
    }
    
    // Methode pour afficher
    public void afficher(){
        System.out.println(id + "(" + this.x + "," + this.y + "," + this.z +")");
    }
    
    // Calculer distance par rapport à l'origine
    
    public double calculerDistance(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    public double calculerDistancePoint(Point p){
         double dx = this.x - p.x;
         double dy = this.y - p.y;
         double dz = this.z - p.z;
         return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    
    /* La méthode equals
        La classe Object de Java propose la méthode equals(). 
        Cette méthode permet de comparer la valeur de deux instances. 
        Par défaut, l'implémentation retourne true si le paramètre est égal à this. 
        Une instance a toujours la même valeur qu'elle-même. 
        Par contre, deux instances différentes peuvent avoir également la même valeur.
        Ici deux points sont égaux s'ils ont les mêmes coordonées. 
    
    */ 
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Point other = (Point) obj;
        if (Double.doubleToLongBits(this.x) != Double.doubleToLongBits(other.x)) {
            return false;
        }
        if (Double.doubleToLongBits(this.y) != Double.doubleToLongBits(other.y)) {
            return false;
        }
        if (Double.doubleToLongBits(this.z) != Double.doubleToLongBits(other.z)) {
            return false;
        }
        return true;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getId() {
        return id;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
