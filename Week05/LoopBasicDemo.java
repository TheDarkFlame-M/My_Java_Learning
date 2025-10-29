// LoopBasicDemo.java
/**
 * 循环结构基础演示
 * 包含while、do-while、for三种循环的基本用法
 */
public class LoopBasicDemo {
    public static void main(String[] args) {
        System.out.println("=== while循环演示 ===");
        whileLoopDemo();
        
        System.out.println("\n=== do-while循环演示 ===");
        doWhileLoopDemo();
        
        System.out.println("\n=== for循环演示 ===");
        forLoopDemo();
    }
    
    /**
     * while循环示例
     * 特点：先判断条件，再执行循环体
     */
    public static void whileLoopDemo() {
        int count = 1;
        while (count <= 5) {
            System.out.println("while循环执行第" + count + "次");
            count++;
        }
    }
    
    /**
     * do-while循环示例
     * 特点：先执行循环体，再判断条件，至少执行一次
     */
    public static void doWhileLoopDemo() {
        int count = 1;
        do {
            System.out.println("do-while循环执行第" + count + "次");
            count++;
        } while (count <= 5);
    }
    
    /**
     * for循环示例
     * 特点：明确的循环次数控制，结构紧凑
     */
    public static void forLoopDemo() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("for循环执行第" + i + "次");
        }
    }
}