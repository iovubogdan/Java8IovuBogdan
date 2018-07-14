/*
 * To change this license header, choose License Headers in Project Properties.
 * autoservice
 * and open the template in the editor.
 */
package autoservice;

/**
 *Autoservice class
 * @author bogdan
 */
public class Autoservice {
    public static void main(String[] args)
    {
      Car mertzan= new Car("MERCEDES",230,Car.Culoare.GREEN);
      Car dacia=new Car("DACIA",180,Car.Culoare.MAGENTA);
      Car logan=new Car("LOGAN",210,Car.Culoare.RED);
    
    mertzan.setMarca("MERCEDES");
    mertzan.setVitezaMaxima(260);
    mertzan.setCuloare(Car.Culoare.BLUE);
    
    }
    
}
