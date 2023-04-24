package org.dungeon.utils;

public class MathUtils {

    public static int getNum(){
        return getNum(10);
    }

    public static int getNum(int size) {
        return (int) Math.round(Math.random() * size);
    }
}
