/**
 * 测试逻辑、关系运算符的用法
 */
public class TestOperator04{
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1 & b2);
        System.out.println(b1 | b2);
        System.out.println(!b2);
        System.out.println(b1 ^ b2);

        boolean b3 = 1>2 && (4<3/0);
        System.out.println(b3);
    }

}