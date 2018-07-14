/*
Class Plane, the mother of all plane figures
 */
package java8tdd;

/**
 *Class Plane, the mother of all plane figures
 * definition specific of Plane
 * @author bogdan
 */
public class Plane extends Shape{
    String definition;
    
    //constructor
    public Plane(){
        definition=super.getDefinition()+" plana";
     }
    
    //return definition
    @Override
    protected String getDefinition(){
    return definition;
    }
}
