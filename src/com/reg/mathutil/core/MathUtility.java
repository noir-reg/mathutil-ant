/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.reg.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {

    public static final double PI = 3.1415;
    //ham tinh n!=1 x 2 x 3 x ... x n
    //ko co giai thua cho so am
    //0! = 1! = 1 quy uoc 0! = 1
    //vi giai thua tang gia tri rat nhanh, 20 giai thua vua du cho 18 so 0
    //tuc la 21! tramn kieu Long
    //quy tinh ham nay chi tinh 0 toi 20!
    //dung for hoac recursion

    public static long getFactor(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0...20!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) 
            product *= i;       
        return product;
    }
}
