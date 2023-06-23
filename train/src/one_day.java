import java.util.Scanner;

public class one_day{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("age:");
        int age = sc.nextInt();
        System.out.println("home:");
        String home = sc.nextLine();
        System.out.println("name:");
        String name = sc.nextLine();
        System.out.println("gender boy?:");
        Boolean gender = sc.nextBoolean();

        String gender_get;

        if (gender){
            gender_get = "男";
        }else {
            gender_get = "女";
        }

        System.out.println("你的名字是:"+name);
        System.out.println("你的年龄："+age);
        System.out.println("你的家庭住址:"+home);
        System.out.println("你的性别："+gender_get);
    }
}
