package depinfo.geometric;

public class Geometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Point p1,p2,p3,p4,p5;
        
        p1 = new Point();
        p2 = new Point(2, 3.5, "A");
        p3 = new Point(p2);
        
        System.out.println("p2 == p3 : " + p2.equals(p3));
        
        p5 = new Point(p3);
        p5.setId("p5");
        p1.afficher();
        p2.afficher();
        p3.afficher();
        p5.afficher();
        
        System.out.println("Distance p2, O : " + p2.calculerDistance() );
        System.out.println("Distance p2 p3 : " + p2.calculerDistancePoint(p3));
        p4 = p3;
        System.out.println("p3 == p4 : " + p3.equals(p4));
        
        
        p4.afficher();
        p4.setX(5);
        p4.setY(5);
        p3.afficher();
        p4.afficher();
        
        Trait t1;
        t1 = new Trait(p1,p2);
        System.out.println(" longueur t1 : " + t1.calculerLongueur());  
        
        Cercle c1 = new Cercle(700,"roue");
        System.out.println("périmetre : " + c1.calculerPerimetre());
    
    }
    
}
