public class TestOperator01{

    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = a + b;
        System.out.println(c);

        int g = 30;
        g++;//相当于：g = g + 1;
        g--;//相当于：g = g - 1;

        g = 10;
        int h = g++;//g++先赋值，后自增
        g = 10;
        int i = ++g;//++g先自增，后赋值

        System.out.println(h);
        System.out.println(i);

    }

}