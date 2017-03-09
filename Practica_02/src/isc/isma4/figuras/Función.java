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
public class Función extends Figura{

    //Simpsom 3/4
    
    public static void main(String[] args) {
final int n = 1000;  
final double a = 0; 
final double b = Math.PI/2; 
double h=(b-a)/n;            
double suma=f(a)+f(b); 
//  impares 
for(int i=1; i<n; i+=2) 
suma+=4*f(a+i*h); 
//  pares 
for(int i=2; i<n; i+=2) 
suma+=2*f(a+i*h); 

System.out.println("El resultado es: "+(suma*h/3)); 

  
}
    public static double f(double x){
        
   return Math.sin(x);

    } 

    @Override
    public double getArea() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
} 
    
        
        
        
    
    