package oriented;

public class Object_method {
    public static void main(String[] args) {
        // TODO 面向对象 - 方法
        // 声明的语法: void 方法名() {}
        User user = new User();
        boolean registerResult = user.register();
        if (registerResult){
            System.out.println("注册成功");
            boolean loginResult = user.login();
            if (loginResult){
                System.out.println("登录成功");
            }else {
                System.out.println("登录失败");
            }
        }else {
            System.out.println("注册失败");
        }
    }
}
class User {
    String  account;
    String password;

    boolean register(){
        System.out.println("注册");
        return true;
    }

    boolean login(){
        System.out.println("登录");
        return false;
    }
}