/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datahiding.package2;
import datahiding.package1.Alpha;
/**
 *SubAlpha extends Alpha
 * @author bogdan
 */
public class SubAlpha extends Alpha {
  public void testParentFromOtherPackage(){
  super.publicAttribute=44;
  super.protectedAttribute=45;
  //super.privateAttribute=46;
  //super.packageAttribute=47;
  
  }  
}
