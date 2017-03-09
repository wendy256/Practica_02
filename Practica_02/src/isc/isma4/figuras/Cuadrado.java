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
public class Cuadrado extends Figura{
    
    double lado;
  public Cuadrado (double lado){
        this.lado=lado;
    }  

    @Override
    public double getArea() {
        
        return lado * lado;
    }    
        
        
    
    
}
