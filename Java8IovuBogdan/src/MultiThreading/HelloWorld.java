/*
 *HelloWorld as new Thread
 */
package MultiThreading;

/**
 *
 * @author bogdan
 */
public class HelloWorld extends Thread {
       class PrimeThread extends Thread {
         long minPrime;
         PrimeThread(long minPrime) {
             this.minPrime = minPrime;
         }

         public void run() {
        System.out.println("Hello World");
          
         }
     }
 

}
