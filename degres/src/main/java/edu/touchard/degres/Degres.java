package edu.touchard.degres;

import java.util.Scanner;

/**
 *
 * @author psimier
 */
public class Degres {
    
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
        Scanner clavier = new Scanner(System.in);
        fahrenheit = clavier.nextDouble();
        clavier.close();
        
        Degres x = new Degres();
        celsius = x.convertirCelsius(fahrenheit);
        
                
        System.out.println("Celsius : " + celsius);
        
        fahrenheit = x.convertirFahrenheit(celsius);
        
        System.out.println("Fahrenheit : " + fahrenheit);
    } 
    
    public double convertirCelsius(double fahrenheit ){
        return (5.0/9.0)*(fahrenheit-32);
    }
    
    public double convertirFahrenheit(double celsius ){
        return (9.0/5.0)*celsius + 32;
    }
    
}
