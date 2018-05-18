package com.adam.ch2.p1;

/**
 * @author adam
 * 创建于 2018-05-18 09:37.
 * 基本数据类型成员默认值。
 */
public class DefaultInitializationMain {

    public static void main(String[] args) {
        AClass aClass = new AClass();
        System.out.println(aClass.integer);
        System.out.println(((int) aClass.character));
    }

}
