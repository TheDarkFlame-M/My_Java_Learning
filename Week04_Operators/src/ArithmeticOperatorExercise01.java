/**
 * 自增运算练习
 * 理解前自增和后自增在表达式中的区别
 */
public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        // 案例1：后自增在表达式中
        int i = 1;
        i = i++;  // 规则：[1]temp=i(1) [2]i=i+1(2) [3]i=temp(1)
        System.out.println("i = i++ 的结果: " + i);  // 输出1
        
        // 案例2：前自增在表达式中  
        int i2 = 1;
        i2 = ++i2;  // 规则：[1]i2=i2+1(2) [2]temp=i2(2) [3]i2=temp(2)
        System.out.println("i2 = ++i2 的结果: " + i2);  // 输出2
    }
}
