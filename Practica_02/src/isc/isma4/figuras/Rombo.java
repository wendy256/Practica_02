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
public class Rombo extends Figura{
    
     // D es igual a Diagonal mayor (Base) 
    // d es igual a Diagonal manor (Altura)
    double D;
    double d;
    
    
    public Rombo (double D, double d){
    
        this.D=D ;
        this.d=d ;
  

    }  

    @Override
    public double getArea() {
        return (D *d)/2;
    }
    
}