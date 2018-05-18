package com.adam.ch2.p7;

/**
 * @author adam
 * 创建于 2018-05-18 10:09.
 */
public class IncrementableMain {

    public static void main(String[] args) {
        Incrementable incrementable = new Incrementable();
        System.out.println(StaticTest.i);
        incrementable.increment();
        System.out.println(StaticTest.i);
        Incrementable.increment();
        System.out.println(StaticTest.i);

    }

}
