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
public class Escaleno implements Triangulos{
    
     double lado1Escaleno;
     double lado2Escaleno;
     double lado3Escaleno;

    public Escaleno(double lado1Escaleno, double lado2Escaleno, double lado3Escaleno) {
        this.lado1Escaleno = lado1Escaleno;
        this.lado2Escaleno = lado2Escaleno;
        this.lado3Escaleno = lado3Escaleno;
    }

    public void setLado1Escaleno(double lado1Escaleno) {
        this.lado1Escaleno = lado1Escaleno;
    }

    public void setLado2Escaleno(double lado2Escaleno) {
        this.lado2Escaleno = lado2Escaleno;
    }

    public void setLado3Escaleno(double lado3Escaleno) {
        this.lado3Escaleno = lado3Escaleno;
    }

    @Override
    public double calcularPerimetro() {
       return lado1Escaleno+lado2Escaleno+lado3Escaleno; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularArea() {
        return 0; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double calcularAltura() {
        return 0; //To change body of generated methods, choose Tools | Templates.
    }
     
     
  
}
