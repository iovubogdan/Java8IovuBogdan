/*
 * Class Rectangle that returns definition of Rectangle
 */
package java8tdd;

/**
 *Class Rectangle that returns definition of Rectangle
 * @author bogdan
 */
public class Rectangle extends Plane {
   private String definition;
   //constructor of rectangle that builds complete definition
   public Rectangle(){
   definition=super.getDefinition()+" with four straight sides and four right angles,\n" +
"especially one with unequal adjacent sides, in contrast to a square.";
   }
   //returns definition of Rectangle
   @Override
   public String getDefinition(){
   return definition;
   }
}
