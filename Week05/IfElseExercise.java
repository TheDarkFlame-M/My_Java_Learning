/**
 * if-else分支控制练习题集合
 * 包含多个经典的分支控制练习题目
 */
public class IfElseExercise {
    public static void main(String[] args) {
        System.out.println("=== if-else练习题集合 ===\n");
        
        // 练习1: 嵌套if语句执行流程分析
        System.out.println("1. 嵌套if语句执行流程分析:");
        int x = 7;
        int y = 4;
        if (x > 5) {
            if (y > 5) {
                System.out.println(x + y);
            }
            System.out.println("邪王真眼最强");
        } else {
            System.out.println("x is " + x);
        }
        System.out.println("输出结果: 邪王真眼最强\n");
        
        // 练习2: 双条件判断
        System.out.println("2. 双条件判断:");
        double d1 = 18.8;
        double d2 = 9.9;
        if (d1 > 10.0 && d2 < 20.0) {
            System.out.println("两数和 = " + (d1 + d2));
        }
        
        // 练习3: 整除判断
        System.out.println("\n3. 整除判断:");
        int num1 = 34;
        int num2 = 56;
        int sum = num1 + num2;
        if (sum % 3 == 0 && sum % 5 == 0) {
            System.out.println(sum + " 可以被3和5整除");
        } else {
            System.out.println(sum + " 不可以被3和5整除");
        }
        
        // 练习4: 闰年判断
        System.out.println("\n4. 闰年判断:");
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " 是闰年");
        } else {
            System.out.println(year + " 不是闰年");
        }
    }
}