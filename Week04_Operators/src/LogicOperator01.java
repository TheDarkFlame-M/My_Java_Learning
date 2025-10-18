/**
 * 逻辑与运算符演示
 * 比较 &&（短路与）和 &（逻辑与）的区别
 */
public class LogicOperator01 {
    public static void main(String[] args) {
        int age = 50;
        
        // 短路与 &&：第一个为false时不再判断第二个
        if (age > 20 && age < 90) {
            System.out.println("ok100 - 使用&&");
        }
        
        // 逻辑与 &：两个条件都会判断
        if (age > 20 & age < 90) {
            System.out.println("ok200 - 使用&");
        }
        
        // 演示短路特性
        int a = 4;
        int b = 9;
        if (a < 1 && ++b < 50) {  // a<1为false，++b不会执行
            System.out.println("ok300");
        }
        System.out.println("a = " + a + ", b = " + b);  // a=4, b=9
    }
}