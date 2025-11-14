import java.util.Arrays;

/**
 * 二维数组经典示例：
 * - 规则/不规则数组
 * - 遍历与求和
 * - 杨辉三角生成
 */
public class Array2DExamples {

    public static void main(String[] args) {
        // === 1. 打印固定图形（规则二维数组）===
        int[][] pattern = {
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 2, 0, 3, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        System.out.println("=== 固定图形 ===");
        print2D(pattern);

        // === 2. 不规则数组（每行长度不同）===
        int[][] jagged = new int[5][]; // 只指定行数
        for (int i = 0; i < jagged.length; i++) {
            jagged[i] = new int[i + 1]; // 第 i 行有 i+1 个元素
            Arrays.fill(jagged[i], i + 1); // 全部赋值为 i+1
        }
        System.out.println("\n=== 不规则数组 ===");
        print2D(jagged);

        // === 3. 二维数组求和 ===
        int[][] data = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        for (int[] row : data) {
            for (int val : row) {
                sum += val;
            }
        }
        System.out.println("\n=== 数组求和 ===");
        print2D(data);
        System.out.println("总和: " + sum); // 输出 21

        // === 4. 杨辉三角（10 行）===
        int rows = 10;
        int[][] pascal = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pascal[i] = new int[i + 1];
            pascal[i][0] = pascal[i][i] = 1; // 首尾为 1
            for (int j = 1; j < i; j++) {
                pascal[i][j] = pascal[i - 1][j - 1] + pascal[i - 1][j];
            }
        }
        System.out.println("\n=== 杨辉三角 ===");
        print2D(pascal);
    }

    // 通用二维数组打印工具
    private static void print2D(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}