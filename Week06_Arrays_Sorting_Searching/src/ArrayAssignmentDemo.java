/**
 * 数组赋值机制演示
 * 展示值拷贝与引用传递的区别
 * 
 * 重要概念：
 * - 基本数据类型：值传递，修改副本不影响原值
 * - 数组类型：引用传递，多个变量指向同一数据空间
 */
public class ArrayAssignmentDemo {
    public static void main(String[] args) {
        demonstrateValueCopy();           // 演示值拷贝
        demonstrateReferenceAssignment(); // 演示引用传递
    }
    
    /**
     * 演示基本数据类型的值拷贝
     * 特点：
     * - 赋值时创建值的副本
     * - 两个变量有独立的存储空间
     * - 修改一个变量不影响另一个
     */
    public static void demonstrateValueCopy() {
        System.out.println("1. 基本数据类型 - 值拷贝");
        int n1 = 10;
        int n2 = n1;  // 值拷贝：将n1的值10复制给n2
        
        n2 = 80;  // 修改n2的值，n1保持不变
        
        System.out.println("n1 = " + n1); // 输出：10（未受影响）
        System.out.println("n2 = " + n2); // 输出：80（已修改）
        System.out.println("✓ n2的变化不影响n1 - 值拷贝特性\n");
    }
    
    /**
     * 演示数组的引用赋值
     * 特点：
     * - 赋值时传递内存地址引用
     * - 多个变量指向同一数组对象
     * - 通过任一变量修改数组，其他变量都会看到变化
     */
    public static void demonstrateReferenceAssignment() {
        System.out.println("2. 数组 - 引用传递");
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;  // 引用赋值：arr2和arr1指向同一个数组对象
        
        arr2[0] = 10;  // 通过arr2修改数组，arr1也会看到变化
        
        System.out.print("arr1: ");
        printArray(arr1);  // 输出：[10, 2, 3] - 被arr2的修改影响了
        System.out.print("arr2: ");
        printArray(arr2);  // 输出：[10, 2, 3]
        System.out.println("✓ arr2的修改影响了arr1 - 引用传递特性");
        
        // 验证两个变量指向同一对象
        System.out.println("arr1 == arr2: " + (arr1 == arr2)); // 输出：true
    }
    
    /**
     * 打印数组内容的工具方法
     * @param arr 要打印的数组
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}