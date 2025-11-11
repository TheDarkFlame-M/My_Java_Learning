import java.util.Scanner;

/**
 * 交互式数组管理器
 * 提供动态扩容和缩减功能，支持用户交互操作
 * 
 * 功能特点：
 * - 用户控制操作流程
 * - 实时显示数组状态
 * - 防止非法操作（如空数组缩减）
 */
public class InteractiveArrayManager {
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== 交互式数组管理器 ===\n");
        
        demonstrateArrayExpansion();  // 演示数组扩容
        demonstrateArrayReduction();  // 演示数组缩减
        
        scanner.close();  // 关闭Scanner释放资源
    }
    
    /**
     * 演示动态数组扩容功能
     * 交互流程：
     * 1. 显示当前数组状态
     * 2. 询问用户是否添加元素
     * 3. 根据用户输入执行相应操作
     * 4. 循环直到用户选择退出
     */
    public static void demonstrateArrayExpansion() {
        System.out.println("1. 动态数组扩容演示");
        int[] arr = {1, 2, 3};  // 初始数组
        
        // 使用do-while循环确保至少执行一次
        do {
            printArrayState(arr, "当前数组");
            
            System.out.print("是否添加元素? (y/n): ");
            char choice = scanner.next().charAt(0);  // 读取第一个字符
            
            if (choice == 'y' || choice == 'Y') {
                System.out.print("输入要添加的数字: ");
                int newElement = scanner.nextInt();
                arr = addElement(arr, newElement);  // 调用扩容方法
                System.out.println("✓ 添加成功");
            } else if (choice == 'n' || choice == 'N') {
                break;  // 退出循环
            } else {
                System.out.println("! 请输入 y 或 n");  // 输入验证
            }
        } while (true);  // 无限循环，通过break退出
        
        printArrayState(arr, "最终数组");
    }
    
    /**
     * 演示动态数组缩减功能
     * 安全措施：
     * - 检查数组长度，防止过度缩减
     * - 每次只移除最后一个元素
     * - 明确提示操作结果
     */
    public static void demonstrateArrayReduction() {
        System.out.println("\n2. 动态数组缩减演示");
        int[] arr = {1, 2, 3, 4, 5};  // 初始数组
        
        do {
            printArrayState(arr, "当前数组");
            
            // 安全检查：数组长度不能小于1
            if (arr.length == 1) {
                System.out.println("! 不能再缩减，已到最小长度");
                break;
            }
            
            System.out.print("是否缩减最后一个元素? (y/n): ");
            char choice = scanner.next().charAt(0);
            
            if (choice == 'y' || choice == 'Y') {
                arr = removeLastElement(arr);  // 调用缩减方法
                System.out.println("✓ 缩减成功");
            } else if (choice == 'n' || choice == 'N') {
                break;
            } else {
                System.out.println("! 请输入 y 或 n");
            }
        } while (true);
        
        printArrayState(arr, "最终数组");
    }
    
    // ==================== 核心操作方法 ====================
    
    /**
     * 向数组添加新元素（扩容）
     * @param arr 原数组
     * @param element 要添加的新元素
     * @return 扩容后的新数组
     * 实现步骤：
     * 1. 创建比原数组长度+1的新数组
     * 2. 复制原数组所有元素
     * 3. 在新数组末尾添加新元素
     */
    public static int[] addElement(int[] arr, int element) {
        int[] newArr = new int[arr.length + 1];  // 创建扩容后的数组
        // 复制原数组内容到新数组
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[newArr.length - 1] = element;  // 在末尾添加新元素
        return newArr;
    }
    
    /**
     * 移除数组最后一个元素（缩减）
     * @param arr 原数组
     * @return 缩减后的新数组
     * 实现步骤：
     * 1. 创建比原数组长度-1的新数组
     * 2. 复制原数组除最后一个元素外的所有元素
     * 3. 返回新数组
     */
    public static int[] removeLastElement(int[] arr) {
        if (arr.length <= 1) return arr;  // 边界检查
        
        int[] newArr = new int[arr.length - 1];  // 创建缩减后的数组
        // 复制除最后一个元素外的所有元素
        System.arraycopy(arr, 0, newArr, 0, arr.length - 1);
        return newArr;
    }
    
    /**
     * 打印数组状态信息
     * @param arr 要显示的数组
     * @param title 显示标题
     * 显示格式：[元素1, 元素2, ...] (长度: n)
     */
    public static void printArrayState(int[] arr, String title) {
        System.out.print(title + ": [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");  // 元素间用逗号分隔
        }
        System.out.println("] (长度: " + arr.length + ")");  // 显示数组长度
    }
}