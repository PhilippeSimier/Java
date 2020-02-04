/**
 *
 * @author psimier
 */
package edu.touchard.temperature;


import java.util.Scanner;

public class Temperature {
    
    private double valeur;
     
    public double convertirCelsius(double fahrenheit ){
        return (5.0/9.0)*(fahrenheit-32);
    }
    
    public double convertirFahrenheit(double celsius ){
        return (9.0/5.0)*celsius + 32;
    }
    
    public static void main(String[] args) {
        double celsius;
        double fahrenheit;
        
        Scanner clavier = new Scanner(System.in);
        fahrenheit = clavier.nextDouble();
        clavier.close();
        
        Temperature x = new Temperature();
        celsius = x.convertirCelsius(fahrenheit);
        
                
        System.out.println("Celsius : " + celsius);
        
        fahrenheit = x.convertirFahrenheit(celsius);
        
        System.out.println("Fahrenheit : " + fahrenheit);
    } 
    
}
