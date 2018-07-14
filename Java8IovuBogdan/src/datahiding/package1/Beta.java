/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahiding.package1;

/**
 *
 * @author bogdan
 */
public class Beta {
    public void testAlpha(){
    Alpha alphaobject= new Alpha();
    
    alphaobject.publicAttribute=2;
    alphaobject.protectedAttribute=3;
    //alphaobject.privateAttribute=4;
    alphaobject.packageAttribute=5;
    
    }
}
