package depinfo.points;

/**
 *
 * @author psimier
 */
public class Geometrique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1, p2, p3, p4 ;
        p1 = new Point() ;
        p2 = new Point(1.0, 2.1, "p2");
        p3 = new Point(p2) ;
        p4 = p1 ;
        p4.setX(1);
    }
    
}
