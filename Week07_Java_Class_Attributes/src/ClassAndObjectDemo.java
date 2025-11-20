/**
 * Java 面向对象基础：类与对象
 * 演示：
 * - 类的定义（属性/字段）
 * - 对象创建（new）
 * - 引用赋值（共享 vs 独立）
 * - 成员变量的默认值规则
 */
public class ClassAndObjectDemo {

    public static void main(String[] args) {
        // === 1. 对象创建与默认值 ===
        Person person = new Person();
        // Java 会为未初始化的成员变量赋予默认值：
        // int → 0, double → 0.0, boolean → false, 引用类型（String等）→ null
        System.out.println("【默认值测试】");
        System.out.println("age=" + person.age + ", name=" + person.name +
                           ", salary=" + person.salary + ", isPass=" + person.isPass);

        // === 2. 引用赋值：两个变量指向同一个对象 ===
        Person p1 = new Person();
        p1.name = "小明";
        p1.age = 10;

        Person p2 = p1; // p2 和 p1 指向内存中同一个对象
        p2.age = 200;   // 修改 p2 实际上修改了 p1 所指向的对象

        System.out.println("\n【引用赋值测试】");
        System.out.println("p1.age = " + p1.age); // 输出 200
        // p2 = null; // 若取消注释下一行会报错：NullPointerException
        // System.out.println(p2.age); // ❌ 不能访问 null 引用的成员

        // === 3. 属性可以是任意类型（基本类型 or 引用类型）===
        Car myCar = new Car();
        myCar.name = "特斯拉";
        myCar.price = 300000.0;
        myCar.color = "红色";
        myCar.owners = new String[]{"张三", "李四"}; // 引用类型：数组

        System.out.println("\n【复合属性测试】");
        System.out.println("车名: " + myCar.name);
        System.out.println("车主: " + java.util.Arrays.toString(myCar.owners));
    }
}

// 示例类 1：Person
class Person {
    // 成员变量（字段）—— 描述对象的属性
    int age;
    String name;
    double salary;
    boolean isPass;
}

// 示例类 2：Car
class Car {
    String name;          // 基本引用类型
    double price;         // 基本数据类型
    String color;
    String[] owners;      // 引用类型：数组（可存储多个车主）
}