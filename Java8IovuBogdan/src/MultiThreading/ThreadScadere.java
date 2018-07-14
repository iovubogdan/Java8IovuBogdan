/*
 *Thread Scadere
 */
package MultiThreading;

/**
 *Thread Scadere
 * @author bogdan
 */
public class ThreadScadere extends Thread{
    Contor contorLocalScadere;
    public ThreadScadere(Contor c){
       contorLocalScadere=c; 
    }
    @Override
    public void run(){
        for(int i = 0; i<500;i++)
        contorLocalScadere.sub();
    }
}
