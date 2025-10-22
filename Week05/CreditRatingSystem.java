import java.util.Scanner;

/**
 * 信用评分系统
 * 
 * 功能描述：
 * 根据用户输入的信用分数（0-100）划分信用等级
 * 
 * 评分标准：
 * 100分        -> 信用极好
 * (80,99]分    -> 信用优秀  
 * [60,80]分    -> 信用一般
 * 60分以下      -> 信用需要提升
 */
public class CreditScore {
    public static void main(String[] args) {
        // 创建输入扫描器
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("请输入信用分数(0-100): ");
        int score = scanner.nextInt();
        
        // 验证输入范围
        if (score >= 0 && score <= 100) {
            // 多分支判断信用等级
            if (score == 100) {
                System.out.println("信用极好");
            } else if (score > 80) {
                System.out.println("信用优秀"); 
            } else if (score >= 60) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用需要提升");
            }
        } else {
            System.out.println("分数超出有效范围");
        }
        
        // 关闭扫描器
        scanner.close();
        
        System.out.println("\n程序执行完成");
    }
}