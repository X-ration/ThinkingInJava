package com.adam.ch2.p6;

/**
 * @author adam
 * 创建于 2018-05-18 10:05.
 */
public class StorgeMain {

    static int storge(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        String s = "HelloWorld!哈哈哈";
        System.out.println(storge(s));
    }

}