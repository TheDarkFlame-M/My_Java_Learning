/**
 * Java 方法高级特性详解
 * 涵盖：
 * - 方法调用方式（同类 vs 跨类）
 * - 返回值设计（单返回 vs 多结果）
 * - 参数传递规则（类型兼容、顺序、个数）
 * - 方法定义限制（不可嵌套）
 * - void 与 return 的使用
 */
public class MethodAdvancedDemo {

    public static void main(String[] args) {
        // === 1. 同类方法调用：直接调用 ===
        Caller caller = new Caller();
        caller.sayOk(); // sayOk() 内部直接调用 print(10)

        // === 2. 跨类方法调用：通过对象调用 ===
        caller.invokeB(); // 创建 B 对象并调用其 hi() 方法

        // === 3. 方法参数与返回值演示 ===
        Calculator calc = new Calculator();

        // ✅ 正确调用：参数类型兼容（byte → int 自动提升）
        byte b1 = 1, b2 = 2;
        int[] result1 = calc.getSumAndDiff(b1, b2);
        System.out.println("byte 参数: 和=" + result1[0] + ", 差=" + result1[1]);

        // ✅ 正确调用：实参与形参类型、个数、顺序一致
        int[] result2 = calc.getSumAndDiff(10, 4);
        System.out.println("int 参数: 和=" + result2[0] + ", 差=" + result2[1]);

        // ❌ 错误示例（已注释，避免编译失败）：
        // calc.getSumAndDiff(2.1, 5.4); // double → int 不兼容（需强制转换）
        // calc.getSumAndDiff(100);       // 参数个数不匹配
        // calc.printInfo(520, "邪王真眼"); // 顺序错误：应为 (String, int)

        // === 4. 返回值类型兼容性 ===
        double d = calc.returnDouble(); // 方法返回 int，但赋值给 double（自动提升）
        System.out.println("返回值兼容性测试: " + d); // 输出 100.0
    }
}

// ==================== 类定义区 ====================

/** 演示方法调用方式 */
class Caller {
    // 同类方法调用：直接调用
    public void print(int n) {
        System.out.println("print() 被调用, n = " + n);
    }

    public void sayOk() {
        print(10); // 直接调用同类方法
        System.out.println("继续执行 sayOk()");
    }

    // 跨类方法调用：需创建对象
    public void invokeB() {
        System.out.println("准备调用 B 类的 hi() 方法");
        B b = new B();
        b.hi(); // 通过对象调用其他类的方法
        System.out.println("invokeB() 执行完毕");
    }
}

/** 被调用的辅助类 */
class B {
    public void hi() {
        System.out.println("B 类中的 hi() 被执行");
    }
}

/** 演示方法定义规则与返回值设计 */
class Calculator {

    // ⚠️ 方法不能嵌套定义（以下代码非法，仅作说明）
    /*
    public void outer() {
        public void inner() { } // ❌ 编译错误：方法内不能定义方法
    }
    */

    // 返回多个结果：使用数组封装
    public int[] getSumAndDiff(int a, int b) {
        return new int[]{a + b, a - b}; // 匿名数组，简洁高效
    }

    // 参数顺序必须严格匹配
    public void printInfo(String name, int id) {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    // 返回值类型兼容：int 可自动转为 double
    public double returnDouble() {
        int value = 100;
        return value; // int → double：合法（自动类型提升）
    }

    // void 方法可省略 return，或写 return; 提前退出
    public void doNothing() {
        System.out.println("这是一个 void 方法");
        // return; // 可选，用于提前结束方法
    }
}