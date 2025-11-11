/**
 * 数组基础概念与操作演示
 * 包含数组的声明、初始化、遍历等核心操作
 * 
 * 核心概念：
 * - 数组是相同类型数据的集合
 * - 通过下标访问元素，下标从0开始
 * - 数组长度固定，但可以通过新数组实现扩容
 */
public class ArrayBasic {
    public static void main(String[] args) {
        demonstrateArrayBasics();    // 演示数组基础操作
        demonstrateArrayOperations(); // 演示数组操作细节
    }
    
    /**
     * 演示数组基础：声明、初始化和遍历
     * 重点展示：
     * 1. 静态初始化：创建时直接指定元素值
     * 2. 动态初始化：先创建空间，后赋值
     * 3. 数组遍历：使用for循环访问每个元素
     */
    public static void demonstrateArrayBasics() {
        System.out.println("=== 数组基础演示 ===\n");
        
        // 1. 静态初始化 - 创建数组时直接指定元素值
        // 语法：数据类型[] 数组名 = {值1, 值2, ...};
        double[] hens = {3, 5, 1, 3.4, 2, 50};
        double totalWeight = 0;
        
        // 数组遍历：使用for循环访问每个元素
        // hens.length 获取数组长度，避免硬编码数字
        for (int i = 0; i < hens.length; i++) {
            totalWeight += hens[i];  // 累加每个元素的重量
        }
        System.out.printf("总体重: %.1fkg, 平均体重: %.2fkg\n", 
                         totalWeight, totalWeight / hens.length);
        
        // 2. 动态初始化 - 先创建指定大小的数组，后赋值
        // 语法：数据类型[] 数组名 = new 数据类型[大小];
        int[] scores = new int[5];
        System.out.println("数组默认值: " + scores[0]); // 展示int类型的默认值0
    }
    
    /**
     * 演示数组操作细节和注意事项
     * 重点说明：
     * 1. 数组类型必须一致
     * 2. 数组创建后的默认值
     * 3. 下标边界检查的重要性
     */
    public static void demonstrateArrayOperations() {
        System.out.println("\n=== 数组操作细节 ===");
        
        // 数组类型限制：同一数组只能存储相同类型的数据
        String[] cities = {"北京", "上海", "广州"}; // 字符串数组
        double[] numbers = {1.1, 2.2, 3.3, 100}; // int 100会自动转为double 100.0
        
        // 数组默认值演示：创建后未赋值的元素有默认值
        short[] defaults = new short[2]; // short类型默认值为0
        System.out.println("short数组默认值: " + defaults[0]);
        
        // 下标边界检查：数组下标从0开始，最大为长度-1
        int[] arr = new int[3]; // 有效下标：0, 1, 2
        // arr[3] = 10; // 错误！这将导致ArrayIndexOutOfBoundsException
        System.out.println("有效下标范围: 0 到 " + (arr.length - 1));
    }
}