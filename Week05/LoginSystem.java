import java.util.Scanner;

/**
 * 实现登录验证，有3次机会
 * 用户名为"TheDarkFlame-M",密码"666666"
 * 提示登录成功，否则提示还有几次机会
 */
public class LoginSystem {
    public static void main(String[] args) {
        String correctName = "TheDarkFlame-M";
        String correctPassword = "666666";
        int maxTry = 3;
        
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= maxTry; i++) {
            System.out.print("请输入用户名: ");
            String name = scanner.next();
            System.out.print("请输入密码: ");
            String password = scanner.next();
            
            if (correctName.equals(name) && correctPassword.equals(password)) {
                System.out.println("登录成功！");
                break;
            } else {
                int left = maxTry - i;
                if (left > 0) {
                    System.out.println("登录失败，还有" + left + "次机会");
                } else {
                    System.out.println("机会用完，登录失败");
                }
            }
        }
        
        scanner.close();
    }
}