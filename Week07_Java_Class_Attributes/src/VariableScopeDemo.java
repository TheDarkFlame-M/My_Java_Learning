/**
 * Java 变量作用域与生命周期详解
 * 核心概念：
 * - 成员变量（属性）：属于对象，随对象创建/销毁
 * - 局部变量：属于方法/代码块，随调用开始/结束而生灭
 * - 就近原则：局部变量与成员变量同名时，优先使用局部变量
 */
public class VariableScopeDemo {

    public static void main(String[] args) {
        new ScopeExamples().run();
    }
}

class ScopeExamples {
    // 成员变量（全局变量）—— 生命周期 = 对象生命周期
    public String name = "TheDarkFlame-M";
    public int age = 20;

    public void run() {
        // === 1. 成员变量 vs 局部变量生命周期 ===
        System.out.println("【1. 成员变量】name = " + name); // 可直接访问

        say(); // 调用方法，内部局部变量 name 仅在 say() 执行期间存在

        // === 2. 就近原则演示 ===
        hi();

        // === 3. 局部变量不能重复定义 ===
        String address = "DarkSide";
        // String address = "world"; // X 编译错误：重复定义
    }

    public void say() {
        // 局部变量 name 与成员变量同名 → 遵循就近原则
        String name = "邪王真眼";
        System.out.println("【2. 就近原则】say() 中 name = " + name); // 输出局部变量
    }

    public void hi() {
        String name = "hsp"; // 局部变量覆盖成员变量
        System.out.println("【3. 就近原则】hi() 中 name = " + name);
    }

    // === 补充说明 ===
    // - 成员变量可加访问修饰符（public/private等），局部变量不能
    // - 局部变量必须先赋值才能使用；成员变量有默认值（如 int=0, String=null）
}