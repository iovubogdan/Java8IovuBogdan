/*
 * Class Square that returns definition of Square
 */
package java8tdd;

/**
 *Class Square that returns definition of Square
 * @author bogdan
 */
public class Square extends Plane {
   private String definition;
   //constructor of square that builds complete definition
   public Square(){
   definition=super.getDefinition()+ " with four equal straight sides and four right angles.";
   }
   //returns definition of Square
   @Override
   public String getDefinition(){
   return definition;
   }
}
