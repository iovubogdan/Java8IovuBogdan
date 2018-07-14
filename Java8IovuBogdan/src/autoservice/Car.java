/*
 * To change this license header, choose License Headers in Project Properties.
 * Clasa car
 * and open the template in the editor.
 */
package autoservice;

/**
 *
 * @author bogdan
 */
public class Car implements Vandabila, Inchiriabila {
    public enum Culoare{
    RED,GREEN,BLUE,MAGENTA;
    
    }
   //comentariu  pe o linie
    private String marca;
        private int vitezaMaxima;
    private Culoare culoare;
    public Car(String nouaMarca, int nouaViteza,Culoare nouaCuloare){
        marca= nouaMarca;
        vitezaMaxima=nouaViteza;
        culoare=nouaCuloare;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setCuloare(Culoare culoare) {
        this.culoare = culoare;
    }

    public Culoare getCuloare() {
        return culoare;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    @Override
    public int getPretVanzare() {
        return(260);
    }

    @Override
    public int getPretInchiriabila() {
      return(25);
    }
   
    
    
    
}
