/**
 * 递归与方法练习题
 * 包含：
 * - 递归基础（阶乘、打印）
 * - 工具方法：奇偶判断、字符矩阵打印
 * - 对象深拷贝（返回独立新对象）
 */
public class RecursionAndExercises {

    public static void main(String[] args) {
        RecursionExample rec = new RecursionExample();
        MethodExercises exer = new MethodExercises();

        // === 1. 递归测试 ===
        System.out.println("【递归测试】");
        rec.printNumbers(4); // 输出 n=2, n=3, n=4
        int factorial = rec.factorial(5);
        System.out.println("5! = " + factorial);

        // === 2. 方法练习题 ===
        System.out.println("\n【方法练习】");
        System.out.println("24 是奇数吗？" + (exer.isOdd(24) ? "是" : "否"));
        exer.printMatrix(4, 4, '#'); // 打印 4x4 的 # 矩阵

        // === 3. 对象拷贝（深拷贝）===
        Person original = new Person();
        original.name = "邪王真眼";
        original.age = 839;

        Person copy = exer.copyPerson(original);
        System.out.println("\n【对象拷贝测试】");
        System.out.println("原对象: " + original.name + ", " + original.age);
        System.out.println("拷贝对象: " + copy.name + ", " + copy.age);
        System.out.println("是否为同一对象？" + (original == copy)); // false
    }
}

/** 递归示例 */
class RecursionExample {
    // 递归打印：先递归到最深层，再从底向上打印
    public void printNumbers(int n) {
        if (n > 2) {
            printNumbers(n - 1); // 先递归
        }
        // 回溯时打印（n=2 最先打印）
        System.out.println("n=" + n);
    }

    // 阶乘递归
    public int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }
}

/** 方法练习题集合 */
class MethodExercises {
    // 判断奇数
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }

    // 打印字符矩阵
    public void printMatrix(int rows, int cols, char c) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    // 深拷贝 Person 对象（创建全新对象）
    public Person copyPerson(Person p) {
        Person copy = new Person();
        copy.name = p.name; // String 是不可变对象，直接赋值安全
        copy.age = p.age;
        return copy; // 返回新对象，与原对象独立
    }
}

// 复用 Person 类（需与 ParameterPassingDemo 中一致）
class Person {
    String name;
    int age;
}