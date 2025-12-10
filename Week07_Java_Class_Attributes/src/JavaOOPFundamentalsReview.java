import java.util.Arrays;

/**
 * Java 面向对象基础综合复习
 * 一站式涵盖：数组操作、类设计、构造器、封装、对象行为
 * 所有示例均可独立运行，适合快速回顾核心概念
 */
public class JavaOOPFundamentalsReview {

    public static void main(String[] args) {
        System.out.println("整理好的综合练习\n");

        // ——————【1. 数组工具方法】——————
        arrayUtilitiesDemo();

        // ——————【2. 简单对象建模】——————
        simpleObjectsDemo();

        // ——————【3. 安全操作与对象引用】——————
        safeOperationsDemo();

        // ——————【4. 构造器设计与复用】——————
        constructorsDemo();

        System.out.println("\n 可用于复习");
    }

    // ————————————————————————————————
    // 【1. 数组工具方法】
    // 提供查找、求最大值、复制等通用操作
    // ————————————————————————————————
    static void arrayUtilitiesDemo() {
        ArrayUtils utils = new ArrayUtils();
        
        double max = utils.findMax(24, 86, 50);
        System.out.println("【数组工具】最大值: " + max);

        int index = utils.findElement(12, 9, 12, 13, 6, 5);
        System.out.println("数字 12 位于索引: " + (index != -1 ? index : "未找到"));

        int[] original = {13, 42, 1};
        int[] copy = utils.copyArray(original);
        System.out.println("数组复制成功: " + Arrays.equals(original, copy));
    }

    // ————————————————————————————————
    // 【2. 简单对象建模】
    // 用类封装数据与行为：Book, Circle, Dog, Music
    // ————————————————————————————————
    static void simpleObjectsDemo() {
        // 书籍价格策略
        Book book = new Book("学会提问", 200);
        book.applyPricingRule();
        book.display();

        // 圆的计算
        Circle circle = new Circle(5);
        System.out.printf("圆面积: %.2f, 周长: %.2f%n", 
                          circle.calculateArea(), circle.calculatePerimeter());

        // 宠物信息
        Dog dog = new Dog("彪泽", '黑', 4);
        dog.displayInfo();

        // 音乐播放
        Music music = new Music("晴る", 4.5);
        music.play();
    }

    // ————————————————————————————————
    // 【3. 安全操作与对象引用】
    // 安全除法 + 理解后置递增与对象共享
    // ————————————————————————————————
    static void safeOperationsDemo() {
        Calculator calc = new Calculator(10, 0);
        System.out.println("【安全计算器】10 ÷ 0 = " + 
            (calc.safeDivide() != null ? calc.safeDivide() : "除数不能为零"));

        Counter counter = new Counter();
        Counter alias = counter; // 共享同一对象
        alias.incrementWithPostfix();
        System.out.println("共享对象的值: " + counter.getValue());
    }

    // ————————————————————————————————
    // 【4. 构造器设计与复用】
    // 多种初始化方式 + 对象比较
    // ————————————————————————————————
    static void constructorsDemo() {
        Employee fullEmp = new Employee("张三", '男', 28, "工程师", 15000);
        Employee basicEmp = new Employee("李四", '女', 22);
        Employee roleEmp = new Employee("经理", 20000);

        System.out.println("完整员工: " + fullEmp.getName() + ", 职位: " + fullEmp.getJobTitle());
        System.out.println("基础员工: " + basicEmp.getName() + ", 年龄: " + basicEmp.getAge());
        System.out.println("角色员工: 职位 " + roleEmp.getJobTitle() + ", 薪水 " + roleEmp.getSalary());

        Person p1 = new Person("mary", 20);
        Person p2 = new Person("mary", 20);
        System.out.println("两人是否相同? " + p1.isSameAs(p2));
    }
}

// ==================== 工具与模型类 ====================

// —— 数组工具 ——
class ArrayUtils {
    public double findMax(double... numbers) {
        double max = numbers[0];
        for (double n : numbers) if (n > max) max = n;
        return max;
    }

    public int findElement(int target, int... array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public int[] copyArray(int[] source) {
        int[] copy = new int[source.length];
        for (int i = 0; i < source.length; i++) {
            copy[i] = source[i];
        }
        return copy;
    }
}

// —— 简单对象 ——
class Book {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public void applyPricingRule() {
        if (price > 150) price = 150;
        else if (price > 100) price = 100;
    }

    public void display() {
        System.out.println("《" + title + "》定价: " + price + "元");
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Dog {
    private String name;
    private char color;
    private int age;

    public Dog(String name, char color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("狗狗【" + name + "】颜色:" + color + " 年龄:" + age);
    }
}

class Music {
    private String name;
    private double duration;

    public Music(String name, double duration) {
        this.name = name;
        this.duration = duration;
    }

    public void play() {
        System.out.println("🎵 正在播放《" + name + "》，时长 " + duration + " 分钟");
    }
}

// —— 安全操作 ——
class Calculator {
    private double operand1, operand2;

    public Calculator(double a, double b) {
        this.operand1 = a;
        this.operand2 = b;
    }

    public Double safeDivide() {
        return operand2 != 0 ? operand1 / operand2 : null;
    }
}

class Counter {
    private int value = 100;

    public void incrementWithPostfix() {
        int temp = value++; // 先使用，再自增
    }

    public int getValue() {
        return value;
    }
}

// —— 构造器与对象比较 ——
class Employee {
    private String name, jobTitle;
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Employee(String jobTitle, double salary) {
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Employee(String name, char gender, int age, String jobTitle, double salary) {
        this(name, gender, age); // 复用构造器
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter 方法（用于演示）
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getJobTitle() { return jobTitle; }
    public double getSalary() { return salary; }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isSameAs(Person other) {
        return this.name.equals(other.name) && this.age == other.age;
    }
}