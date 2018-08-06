/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author ESFOT
 */
public class Isosceles implements Triangulos{
     double lado1Isosceles;
   double lado2Isosceles;

    public Isosceles(double lado1Isosceles, double lado2Isosceles) {
        this.lado1Isosceles = lado1Isosceles;
        this.lado2Isosceles = lado2Isosceles;
    }

    public double getLado1Isosceles() {
        return lado1Isosceles;
    }

    public void setLado1Isosceles(double lado1Isosceles) {
        this.lado1Isosceles = lado1Isosceles;
    }

    public double getLado2Isosceles() {
        return lado2Isosceles;
    }

    public void setLado2Isosceles(double lado2Isosceles) {
        this.lado2Isosceles = lado2Isosceles;
    }

    @Override
    public double calcularPerimetro() {
       return 2*lado1Isosceles+lado2Isosceles; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea() {
        double a=lado2Isosceles*(Math.sqrt(Math.pow(lado1Isosceles, 2)-(Math.pow(lado2Isosceles, 2)/4))/2);
       return  a; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularAltura() {
        
        double h=Math.sqrt(Math.pow(lado1Isosceles, 2)-((Math.pow(lado1Isosceles, 2)/4)));
        return h; //To change body of generated methods, choose Tools | Templates.
    }
    
   
}
