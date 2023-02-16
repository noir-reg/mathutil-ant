/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reg.mathutil.main;

import com.reg.mathutil.core.MathUtility;

/**
 *
 * @author Admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
        testFactorialGivenRightArgumentRunsWell();
        testFactorialGivenWrongArgumentThrowsException();
    }
    //Thiet ke ham getF() la: chi tinh n! tu 0...20
    //Neu dua n<0 hoac n>20 thi ham se khong tinh, chui bang cach nem ra ngoai le!!
    public static void testFactorialGivenWrongArgumentThrowsException(){
        //test case 4: n = -5
        //expected value: an exception is thrown IllegalArguementException
         
        System.out.println("Test -5!: expected = Illegal Arguement is thrown");
        MathUtility.getFactor(-5);
               
        
    }

    public static void testFactorialGivenRightArgumentRunsWell() {
        //test case 1: n = 0
        //expected value : 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = MathUtility.getFactor(n);
        System.out.println("Test " + n + "!: expected = " + expectedValue + " actual: " + actualValue);
        
        //test case 2: n = 1
        //expected value : 1
        n = 1;
        expectedValue = 1;
        actualValue = MathUtility.getFactor(n);
        System.out.println("Test " + n + "!: expected = " + expectedValue + " actual: " + actualValue);

        //test case 3: n = 3
        //expected value : 6
        n = 3;
        expectedValue = 6;
        actualValue = MathUtility.getFactor(n);
        System.out.println("Test " + n + "!: expected = " + expectedValue + " actual: " + actualValue);
    }
}
