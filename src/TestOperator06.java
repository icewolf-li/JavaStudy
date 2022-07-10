public class TestOperator06 {
    public static void main(String[] args) {
        /** 
        String a = "3";
        int b = 4;
        System.out.print(a+b);

        //条件是String,不是char。若是char,则仍是加法
        char c1 = 'h';
        char c2 ='i';
        System.out.println(c1+c2);
        //通过加空符串使整个+变成连接
        System.out.println(""+c1+c2);
        */



        //条件运算符（三元运算符）
        int score = 90;
        String a = score<60?"不及格":"及格";

        System.out.println(a);

        /**相当于
        if(score<60){
            a = "不及格";
        }else{
            a = "及格";
        }
        */

        int x = -100;
        int flag = x>0?1:(x==0?0:-1);
        System.out.println(flag);




    }
    
}
