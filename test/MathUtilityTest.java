/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.reg.mathutil.core.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author Admin
 */
@RunWith(value=Parameterized.class)
public class MathUtilityTest {
   @Parameterized.Parameters 
  public static Object[][] initData(){
      return new Object[][]{
          {0, 1},
          {1, 1},
          {2, 2},
          {3, 6},
          {4, 24},
          {5, 120}  
      };
  }
  @Parameterized.Parameter(value = 0)
  public int n;
  @Parameterized.Parameter(value = 1)
  public long expected;
    @Test 
    public void testFactorialGivenrightArguementReturnsWell(){
        assertEquals(expected, MathUtility.getFactor(n));
    }
}
