/**
 * Java 构造器（Constructor）与 this 关键字详解
 *
 * 核心知识点：
 * 1. 构造器用于初始化对象，名称必须与类名相同，无返回值
 * 2. this 三大用途：
 *    - this.属性：区分局部变量与成员变量
 *    - this.方法()：调用当前对象的其他方法
 *    - this(...)：在构造器中调用本类其他构造器（必须是第一条语句）
 * 3. 若未定义任何构造器，编译器提供默认无参构造器；
 *    一旦自定义构造器，默认构造器消失。
 */
public class ConstructorAndThisDemo {

    public static void main(String[] args) {
        System.out.println("=== 1. 构造器基础：初始化对象 ===");
        Person p1 = new Person("TheDarkFlame-M", 1999);
        System.out.println("p1: " + p1.name + ", " + p1.age);

        System.out.println("\n=== 2. this 区分同名参数 ===");
        Dog dog = new Dog("大壮", 3);
        dog.info(); // 输出：大壮	3

        System.out.println("\n=== 3. this 调用本类其他构造器 ===");
        Student s1 = new Student();           // 触发无参构造器 → 调用有参构造器
        Student s2 = new Student("Alice", 20); // 直接调用有参构造器

        System.out.println("\n=== 4. this 调用成员方法 ===");
        Calculator calc = new Calculator();
        calc.f2(); // f2 内部通过 this 调用 f1

        System.out.println("\n=== 5. 对象比较：使用 this 表示当前对象 ===");
        Person p2 = new Person("mary", 20);
        Person p3 = new Person("mary", 20);
        System.out.println("p2 与 p3 是否相等？" + p2.compareTo(p3)); // true
    }
}

// ==================== 示例类区 ====================

/** 演示构造器基础 */
class Person {
    String name;
    int age;

    // 构造器：初始化 name 和 age
    public Person(String name, int age) {
        this.name = name; // this.name 指成员变量
        this.age = age;   // 避免与参数 name/age 混淆
    }

    // 对象比较方法：判断两个 Person 是否完全相同
    public boolean compareTo(Person other) {
        // this 表示当前调用此方法的对象（如 p2.compareTo(p3) 中的 p2）
        return this.name.equals(other.name) && this.age == other.age;
    }
}

/** 演示 this 解决参数与属性同名问题 */
class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name; // this.name = 成员变量, name = 参数
        this.age = age;
    }

    public void info() {
        System.out.println(name + "\t" + age);
    }
}

/** 演示构造器重载 + this() 调用 */
class Student {
    String name;
    int age;

    // 无参构造器：通过 this() 调用有参构造器，避免重复代码
    public Student() {
        this("dark", 100); // 必须是构造器第一行！
        System.out.println("Student() 无参构造器被调用");
    }

    // 有参构造器
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Student(String, int) 被调用");
    }
}

/** 演示 this 调用成员方法 */
class Calculator {
    public void f1() {
        System.out.println("f1() 方法被调用");
    }

    public void f2() {
        System.out.println("f2() 方法被调用");
        this.f1(); // 显式使用 this 调用本类方法（可省略 this，但更清晰）
    }
}

// ==================== 补充说明（注释形式）====================

/*
【构造器重要细节】
- 构造器不能写返回类型（连 void 都不行）
- 一旦定义了任意构造器，系统不再提供默认无参构造器
  → 若需无参构造器，必须显式定义

【this() 调用限制】
- 只能在构造器中使用
- 必须是构造器的第一条语句
- 不能形成循环调用（如 A 构造器调 B，B 又调 A）

【this 的本质】
- this 是一个隐式引用，指向当前对象实例
- 谁调用方法/构造器，this 就代表谁
*/