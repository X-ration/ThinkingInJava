package com.adam.ch2.p10;

/**
 * @author adam
 * 创建于 2018-05-18 10:23.
 * adam@adam01:~/idea/ThinkingInJava/src$ java com.adam.ch2.p10.ArgsMain Hi java arg
 */
public class ArgsMain {

    public static void main(String[] args) {
        if(args.length<3){
            System.err.println("The number of command line args less than 3!");
        } else {
            System.out.println("arg0: " + args[0]);
            System.out.println("arg1: " + args[1]);
            System.out.println("arg2: " + args[2]);
        }
    }

}
