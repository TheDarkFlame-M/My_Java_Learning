/**
 * break, continue, return 用法演示
 */
public class BreakContinueDemo {
    
    public static void main(String[] args) {
        // break 示例
        System.out.println("break示例:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // 跳出循环
            }
            System.out.println("i = " + i);
        }
        
        // continue 示例
        System.out.println("\ncontinue示例:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // 跳过本次循环
            }
            System.out.println("i = " + i);
        }
        
        // return 示例
        System.out.println("\nreturn示例:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                return; // 结束方法
            }
            System.out.println("i = " + i);
        }
        
        System.out.println("这行不会执行");
    }
}