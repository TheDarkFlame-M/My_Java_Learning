/**
 * 三元运算符基础演示
 * 语法：条件 ? 表达式1 : 表达式2
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        
        // 三元运算符：如果a<b返回a++，否则返回b--
        // 由于a<b为true，返回a++（先返回a的值10，然后a自增为11）
        int result = a < b ? a++ : b--;
        
        System.out.println("result = " + result);  // 输出10
        System.out.println("a = " + a);            // 输出11（自增后）
        System.out.println("b = " + b);            // 输出99（未自减）
    }
}