/**
 * 第03周：变量与数据类型演示
 * 整合了基本变量操作、数据类型使用的练习
 */
public class VariableDemo {
    public static void main(String[] args) {
        demonstrateBasicVariables();
    }
    
    /**
     * 演示基本变量操作
     * 来源：homework01.java - 变量声明、初始化和基本运算
     */
    public static void demonstrateBasicVariables() {
        System.out.println("=== 基本变量操作演示 ===");
        int n1 = 13;
        int n2 = 17;
        int n3 = n1 + n2;  // 30
        System.out.println("n1 + n2 = " + n3);
        
        int n4 = 38;
        int n5 = n4 - n3;  // 8
        System.out.println("n4 - n3 = " + n5);
        System.out.println();
    }
}