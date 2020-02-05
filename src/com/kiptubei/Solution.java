/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kiptubei;

import java.math.BigInteger;

/**
 *
 * @author mark
 */
public class Solution {

    /**
     *
     * @param N
     * @return
     */
    public int solution(String N) {
        int ans = 0;
        int count = 0;
        int one = 1;       
         // Initialize the BigInteger type variables ,represent N as an integer
        BigInteger integerN = new BigInteger(N,2);
        
          int j = 0;
          int k=0;
       String r = N;
           while (integerN.doubleValue()>0) {
          /**Test if the binary number is odd or even.
           * if last digit is 0 its even.
           * if it's one it's odd.
           */
            if (r.charAt(r.length()-1)== '0') {
                /*binary rightShift by one divides the number by two*/           
                integerN=integerN.shiftRight(one);
                j = integerN.intValue();
                

            } else {
               /* subtract 1 from integerN if its odd*/
                integerN=integerN.subtract(BigInteger.ONE);
                 k = integerN.intValue();
                               
            }
         
            /*Set r to binary representation of the new number created by the above operation*/
            r = integerN.toString(2);
            
            if(r.equals("-1")){
            System.out.println(integerN);
            }
            count++;
        }

        ans = count;
        return ans;
    }


}
