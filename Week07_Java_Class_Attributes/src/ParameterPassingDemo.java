import java.util.Arrays;

/**
 * Java 参数传递机制详解
 * 核心结论：
 * - Java 只有【值传递】（pass-by-value）
 * - 传基本类型：传递的是值的副本，修改不影响原变量
 * - 传引用类型（对象/数组）：传递的是【引用的副本】，
 *   可通过副本修改对象内容，但不能改变原引用指向
 */
public class ParameterPassingDemo {

    public static void main(String[] args) {
        // === 1. 基本类型参数：值传递（不可变）===
        int a = 10, b = 20;
        System.out.println("【基本类型测试】");
        System.out.println("调用前: a=" + a + ", b=" + b);
        new Swapper().swap(a, b); // 尝试交换
        System.out.println("调用后: a=" + a + ", b=" + b); // 仍是 10, 20

        // === 2. 数组参数：可修改内容，但不能改变原引用===
        int[] arr = {1, 2, 3};
        System.out.println("\n【数组测试】");
        System.out.println("main 中原数组: " + Arrays.toString(arr));
        new ArrayModifier().modifyArray(arr);
        System.out.println("main 中修改后: " + Arrays.toString(arr)); // [1, 200, 3]

        // === 3. 对象参数：可修改属性，但不能让原引用指向 null 或新对象===
        Person p = new Person();
        p.name = "TheDarkFlame-M";
        p.age = 16;
        System.out.println("\n【对象测试】");
        System.out.println("调用前: name=" + p.name + ", age=" + p.age);
        new ObjectModifier().modifyPerson(p);
        // 注意：即使方法内执行 p = null，main 中的 p 仍有效！
        System.out.println("调用后: name=" + p.name + ", age=" + p.age); // age=1998
    }
}

/** 演示基本类型交换（无效）*/
class Swapper {
    public void swap(int a, int b) {
        System.out.println("  swap 内部 - 交换前: a=" + a + ", b=" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("  swap 内部 - 交换后: a=" + a + ", b=" + b);
        // 修改的是副本，不影响 main 中的 a, b
    }
}

/** 演示数组内容修改（有效）*/
class ArrayModifier {
    public void modifyArray(int[] arr) {
        arr[1] = 200; // 修改数组内容 —— 影响原数组
        System.out.println("  modifyArray 内部: " + Arrays.toString(arr));
        // 若写 arr = new int[]{...}; 则不会影响 main 中的 arr
    }
}

/** 演示对象属性修改（有效），但重定向引用无效*/
class ObjectModifier {
    public void modifyPerson(Person p) {
        p.age = 1998; // 修改对象属性 —— 影响原对象
        // p = null; // 这行不会影响 main 中的 p！只是让局部引用 p 指向 null
        System.out.println("  modifyPerson 内部: name=" + p.name + ", age=" + p.age);
    }
}

class Person {
    String name;
    int age;
}