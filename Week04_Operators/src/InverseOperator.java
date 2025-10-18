/**
 * 取反和异或运算符演示
 */
public class InverseOperator {
    public static void main(String[] args) {
        // 取反运算符 !
        System.out.println("60 > 20: " + (60 > 20));          // true
        System.out.println("!(60 > 20): " + !(60 > 20));      // false
        
        // 异或运算符 ^ (相同为false，不同为true)
        boolean b1 = (10 > 1) ^ (3 < 5);   // true ^ true = false
        System.out.println("(10>1) ^ (3<5): " + b1);
        
        boolean b2 = (10 > 1) ^ (3 > 5);   // true ^ false = true  
        System.out.println("(10>1) ^ (3>5): " + b2);
    }
}