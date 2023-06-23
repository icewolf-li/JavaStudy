package oriented;

public class Object01 {
    public static void main(String[] args) {
        Cooking c = new Cooking();
        c.name = "红烧排骨";
        c.food = "排骨";

        c.execute();

        Cooking c1 = new Cooking();
        c1.name = "红烧鱼";
        c1.food = "鲫鱼";
        c1.execute();
    }
}

class Cooking{
    //特征
    //名字
    String name;
    //菜的类型
    String type = "红烧";
    //食材
    String food;
    //佐料
    String relish = "大料";

    // TODO 执行
    void execute(){
        System.out.println("准备食材:" + food);
        System.out.println("准备佐料:"+ relish);
        System.out.println("开始烹饪");
        System.out.println("烹饪完成:" + name);
    }
}