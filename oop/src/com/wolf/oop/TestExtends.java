package com.wolf.oop;

/**
 * 测试继承
 */
public class TestExtends {
    public static void main(String[] args) {
        Student s1 = new Student("icewolf_li",170,"java");
        System.out.println(s1 instanceof Student);
        System.out.println(s1 instanceof Person);
    }
}

class Person {
    String name;
    int height;
    public void rest(){
        System.out.println("休息！");
    }
}

//Student 继承 Person
class Student extends Person {
    String major; //专业

    public void study(){
        System.out.println("学习!");
        rest();
        System.out.println(this.name);
    }

    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }


}

class  Boy extends Person{

}