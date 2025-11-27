/**
 * 经典递归问题详解
 * 包含：
 * 1. 斐波那契数列（Fibonacci）
 * 2. 猴子吃桃问题（逆向递推）
 *
 * 递归核心思想：
 * - 找到基础情况（base case），防止无限递归
 * - 将大问题分解为规模更小的相同子问题
 */
public class RecursionClassicProblems {

    public static void main(String[] args) {
        RecursionSolver solver = new RecursionSolver();

        // === 1. 斐波那契数列测试 ===
        int n = 8;
        int fibResult = solver.fibonacci(n);
        if (fibResult != -1) {
            System.out.println("【斐波那契】第 " + n + " 项: " + fibResult);
        } else {
            System.out.println("【错误】n 必须 >= 1");
        }

        // === 2. 猴子吃桃问题测试 ===
        int day = 1; // 求第1天的桃子总数
        int peachResult = solver.peachCount(day);
        if (peachResult != -1) {
            System.out.println("【猴子吃桃】第 " + day + " 天共有 " + peachResult + " 个桃子");
        } else {
            System.out.println("【错误】天数必须在 1 到 " + RecursionSolver.TOTAL_DAYS + " 之间");
        }
    }
}

class RecursionSolver {
    // 猴子吃桃问题的总天数（第10天剩1个）
    public static final int TOTAL_DAYS = 10;

    /**
     * 计算斐波那契数列第 n 项
     * 数列：1, 1, 2, 3, 5, 8, 13...
     * 递归关系：
     *   F(1) = 1, F(2) = 1
     *   F(n) = F(n-1) + F(n-2)  (n >= 3)
     *
     *  注意：此实现为教学目的，实际中 n 较大时效率极低（指数时间），
     *          应使用动态规划或记忆化递归优化。
     */
    public int fibonacci(int n) {
        if (n < 1) {
            return -1; // 输入非法
        }
        if (n == 1 || n == 2) {
            return 1; // 基础情况
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // 递归分解
    }

    /**
     * 猴子吃桃问题：已知第10天剩1个桃子，求第1天有多少个？
     * 规则：每天吃掉一半再多吃一个。
     * 逆推思路（关键！）：
     *   设第 k 天有 x 个桃子，
     *   则第 k+1 天剩下：x/2 - 1
     *   反过来：若第 k+1 天有 y 个，则第 k 天有 (y + 1) * 2 个
     *
     * 递归关系：
     *   peachCount(10) = 1
     *   peachCount(day) = (peachCount(day + 1) + 1) * 2   (day < 10)
     */
    public int peachCount(int day) {
        if (day < 1 || day > TOTAL_DAYS) {
            return -1; // 超出有效范围
        }
        if (day == TOTAL_DAYS) {
            return 1; // 第10天只剩1个 —— 基础情况
        }
        // 逆推前一天的桃子数
        return (peachCount(day + 1) + 1) * 2;
    }
}