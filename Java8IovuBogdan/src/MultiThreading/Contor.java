/*
class Contor
 */
package MultiThreading;

/**
 *class Contor
 * @author bogdan
 */
public class Contor {
    private volatile int contor=0;
    public synchronized void add(){
        contor++;
        System.out.println("Add one = "+contor);
    }
    /**
     * Synchronized method
     */
    public synchronized void sub(){
        contor--;
        System.out.println("Sub one = "+contor);
    }
      /**
     * Synchronized method
     */
}
