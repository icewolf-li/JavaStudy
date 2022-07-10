/*
 *测试浮点数的基本用法
*/
public class TestFloatNumber {
    public static void main(String[] args) {
        //double d1 =3.14;
        double d2 = 3.14E2;//科学计数法

        float f2 = 1.65F;//浮点常量的默认类型是double，改float后面加F或f
        double d3 = 1.0/10;
        System.out.println(f2==d3);//一个=是赋值，两个==是比较.

        float f4 = 234324332432L;
        float f5 = f4+1;
        System.out.println(f4==f5);

        System.out.println(d2);
        
    }
    
}
