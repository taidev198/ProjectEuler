package com.company.superme198.MathProblems;

import java.math.BigInteger;

public class PowerDigitSum {

    public static void powerDigitSum(int n){

        BigInteger b = new BigInteger("2");
       b = b.pow(1000);
       BigInteger res = new BigInteger("0");
        for (;  !b.equals(new BigInteger("0")); ) {
            res = res.add(b.mod(new BigInteger("10")));
            b  = b.divide(new BigInteger("10"));
        }
        System.out.println(res);
    }

    public static void main(String...args){

        powerDigitSum(10000);
    }
}
