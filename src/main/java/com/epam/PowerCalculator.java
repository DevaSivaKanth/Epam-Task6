package com.epam;

public class PowerCalculator {
    /*
     * @Siva Kanth
     * Create the method long power(int n, int p).
     * Throws Exceptions when n = 0 and p = 0.
     * Throws Exceptions when n,p < 0.
     */
     long power(int n,int p) throws Exception
     {
         if(n==0 && p==0)
         {
             throw new Exception("n and p should not be zero.");
         }
         else if(n<0 || p<0)
         {
             throw new Exception("n or p should not be negative.");
         }
         else
             return (long)Math.pow(n,p);
     }
 }