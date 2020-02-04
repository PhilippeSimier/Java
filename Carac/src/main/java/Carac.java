
import java.util.Scanner;
/**
 *
 * @author yletessier
 */
public class Carac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
       
        
        boolean ok;
        Carac   monClavier = new Carac();
        
               
        ok = monClavier.verifierCode();
        if (ok){
            System.out.println("La porte s'ouvre");
        }
        else{
            System.out.println("Vous n'êtes pas autorisé à entrer");
        }
        
    }
    
    boolean verifierCode(){
        
        String codeSecret = "1234";
        String codeClavier;
        int cpt = 0;
        boolean retour;
        
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("entrer 4 caractères : ");      
            codeClavier = sc.next(); 
            if (!codeClavier.equals(codeSecret)) {
                System.out.println("code non conforme");
                retour = false;
            } else {
                System.out.println("Code conforme");
                retour = true;
            }
            cpt++;
        }while(cpt<3 && ! codeClavier.equals(codeSecret) );
        sc.close();
        return retour;
        
    }
}
