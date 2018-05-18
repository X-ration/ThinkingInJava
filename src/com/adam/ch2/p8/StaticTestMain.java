package com.adam.ch2.p8;

/**
 * @author adam
 * 创建于 2018-05-18 10:11.
 */
public class StaticTestMain {
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();
        System.out.println(st1.i++);
        System.out.println(st2.i);
        System.out.println(st3.i);
    }
}
