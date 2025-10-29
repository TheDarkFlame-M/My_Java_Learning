// LoopAdvanced.java
/**
 * 循环结构进阶应用
 * 包含更复杂的循环使用场景和算法
 */
public class LoopAdvanced {
    public static void main(String[] args) {
        System.out.println("=== 嵌套循环演示 ===");
        nestedLoopDemo();
        
        System.out.println("\n=== 循环算法练习 ===");
        loopAlgorithm();
    }
    
    /**
     * 嵌套循环示例
     */
    public static void nestedLoopDemo() {
        System.out.println("乘法表:");
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "×" + i + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
    
    /**
     * 循环算法练习
     */
    public static void loopAlgorithm() {
        System.out.println("1. 素数判断:");
        findPrimes(30);
        
        System.out.println("\n2. 斐波那契数列:");
        fibonacciSequence(10);
    }
    
    /**
     * 找出指定范围内的所有素数
     */
    public static void findPrimes(int limit) {
        System.out.print("素数: ");
        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
    
    /**
     * 生成斐波那契数列
     */
    public static void fibonacciSequence(int count) {
        int a = 0, b = 1;
        System.out.print("斐波那契数列: " + a + " " + b + " ");
        
        for (int i = 2; i < count; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }
}