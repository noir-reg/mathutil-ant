/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reg.mathutil.core.test;

import com.reg.mathutil.core.MathUtility;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
 

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
     @Test
     //trong ham nay se chua cac testcase de test getF()
     //voi n hop le trong khoang 0..20
     public void testFactorialGivenRightArguementRunsWell(){
         int n =0;
         long expectedValue=1;
         long actual=MathUtility.getFactor(n);
         assertEquals(expectedValue,actual );
         assertEquals(120,MathUtility.getFactor(5) );
         assertEquals(720,MathUtility.getFactor(6) );
     }
    
}
