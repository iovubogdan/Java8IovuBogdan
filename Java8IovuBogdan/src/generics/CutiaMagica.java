/*
 *Testing our Cutie
 */
package generics;

/**
 *Testing our Cutie
 * @author bogdan
 */
public class CutiaMagica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create two Cutie, one for Pantof and one for Cizma
        Cutie<Pantof> cutieDePantofi=new Cutie<>();
        Cutie<Cizma> cutieDeCizme=new Cutie<>();
        //create a Pantof and it in the Cutie<Pantof>
        Pantof pantofi = new Pantof();
        cutieDePantofi.setT(pantofi);
        //create a Cizma and put it in the Cutie<Cizma>
        Cizma cizme =new Cizma();
        cutieDeCizme.setT(cizme);
        //testing objects
        cutieDePantofi.getT().message();
        cutieDeCizme.getT().message();
        //pacalesc cutia si pun altceva decat incaltaminte
        Integer  dePusInCutie =100;
        Cutie<Integer>cutieAbsurdaDeIntregi=new Cutie<>();
        cutieAbsurdaDeIntregi.setT(dePusInCutie);
        
        
        
    }
    
}
