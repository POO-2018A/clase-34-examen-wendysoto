/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;

import static java.lang.Math.pow;

/**
 *
 * @author ESFOT
 */
public class Rectangulo implements Triangulos{
    
  double lado1Rectangulo;
   double lado2Rectangulo;

    public Rectangulo(double lado1Rectangulo, double lado2Rectangulo) {
        this.lado1Rectangulo = lado1Rectangulo;
        this.lado2Rectangulo = lado2Rectangulo;
    }

    public double getLado1Rectangulo() {
        return lado1Rectangulo;
    }

    public void setLado1Rectangulo(double lado1Rectangulo) {
        this.lado1Rectangulo = lado1Rectangulo;
    }

    public double getLado2Rectangulo() {
        return lado2Rectangulo;
    }

    public void setLado2Rectangulo(double lado2Rectangulo) {
        this.lado2Rectangulo = lado2Rectangulo;
    }
    
   
    @Override
    public double calcularPerimetro() {
        int x=0;
       return(lado1Rectangulo+lado2Rectangulo+x); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea() {
        return((lado1Rectangulo*lado2Rectangulo)/2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularAltura() {
        int c=0;
       return((lado1Rectangulo*lado2Rectangulo)/c); //To change body of generated methods, choose Tools | Templates.
    }
   
   
  
  
}
