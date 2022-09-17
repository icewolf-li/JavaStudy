package com.icewolf_li;

//测试拷贝类
public class Test04 {

    public static void main(String[] args) {
        String[] s = {"狗狗","猫猫","猪猪","鸡鸡","鸭鸭"};
        String[] sBak = new String[6];
        System.arraycopy(s,0,sBak,0,s.length);
        for (int i = 0;i< sBak.length;i++){
            System.out.print(sBak[i]+"\t");
        }
    }
}

//System.arraycopy(数组命，第几号，粘贴，第几号，多少个)；