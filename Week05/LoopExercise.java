// LoopExercise.java
/**
 * 循环结构综合练习
 * 包含各种循环的实用案例和编程练习
 */
public class LoopExercise {
    public static void main(String[] args) {
        System.out.println("=== 练习1: 数字统计 ===");
        numberStatistics();
        
        System.out.println("\n=== 练习2: 倍数查找 ===");
        findMultiples();
        
        System.out.println("\n=== 练习3: 数字组合 ===");
        numberCombination();
    }
    
    /**
     * 练习1: 数字统计
     * 统计1-200之间能被5整除但不能被3整除的数字
     */
    public static void numberStatistics() {
        int count = 0;
        System.out.println("1-200之间能被5整除但不能被3整除的数字:");
        
        for (int i = 1; i <= 200; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n符合条件的数字个数: " + count);
    }
    
    /**
     * 练习2: 倍数查找
     * 找出指定范围内某数的倍数，统计个数和总和
     */
    public static void findMultiples() {
        int start = 1;
        int end = 100;
        int divisor = 9;
        int sum = 0;
        int count = 0;
        
        System.out.println(start + "到" + end + "之间" + divisor + "的倍数:");
        
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
                count++;
                sum += i;
            }
        }
        
        System.out.println("\n倍数个数: " + count);
        System.out.println("倍数总和: " + sum);
    }
    
    /**
     * 练习3: 数字组合
     * 展示所有相加等于指定值的数字对
     */
    public static void numberCombination() {
        int target = 10;
        System.out.println("所有相加等于" + target + "的数字对:");
        
        for (int i = 0; i <= target; i++) {
            int j = target - i;
            System.out.println(i + " + " + j + " = " + target);
        }
    }
}