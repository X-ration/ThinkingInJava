package com.adam.ch2.p11;

/**
 * @author adam
 * 创建于 2018-05-18 10:29.
 */
public class AllTheColorsOfTheRainbowMain {
    public static void main(String[] args) {
        AllTheColorsOfTheRainbow rainbow = new AllTheColorsOfTheRainbow();
        System.out.println(rainbow.anIntegerRepresentingColors);
        rainbow.changeTheHueOfTheColor(5);
        System.out.println(rainbow.anIntegerRepresentingColors);
    }
}
