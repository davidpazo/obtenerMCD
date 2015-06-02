/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcd;

import java.util.Arrays;
import java.util.Collection;
import mcd.Calculo;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;

/**
 *
 * @author dpazolopez
 */
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CalculoTestBateria {
   private int num1,num2;
   private int expectedResult;

   

   @Before
   public void initialize() {
      
   }

   
   public CalculoTestBateria(int num1, int num2, int expectedResult) {
     this.num1=num1;
     this.num2=num2;
     this.expectedResult=expectedResult;
   }

   @Parameterized.Parameters
   public static Collection SuperficieTest() {
      return Arrays.asList(new Object[][] {
         { 1, 2, 2 },
         { 48, 60, 12 },
         { 56, 34, 2 },
         { 28, 78, 2 },
         { 3, 6, 3 }
      });
   }

   // This test will run 4 times since we have 5 parameters defined
   @Test
   public void testObtenerMCD() {
      System.out.println("Parameterized Number is : " + num1);
      assertEquals(expectedResult, Calculo.obtenerMCD(num1,num2),0);
   }
}