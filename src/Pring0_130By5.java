public class Pring0_130By5 {
    public static void main(String[] args) {
        int i=0;
        int count=0;//计算打印了几个数
        while(i<+130){
            System.out.print(i+"\t");
            /*if(i%5==0){
                System.out.println();
            }*/
            count++;
            if(count==5){
                System.out.println();
                count=0;
            }

            i++;
        }
    }
}
