import java.util.Arrays;

/**
 * Java 方法重载（Overloading）与可变参数（Varargs）详解
 *
 *  重载规则：
 * - 方法名必须相同
 * - 参数列表必须不同（类型、个数、顺序至少一项不同）
 * - 返回值类型不影响重载（不能仅靠返回值区分）
 *
 *  可变参数（Varargs）规则：
 * - 语法：`type... name`（视为数组）
 * - 必须是形参列表的最后一个
 * - 一个方法只能有一个可变参数
 * - 实参可传多个值或一个数组
 */
public class MethodOverloadingAndVarargs {

    public static void main(String[] args) {
        OverloadDemo overload = new OverloadDemo();
        VarargsDemo varargs = new VarargsDemo();

        // === 1. 方法重载演示 ===
        System.out.println("【方法重载】");
        overload.print(10);                    // 调用 int 版本
        overload.print(10, 20);                // 调用 (int, int) 版本
        overload.print("TheDarkFlame-M");      // 调用 String 版本

        System.out.println("max(3, 5) = " + overload.max(3, 5));
        System.out.println("max(3.2, 5.1) = " + overload.max(3.2, 5.1));
        System.out.println("max(1.0, 2.0, 3.0) = " + overload.max(1.0, 2.0, 3.0));

        // === 2. 可变参数演示 ===
        System.out.println("\n【可变参数】");
        varargs.sum(1, 2, 3, 4);               // 传多个 int
        varargs.showScores("小野", 88, 96.3, 99.5);

        // 可变参数可接收数组
        int[] arr = {10, 20, 30};
        varargs.sum(arr);                      // 等价于 sum(10, 20, 30)
    }
}

/** 方法重载示例 */
class OverloadDemo {
    // 重载：不同参数个数
    public void print(int n) {
        System.out.println("平方: " + (n * n));
    }

    public void print(int a, int b) {
        System.out.println("相乘: " + (a * b));
    }

    // 重载：不同参数类型
    public void print(String s) {
        System.out.println("字符串: " + s);
    }

    // 重载：相同方法名，不同参数（用于 max）
    public int max(int a, int b) {
        return Math.max(a, b);
    }

    public double max(double a, double b) {
        return Math.max(a, b);
    }

    public double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), c);
    }
}

/** 可变参数示例 */
class VarargsDemo {
    // 可变参数：求和
    public void sum(int... numbers) {
        int total = Arrays.stream(numbers).sum();
        System.out.println("求和 (" + numbers.length + " 个数): " + total);
    }

    // 可变参数 + 普通参数（可变参数必须在最后）
    public void showScores(String name, double... scores) {
        double total = Arrays.stream(scores).sum();
        System.out.println("姓名: " + name + ", 科目数: " + scores.length + ", 总分: " + total);
    }

    // X 错误示例（已注释）：
    // public void badExample(int... a, int... b) {} // 不能有两个可变参数
    // public void badExample2(int... a, String s) {} // 可变参数必须在最后
}