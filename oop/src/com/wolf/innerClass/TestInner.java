package com.wolf.innerClass;

public class TestInner {

    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = new Outer().new Inner();

        i.show();
    }
}
