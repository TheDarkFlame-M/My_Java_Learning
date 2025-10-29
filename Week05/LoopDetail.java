// LoopDetail.java
import java.util.Scanner;

/**
 * 循环结构细节说明
 * 演示循环的各种使用技巧和注意事项
 */
public class LoopDetail {
    public static void main(String[] args) {
        System.out.println("=== for循环细节 ===");
        forLoopDetails();
        
        System.out.println("\n=== 循环控制语句 ===");
        loopControlStatements();
        
        System.out.println("\n=== 用户交互循环 ===");
        userInteractionLoop();
    }
    
    /**
     * for循环的各种写法
     */
    public static void forLoopDetails() {
        System.out.println("1. 标准for循环:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("i = " + i);
        }
        
        System.out.println("2. 外部初始化:");
        int j = 1;
        for (; j <= 3;) {
            System.out.println("j = " + j);
            j++;
        }
        
        System.out.println("3. 多变量操作:");
        for (int a = 0, b = 1, c = 2; a <= 2; a++, b *= 2, c += 3) {
            System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        }
        
        // 注意：无限循环需要谨慎使用
        // for (;;) {
        //     System.out.println("无限循环");
        // }
    }
    
    /**
     * 循环控制语句演示
     */
    public static void loopControlStatements() {
        System.out.println("break语句演示:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("遇到3，提前结束循环");
                break;
            }
            System.out.println("当前值: " + i);
        }
        
        System.out.println("continue语句演示:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("跳过3");
                continue;
            }
            System.out.println("当前值: " + i);
        }
    }
    
    /**
     * 用户交互循环示例
     */
    public static void userInteractionLoop() {
        Scanner scanner = new Scanner(System.in);
        char choice;
        
        do {
            System.out.println("请选择操作:");
            System.out.println("y - 继续执行");
            System.out.println("n - 退出程序");
            System.out.print("请输入选择: ");
            
            choice = scanner.next().charAt(0);
            
            switch (choice) {
                case 'y':
                    System.out.println("继续执行...");
                    break;
                case 'n':
                    System.out.println("准备退出...");
                    break;
                default:
                    System.out.println("输入无效，请重新选择");
            }
        } while (choice != 'n');
        
        System.out.println("程序结束");
        scanner.close();
    }
}