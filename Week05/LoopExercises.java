import java.util.Scanner;

/**
 * Java循环结构练习 - 简洁优化版
 * 涵盖经典算法和循环应用场景
 */
public class LoopExercises {
    
    public static void main(String[] args) {
        runAllExercises();
    }
    
    /**
     * 运行所有练习示例
     */
    public static void runAllExercises() {
        System.out.println("=== Java循环练习 ===\n");
        
        calcSeries();           // 1. 交替序列求和
        calcNestedSum();        // 2. 嵌套累加
        checkNumber();          // 3. 数字范围判断
        printLetters();         // 4. 字母打印
        printFilteredNumbers(); // 5. 条件数字打印
        findFlowerNumbers();    // 6. 水仙花数查找
        calcCrossings();        // 7. 路口通过计算
    }
    
    // ==================== 练习1: 交替序列求和 ====================
    
    /**
     * 计算 1 - 1/2 + 1/3 - 1/4 + ... + 1/100
     * 思路：奇数项加，偶数项减，符号交替
     */
    public static void calcSeries() {
        double sum = 0;
        
        // 遍历1到100，根据奇偶决定加减
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += 1.0 / i;  // 奇数项：加
            } else {
                sum -= 1.0 / i;  // 偶数项：减
            }
        }
        
        System.out.println("1. 交替序列和: " + String.format("%.4f", sum));
    }
    
    // ==================== 练习2: 嵌套累加和 ====================
    
    /**
     * 计算 1 + (1+2) + (1+2+3) + ... + (1+2+...+100)
     * 思路：外层控制项数，内层计算每项的和
     */
    public static void calcNestedSum() {
        int total = 0;
        
        // 外层：控制有多少项 (1, 1+2, 1+2+3, ...)
        for (int i = 1; i <= 100; i++) {
            int itemSum = 0;
            // 内层：计算当前项的和 (1+2+...+i)
            for (int j = 1; j <= i; j++) {
                itemSum += j;
            }
            total += itemSum;
        }
        
        System.out.println("2. 嵌套累加和: " + total);
    }
    
    // ==================== 练习3: 数字范围判断 ====================
    
    /**
     * 判断输入数字与0的大小关系
     * 思路：简单的三路条件判断
     */
    public static void checkNumber() {
        Scanner input = new Scanner(System.in);
        
        System.out.print("\n3. 请输入数字: ");
        int num = input.nextInt();
        
        if (num > 0) {
            System.out.println("结果: 大于0");
        } else if (num < 0) {
            System.out.println("结果: 小于0");
        } else {
            System.out.println("结果: 等于0");
        }
    }
    
    // ==================== 练习4: 字母表打印 ====================
    
    /**
     * 并排打印大小写字母
     * 思路：利用char类型的算术运算
     */
    public static void printLetters() {
        System.out.println("\n4. 字母表:");
        
        // 'a'和'A'同步递增，利用ASCII码规律
        for (char lower = 'a', upper = 'A'; lower <= 'z'; lower++, upper++) {
            System.out.print(lower + "" + upper + " ");
        }
        System.out.println();
    }
    
    // ==================== 练习5: 条件数字打印 ====================
    
    /**
     * 打印不能被5整除的数，每5个换行
     * 思路：过滤 + 计数换行
     */
    public static void printFilteredNumbers() {
        System.out.println("\n5. 不能被5整除的数:");
        int count = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.printf("%3d", i);  // 格式化输出，对齐数字
                count++;
                
                // 每输出5个数字就换行
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
        
        // 如果最后一行不满，补充换行
        if (count % 5 != 0) {
            System.out.println();
        }
    }
    
    // ==================== 练习6: 水仙花数查找 ====================
    
    /**
     * 查找100-500之间的水仙花数
     * 水仙花数：各位数字的立方和等于本身
     * 思路：分解数字 → 计算立方和 → 比较验证
     */
    public static void findFlowerNumbers() {
        System.out.println("\n6. 水仙花数:");
        
        for (int num = 100; num <= 500; num++) {
            // 分解百位、十位、个位
            int a = num / 100;      // 百位
            int b = num / 10 % 10;  // 十位  
            int c = num % 10;       // 个位
            
            // 计算立方和
            int sum = a*a*a + b*b*b + c*c*c;
            
            // 判断是否为水仙花数
            if (sum == num) {
                System.out.println("找到: " + num + " = " + a + "³ + " + b + "³ + " + c + "³");
            }
        }
    }
    
    // ==================== 练习7: 路口通过计算 ====================
    
    /**
     * 计算在特定缴费规则下能通过路口的次数
     * 规则：>50000交5%，≤50000交1000，直到钱不够
     * 思路：循环扣费，根据金额选择扣费方式
     */
    public static void calcCrossings() {
        double money = 100000;
        int count = 0;
        
        System.out.println("\n7. 路口通过计算:");
        System.out.println("初始金额: " + money);
        
        while (true) {
            if (money > 50000) {
                money *= 0.95;  // 交5%，剩95%
            } else if (money >= 1000) {
                money -= 1000;  // 固定交1000
            } else {
                break;  // 钱不够了，退出循环
            }
            count++;
        }
        
        System.out.println("可通过次数: " + count);
        System.out.printf("剩余金额: %.2f%n", money);
    }
}