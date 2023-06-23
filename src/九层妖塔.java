public class 九层妖塔 {
    public static void main(String[] args) {
        int level = 9;
        for (int i=0;i<level;i++){
            for (int n=0;n<(level-1)-i;n++){
                System.out.print(" ");
            }
            for (int n=0;n<i*2+1;n++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
