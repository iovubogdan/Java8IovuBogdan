/*
 * Class Delta
 */
package datahiding.package1;

/**
 *Class Delta extends Alpha
 * @author bogdan
 */
public class Delta extends Alpha {
    public void testParent(){
    //super.privateAttribute=11;
    super.publicAttribute=12;
    super.protectedAttribute=13;
    super.packageAttribute=14;
    
    
    }
}
