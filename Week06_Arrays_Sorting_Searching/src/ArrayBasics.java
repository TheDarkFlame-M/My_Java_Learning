import java.util.Arrays;

/**
 * 数组基础：声明、初始化、默认值、常见编译错误
 */
public class ArrayBasics {

    public static void main(String[] args) {
        // === 1. 数组声明的两种等价写法 ===
        int[] arr1;   // 推荐：强调类型是 "int数组"
        int arr2[];   // 合法但不推荐：C 风格，易混淆

        // === 2. 多变量声明的陷阱 ===
        int[] x, y[]; // x 是一维数组，y 是二维数组（等价于 int[][] y）
        // 常见错误：
        // x[0] = y;       // ❌ 编译失败：int vs int[][]
        // x = y;          // ❌ 编译失败：int[] vs int[][]
        // y[0][0] = x;    // ❌ 编译失败：int vs int[]
        // 正确用法：
        y = new int[2][3];
        x = new int[]{1, 2};
        y[0] = x;           // ✅ y[0] 是 int[]，x 是 int[]

        // === 3. 数组元素的默认值 ===
        boolean[] flags = new boolean[2]; // 默认值为 false
        String foo = "blue";
        if (flags[0]) { // 条件为 false，不会执行
            foo = "green";
        }
        System.out.println("boolean 默认值测试: " + foo); // 输出 blue

        // === 4. 字符串数组初始化（正确 vs 错误）===
        // String[] s1 = {'a', 'b'};        // ❌ 错误：'a' 是 char，不是 String
        String[] s2 = {"a", "b"};          // ✅ 正确
        String[] s3 = new String[]{"a", "b"}; // ✅ 正确
        // String[] s4 = new String[2]{"a"}; // ❌ 错误：不能同时指定长度和初始化列表

        System.out.println("字符串数组: " + Arrays.toString(s2));
    }
}