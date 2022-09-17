/**
 * 一个学生类
 */
public class StxStu {
    int id;
    int age;
    String sname;

    public void study(){
        System.out.println("正在学习");
    }

    public void kickball(){
        System.out.println("正在踢球");
    }

    public static void main(String[] args) {
        StxStu s1 = new StxStu();
        System.out.println(s1.id);
        System.out.println(s1.sname);
        s1.id = 1001;
        s1.sname = "LGC";
        System.out.println(s1.id);
        System.out.println(s1.sname);

        s1.study();
        s1.kickball();

    }
}
