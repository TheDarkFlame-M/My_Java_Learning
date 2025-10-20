import java.util.Scanner;

/**
 * 综合分支控制演示
 * 展示各种分支控制结构的实际应用
 */
public class BranchControlDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== 综合分支控制演示 ===\n");
        
        // 多条件判断示例
        System.out.println("多条件判断示例:");
        System.out.print("请输入一个整数: ");
        int number = scanner.nextInt();
        
        if (number > 0) {
            System.out.println("这是一个正数");
        } else if (number < 0) {
            System.out.println("这是一个负数");
        } else {
            System.out.println("这是零");
        }
        
        // 逻辑运算符组合使用
        System.out.println("\n逻辑运算符组合使用:");
        System.out.print("请输入成绩(0-100): ");
        int score = scanner.nextInt();
        
        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 70 && score < 90) {
            System.out.println("良好");
        } else if (score >= 60 && score < 70) {
            System.out.println("及格");
        } else if (score >= 0 && score < 60) {
            System.out.println("不及格");
        } else {
            System.out.println("成绩输入无效");
        }
    
    }
}