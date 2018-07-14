/*
 * Testeaza sincronizarea threadurilor
 */
package MultiThreading;

/**
 *Testeaza sincronizarea threadurilor
 * @author bogdan
 */
public class TestMultiTHreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a Contor
        //create addition THread
        //create substractions THread
        //start both threads
        Contor c=new Contor();
        ThreadAdunare a= new ThreadAdunare(c);
        ThreadScadere s= new ThreadScadere(c);
        a.start();
        s.start();
    }
    
}
