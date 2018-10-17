package com.company.superme198.MathProblems;

import java.math.BigInteger;

public class FactorialDigitSum {

    public static void factorialDigitSum(int n){

        BigInteger b = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            b = b.multiply(new BigInteger(Integer.toString(i)));
        }
        BigInteger ans = new BigInteger("0");
        while (!b.equals(new BigInteger("0"))){
            ans = ans.add(b.mod(new BigInteger("10")));
            b = b.divide(new BigInteger("10"));
        }
        System.out.println(ans);
    }
    public static void main(String...args){

        factorialDigitSum(100);
    }
}
