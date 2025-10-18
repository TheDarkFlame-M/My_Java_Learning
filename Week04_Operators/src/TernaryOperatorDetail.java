/**
 * 三元运算符细节
 * 类型匹配和自动转换
 */
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        
        // 表达式1和表达式2需要类型兼容
        // 可以强制转换
        int c = a > b ? (int)1.1 : (int)3.4;
        System.out.println("c = " + c);
        
        // 可以自动转换（int自动转double）
        double d = a > b ? a : b + 3;
        System.out.println("d = " + d);
    }
}