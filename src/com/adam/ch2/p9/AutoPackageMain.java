package com.adam.ch2.p9;

import java.math.BigInteger;

/**
 * @author adam
 * 创建于 2018-05-18 10:14.
 */
public class AutoPackageMain {
    /* Compilation passes */
    public static void main(String[] args) {
        //Auto Package
        Boolean b = true;
        Character c = 'd';
        Byte bt = 40;
        Short s = 4000;
        Integer i = 400000000;
        Long l = 4000000000000000000L;
        Float f = 1.233233f;
        Double d = 2.43444322223d;
        System.out.println(b);
        System.out.println(c);
        System.out.println(bt);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);

        //BigInteger
        BigInteger bigInteger = new BigInteger("1122121212222121988844412131212");
        BigInteger bigInteger1 = new BigInteger("1244423231940923082398924829288");
        System.out.println(bigInteger.multiply(bigInteger1));
    }
}
