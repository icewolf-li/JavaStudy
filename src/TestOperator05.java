public class TestOperator05 {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(~b);

        //移位
        int c = 5<<2;  //相当于：5*2*2
        System.out.println(c);
        System.out.println(40>>3);  

    }
    
}
