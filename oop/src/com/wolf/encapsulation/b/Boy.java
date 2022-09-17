package com.wolf.encapsulation.b;

import com.wolf.encapsulation.a.Person;

public class Boy extends Person {

    public void play(){
        System.out.println(super.testProtected);
        System.out.println(super.testPublic);

        Person p = new Person();



//        System.out.println(p.testPublic);
    }
}
