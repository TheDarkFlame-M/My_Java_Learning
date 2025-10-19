/**
 * 本章作业
 */
public class HomeWork01 {
    public static void main(String[] args){
        // 1.计算下列表达式的结果
        System.out.println("10 / 3 = " + (10 / 3)); // 3
        System.out.println("10 / 5 = " + (10 / 5)); // 2
        System.out.println("10 % 2 = " + (10 % 2)); // 0
        System.out.println("-10.5 % 3 = " + (-10.5 % 3)); // -1.5
        // 注意:有小数运算，得到结果是近似值
        
        // 2.说出下面代码的结果
        int i = 66;
        System.out.println(++i + i); // 134
        // 修改: ++i(67) + i(67) = 134
        
        // 3. 在Java中，以下赋值语句正确的是（CD）。
        // (A) int num1 = (int)"18"; // false; 应该 Integer.parseInt("18");
        // (B) int num2 = 18.0; // false double -> int
        // (C) double num3 = 3d; // true
        // (D) double num4 = 8; // true int -> double
        // (E) int i2 = 48; char ch = i2 + 1; // false int -> char
        // (F) byte b = 19; short s = b + 2; // false int -> short
        
        // 4.试写出将String转换成double类型的语句，以及将char类型转换成String的语句
        String str = "18.8"; // 注意字符串要可以被转成double
        double d1 = Double.parseDouble(str);
        System.out.println("字符串转double: " + d1);
        
        char c1 = 'A';
        String str2 = c1 + "";
        System.out.println("char转String: " + str2);
    }
}