public class TestSwitch01 {
    public static void main(String[] args) {
        int grade = (int)(Math.random()*4)+1;
        switch(grade){
            case 1:
                System.out.println("大一");
                break;
            case 2:
                System.out.println("aaa");
                break;
            case 3:
                System.out.println("ll");
                break;
            default:
                System.out.println("时间过的真快！！");
                break;
        }
        if(grade==1){
            System.out.println("大一！");
        }else if(grade==2){
            System.out.println("大二");
        }
    }    
}
