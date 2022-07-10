public class TestLoop {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for(int j=0;j<5;j++){
        //         System.out.print(i+"\t");

        //     }
        //     System.out.println();
        // }






        //99乘法表
        //1*3=3 2*3=6 3*3=9
        for(int m=1;m<=9;m++){
            for(int n=1;n<=m;n++){
                System.out.print(n+"*"+m+"="+(n*m)+"\t");
            }
            System.out.println();
        }
        


        //交替打印*,#
        for(int i=1;i<=5;i++){
            for(int j=0;j<5;j++){
                if((i+j)%2==1){
                    System.out.print("*\t");
                }else{
                    System.out.print("#\t");
                }
                System.out.print("*\t");
            }
            System.out.println();
        }











    }
}
