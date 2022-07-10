public class TestFor {
    public static void main(String[] args) {
        int sum=0;
        for(int a = 0;a<3;a++){
            System.out.println("I love you!---"+a);
        }

        for(int i = 0;i<=100;i++){
            sum=sum+i;
        }
        System.out.println(sum);

        //输出9-1之间的数
        for(int i=9;i>0;i--){
            System.out.println(i+"\t");
        }

        //输出98-1之间能被3整除的数
        for (int i=98;i>0;i-=3){
            System.out.println(i+"\t");
        }
    }
}
