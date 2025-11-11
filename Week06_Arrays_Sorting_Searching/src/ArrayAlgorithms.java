import java.util.Scanner;

/**
 * 数组常用算法实现
 * 包含查找、拷贝、反转等核心算法
 * 
 * 算法要点：
 * - 查找：遍历比较，记录目标信息
 * - 拷贝：创建新数组，复制元素
 * - 反转：对称交换或逆序复制
 */
public class ArrayAlgorithms {
    public static void main(String[] args) {
        demonstrateSearchAlgorithms();   // 查找算法演示
        demonstrateCopyAndReverse();     // 拷贝和反转演示
        demonstrateDynamicArrays();      // 动态数组演示
    }
    
    /**
     * 演示查找算法：最大值查找和顺序查找
     * 算法思想：
     * - 假设第一个元素为最大值
     * - 遍历比较，更新最大值和位置
     */
    public static void demonstrateSearchAlgorithms() {
        System.out.println("=== 数组查找算法 ===\n");
        
        // 最大值查找：在数组中寻找最大的元素
        int[] numbers = {4, -1, 9, 10, 23, 18};
        findMaxValue(numbers);
        
        // 字母表生成：利用字符运算生成连续字母
        generateAlphabet();
    }
    
    /**
     * 查找数组最大值及其下标
     * @param arr 要查找的数组
     * 算法步骤：
     * 1. 假设第一个元素为最大值
     * 2. 从第二个元素开始遍历比较
     * 3. 遇到更大的元素时更新最大值和下标
     */
    public static void findMaxValue(int[] arr) {
        int max = arr[0];        // 假设第一个元素最大
        int maxIndex = 0;        // 记录最大值的位置
        
        // 从第二个元素开始比较（i=1）
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {  // 发现更大的元素
                max = arr[i];    // 更新最大值
                maxIndex = i;    // 更新位置
            }
        }
        System.out.printf("最大值: %d, 下标: %d\n", max, maxIndex);
    }
    
    /**
     * 生成A-Z字母表
     * 原理：字符在内存中以ASCII码存储，可以进行算术运算
     * 'A' + 1 = 'B', 'A' + 2 = 'C', 以此类推
     */
    public static void generateAlphabet() {
        char[] alphabet = new char[26];  // 创建26个字符的数组
        for (int i = 0; i < alphabet.length; i++) {
            alphabet[i] = (char)('A' + i); // 'A'的ASCII码加i得到后续字母
        }
        System.out.print("字母表: ");
        System.out.println(alphabet);    // 直接打印字符数组会显示字符串
    }
    
    /**
     * 演示数组拷贝和反转操作
     * 重点区别：
     * - 深拷贝：创建独立的新数组，修改不影响原数组
     * - 引用赋值：共享数据空间，修改相互影响
     */
    public static void demonstrateCopyAndReverse() {
        System.out.println("\n=== 数组拷贝与反转 ===");
        
        int[] original = {10, 20, 30};
        
        // 数组拷贝（深拷贝）：创建完全独立的新数组
        int[] copy = copyArray(original);
        copy[0] = 100; // 修改拷贝数组，原数组不受影响
        
        System.out.print("原数组: ");
        printArray(original);  // 输出：[10, 20, 30]
        System.out.print("拷贝数组: ");
        printArray(copy);      // 输出：[100, 20, 30]
        
        // 数组反转：创建新数组，逆序复制元素
        System.out.print("反转后: ");
        printArray(reverseArray(original));
    }
    
    /**
     * 演示动态数组操作：扩容和缩减
     * 实现原理：
     * - 扩容：创建更大的新数组，复制原数据，添加新元素
     * - 缩减：创建更小的新数组，复制部分数据
     */
    public static void demonstrateDynamicArrays() {
        System.out.println("\n=== 动态数组操作 ===");
        
        // 数组扩容演示：在数组末尾添加新元素
        int[] arr = {1, 2, 3};
        System.out.print("原始数组: ");
        printArray(arr);
        
        arr = expandArray(arr, 4);  // 添加元素4
        System.out.print("扩容后: ");
        printArray(arr);            // 输出：[1, 2, 3, 4]
        
        // 数组缩减演示（模拟）
        System.out.println("数组缩减功能请运行 ArrayReduce.java");
    }
    
    // ==================== 工具方法 ====================
    
    /**
     * 数组深拷贝：创建独立的新数组
     * @param arr 原数组
     * @return 新的独立数组
     */
    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];  // 创建同样大小的新数组
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];  // 逐个元素复制
        }
        return newArr;
    }
    
    /**
     * 数组反转：创建新数组，逆序存放元素
     * @param arr 原数组
     * @return 反转后的新数组
     */
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        // 原数组第i个元素放到新数组的倒数第i个位置
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
    
    /**
     * 数组扩容：在末尾添加新元素
     * @param arr 原数组
     * @param newElement 要添加的新元素
     * @return 扩容后的新数组
     */
    public static int[] expandArray(int[] arr, int newElement) {
        int[] newArr = new int[arr.length + 1];  // 创建比原数组大1的新数组
        // 复制原数组所有元素
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = newElement;  // 在新数组末尾添加元素
        return newArr;
    }
    
    /**
     * 打印数组内容
     * @param arr 要打印的数组
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", "); // 最后一个元素后不加逗号
        }
        System.out.println();
    }
}