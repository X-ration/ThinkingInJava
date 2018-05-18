package com.adam.ch2.p16;

//: initialization/Overloading.java
// Demonstration of both constructor
// and ordinary method overloading.
import static com.adam.ch2.p16.Print.*;

/**
 * class Tree.
 */
class Tree {
    int height;

    /**
     * constructor.
     */
    Tree() {
        print("Planting a seedling");
        height = 0;
    }

    /**
     * overloaded constructor.
     * @param initialHeight initial height of the tree.
     */
    Tree(int initialHeight) {
        height = initialHeight;
        print("Creating new Tree that is " +
                height + " feet tall");
    }

    /**
     * info() method.
     */
    void info() {
        print("Tree is " + height + " feet tall");
    }

    /**
     * Overloaded method
     * @param s prefix
     */
    void info(String s) {
        print(s + ": Tree is " + height + " feet tall");
    }
}

public class Overloading {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        // Overloaded constructor:
        new Tree();
    }
} /* Output:
Creating new Tree that is 0 feet tall
Tree is 0 feet tall
overloaded method: Tree is 0 feet tall
Creating new Tree that is 1 feet tall
Tree is 1 feet tall
overloaded method: Tree is 1 feet tall
Creating new Tree that is 2 feet tall
Tree is 2 feet tall
overloaded method: Tree is 2 feet tall
Creating new Tree that is 3 feet tall
Tree is 3 feet tall
overloaded method: Tree is 3 feet tall
Creating new Tree that is 4 feet tall
Tree is 4 feet tall
overloaded method: Tree is 4 feet tall
Planting a seedling
*///:~