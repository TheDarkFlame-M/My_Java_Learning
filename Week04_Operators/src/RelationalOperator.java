/**
 * 关系运算符演示
 * 包括6种比较运算
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int i1 = 9;
        int i2 = 8;
        
        // 6种关系运算符演示
        System.out.println(i1 + " > " + i2 + ": " + (i1 > i2));    // true
        System.out.println(i1 + " >= " + i2 + ": " + (i1 >= i2));  // true
        System.out.println(i1 + " <= " + i2 + ": " + (i1 <= i2));  // false
        System.out.println(i1 + " < " + i2 + ": " + (i1 < i2));    // false
        System.out.println(i1 + " == " + i2 + ": " + (i1 == i2));  // false
        System.out.println(i1 + " != " + i2 + ": " + (i1 != i2));  // true
        
        // 关系运算结果赋值给boolean变量
        boolean flag = i1 > i2;
        System.out.println("flag = i1 > i2: " + flag);  // true
    }
}
