package com.icewolf_li;

//数组的声明和创建
//包含动态初始化
public class Test01 {
    public static void main(String[] args) {
        int[] a = new int[5];

        int[] s;
        s = new int[10];

        for (int i=0;i<10;i++){
            s[i] = 2*i+1;
        }

        for (int i=0;i<10;i++){
            System.out.println(s[i]);
        }

        Man[] mans = new Man[10];

        Man m1 = new Man(1,11);
        Man m2 = new Man(2,22);

        mans[0]=m1;//给引用类型数组元素赋值;
        mans[1]=m2;//给引用类型数组元素赋值;

        System.out.println(mans[0].getId());
        System.out.println(mans[0].getAge());


    }
}

class Man{
    private int age;
    private int id;
    public Man(int id,int age){
        super();
        this.age = age;
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}