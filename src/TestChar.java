public class TestChar {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\u0061';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        //java中字符串不是基本数据类型
        String str = "我爱小茜";
        System.out.println(str);

        //转义字符
        //char c5 = '\n';
        System.out.println("a\nb\nc\ne");

    }
    
}
