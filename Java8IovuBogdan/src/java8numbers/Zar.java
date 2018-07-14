/*
 *generates random numbers between 1 and 6
 */
package java8numbers;

/**
 *
 * @author bogdan
 */
public class Zar {

    /**
     * @param args the command line arguments
     * Generates random numbers between 1 and 6
     */
    public static void main(String[] args) {
        for(int counter=0;counter<100;counter++){
            short randomNumber=(short)(Math.random()*10%6+1);
             
            
                System.out.println("Random number value= "+ randomNumber );
        }
    }
    }
    
    


