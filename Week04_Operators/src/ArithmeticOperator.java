/**
 * 算术运算符演示
 * 包括：除法、取模、自增自减运算
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        // 除法运算演示
        System.out.println("10 / 4 = " + (10 / 4));        // 整数除法，结果为2
        System.out.println("10.0 / 4 = " + (10.0 / 4));    // 浮点数除法，结果为2.5
        
        double d = 10 / 4;  // 先整数除法得2，再转为2.0
        System.out.println("d = " + d);                    // 输出2.0
        
        // 取模运算（求余数）
        System.out.println("10 % 3 = " + (10 % 3));        // 余数为1
        System.out.println("-10 % 3 = " + (-10 % 3));      // 余数为-1
        System.out.println("10 % -3 = " + (10 % -3));      // 余数为1
        System.out.println("-10 % -3 = " + (-10 % -3));    // 余数为-1
        
        // 自增运算
        int i = 10;
        i++;        // 后自增，i变为11
        ++i;        // 前自增，i变为12
        System.out.println("i = " + i);  // 输出12
        
        // 表达式中的自增
        int j = 8;
        int k = ++j;    // 前自增：j先加1变为9，再赋值给k
        int s = j++;    // 后自增：先赋值s=9，j再加1变为10
        System.out.println("k = " + k + ", s = " + s + ", j = " + j);
    }
}