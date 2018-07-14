/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahiding.package2;
import datahiding.package1.Alpha;
/**
 *
 * @author bogdan
 */
public class Gamma {
    Alpha alphaobject = new Alpha();
    public void testAlphaFromOtherPackage(){
    
    alphaobject.publicAttribute=33;
    //alphaobject.privateAttribute=34;
    //alphaobject.protectedAttribute=35;
    //alphaobject.packageAttribute=36;
    
    }
}
