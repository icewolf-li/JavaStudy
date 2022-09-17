
//测试字符串
public class TestString {
    public static void main(String[] args) {
        String s0 = null;
        String s1 = ""; //空字符串
        String s2 = "java";
        String s3 = new String("java");
        System.out.println(s1.length());
        System.out.println(s2.length());

        System.out.println("==============================================");
        String g1 = "icewolf";
        String g2 = "icewolf";
        String g3 = new String("icewolf");

        System.out.println(g1 == g2);
        System.out.println(g1 == g3);
        System.out.println(g1.equals(g3));


    }
}
