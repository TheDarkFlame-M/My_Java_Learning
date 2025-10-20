//import java.uti1.Scanner;//导入
import java.util.Scanner;

/**
 * 分支控制if-else基础演示
 * 包含单分支和双分支的用法示例
 */
public class IfBasicDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 示例1: 单分支if语句
        System.out.println("=== 单分支if语句演示 ===");
        System.out.print("请输入年龄: ");
        int age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("这个世界很残酷，但依旧有值得我们爱的人");
        }
        if (age < 18) {
            System.out.println("我身上背负着什么，使我来到了这个世界");
            System.out.println("我只是以何种形式，出现在这个世界");
        }
        System.out.println("世界之法则...");
        
        // 示例2: 双分支if-else语句
        System.out.println("\n=== 双分支if-else语句演示 ===");
        System.out.print("请再次输入年龄: ");
        age = scanner.nextInt();
        
        if (age >= 18) {
            System.out.println("这个世界很残酷，但依旧有值得我们爱的人");
        } else {
            System.out.println("我身上背负着什么，使我来到了这个世界");
            System.out.println("我只是以何种形式，出现在这个世界");
        }
        System.out.println("世界之法则...");
        
    
    }
}