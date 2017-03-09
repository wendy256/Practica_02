/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.figuras;

/**
 *
 * @author Alvarez
 */
public class Elipse extends Figura{
    // a es igual al semieje Mayor
    // b es igual al semieje Menor
    double a;
    double b;
    
    public Elipse (double a, double b){
        this.a=a;
        this.b=b;
        
    }

    @Override
    public double getArea() {
    
    return Math.PI*a*b;    
        
    }  
    
}
