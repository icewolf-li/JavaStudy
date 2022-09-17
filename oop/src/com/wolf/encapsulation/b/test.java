package com.wolf.encapsulation.b;

public class test {
    public static void main(String[] args) {
        User u = new User(99,"icewolf_li",true);
//        u.setId(100);
//        u.setName("ok");
//        u.setMan(false);

        System.out.println(u.getName());
        System.out.println(u.isMan());
    }
}
