public class TestTypeCast {
    public static void main(String[] args) {
        double a = 3.94152;
        int b = (int)a;//浮点数强转为整数，直接丢失小数
        System.out.println(b);

        int c = 97;
        char d = (char)c;
        System.out.println(d);

        //强制转型，超过了表述范围，则会转成一个完全不同的值
        byte e = (byte)300;
        System.out.println(e); 


    }
}
