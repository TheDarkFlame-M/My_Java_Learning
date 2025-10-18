/**
 * 赋值运算符演示
 * 包括基本赋值和复合赋值运算
 */
public class AssignOperator {
    public static void main(String[] args) {
        // 基本赋值运算
        int n1 = 10;
        System.out.println("初始 n1 = " + n1);
        
        // 复合赋值运算
        n1 += 4;  // 等价于 n1 = n1 + 4
        System.out.println("n1 += 4 后: " + n1);  // 输出14
        
        n1 /= 3;  // 等价于 n1 = n1 / 3
        System.out.println("n1 /= 3 后: " + n1);  // 输出4
        
        // 复合赋值运算的类型转换特性
        byte b = 3;
        b += 2;  // 等价于 b = (byte)(b + 2)，自动类型转换
        b++;     // 等价于 b = (byte)(b + 1)
        System.out.println("b的最终值: " + b);
    }
}