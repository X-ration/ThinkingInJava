package com.adam.ch2.p5;

/**
 * @author adam
 * 创建于 2018-05-18 10:01.
 */
public class DataOnlyMain {
    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        System.out.println(dataOnly);
        dataOnly.i = 4;
        dataOnly.d = 3.4;
        dataOnly.b = true;
        System.out.println(dataOnly);
    }

}
