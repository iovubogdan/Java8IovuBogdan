/*
 * Class Triangle that returns definition of Triangle
 */
package java8tdd;

/**
 *Class Triangle that returns definition of Triangle
 * @author bogdan
 */
public class Triangle extends Plane {
   private String definition;
   //constructor of Triangle that builds complete definition
   public Triangle(){
   definition=super.getDefinition()+" figure with three straight sides and three angles";
   }
   //returns definition of Triangle
   @Override
   public String getDefinition(){
   return definition;
   }
}
