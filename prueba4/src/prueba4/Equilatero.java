/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba4;

/**
 *
 * @author ESFOT
 */
public class Equilatero implements Triangulos{
    
     double lado1Equilatero;

    public Equilatero(double lado1Equilatero) {
        this.lado1Equilatero = lado1Equilatero;
    }

    public double getLado1Equilatero() {
        return lado1Equilatero;
    }

    public void setLado1Equilatero(double lado1Equilatero) {
        this.lado1Equilatero = lado1Equilatero;
    }

    @Override
    public double calcularPerimetro() {
        return 3*lado1Equilatero; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3*lado1Equilatero)/2)*Math.pow(lado1Equilatero, 2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularAltura() {
       return(Math.sqrt(3*lado1Equilatero)/2) ; //To change body of generated methods, choose Tools | Templates.
    }
     
     
   
    
}
