/**
 * Java 方法（成员方法）详解
 * 演示：
 * - 无参无返回值方法
 * - 有参无返回值方法
 * - 有参有返回值方法
 * - 方法的封装性与复用性
 */
public class MethodDemo {

    public static void main(String[] args) {
        Person person = new Person();

        // === 1. 调用无参无返回值方法 ===
        person.speak(); // 输出固定语句

        // === 2. 调用有参无返回值方法 ===
        person.calculateSumToN(5);   // 计算 1+2+...+5
        person.calculateSumToN(10);  // 复用同一方法，传入不同参数

        // === 3. 调用有返回值方法 ===
        int result = person.add(10, 20);
        System.out.println("两数之和: " + result);

        // === 4. 方法封装带来的好处：代码复用 ===
        int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};
        Tools tools = new Tools();
        tools.print2DArray(map); // 第一次调用
        tools.print2DArray(map); // 第二次调用 —— 无需重复写循环！
    }
}

// 示例类：Person（带方法）
class Person {
    String name;
    int age;

    // 无参、无返回值方法
    public void speak() {
        System.out.println("归属黑暗是我的宿命");
    }

    // 有参、无返回值方法：计算 1 到 n 的和
    public void calculateSumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1 到 " + n + " 的和: " + sum);
    }

    // 有参、有返回值方法：返回两数之和
    public int add(int a, int b) {
        return a + b; // return 将结果交还给调用者
    }
}

// 工具类：演示方法封装的价值
class Tools {
    // 封装二维数组打印逻辑，避免重复编写嵌套循环
    public void print2DArray(int[][] arr) {
        System.out.println("------ 二维数组 ------");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}