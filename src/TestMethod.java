public class TestMethod {
    public static void main(String[] args) {

        sayLoveU();

        add(1,2,3);
    }

    public static void sayLoveU(){
        System.out.println("I Love U!");
        System.out.println("我爱你！");
        System.out.println("520!");
    }

    public static int add(int a,int b,int c){
//        return a+b+c;
        int sum = a+b+c;
        System.out.println("sum:"+sum);
        return sum;
    }
}
