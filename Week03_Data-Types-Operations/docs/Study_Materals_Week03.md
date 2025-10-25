# 第3章 变量

## 3.1 为什么需要变量

### 3.1.1 程序就是一个世界
程序是对现实世界的模拟和抽象，变量是程序世界中的基本组成单元。

### 3.1.2 变量的概念
**变量**相当于内存中一个数据存储空间的表示，通过变量名可以访问到变量值。

### 3.1.3 变量使用的基本步骤
1. **声明变量**：`int a;`
2. **赋值**：`a = 60;`
3. **使用**：`System.out.println(a);`

**一步完成**：`int a = 60;`

### 3.2 变量快速入门
public class Var02 {
    public static void main(String[] args) {
        // 记录人的信息
        int age = 30;
        double score = 88.9;
        char gender = '男';
        String name = "king";
        
        // 输出信息
        System.out.println("人的信息如下:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(score);
        System.out.println(gender);
    }
}

### 3.3 变量使用注意事项
public class VarDetail {
    public static void main(String[] args) {
        // 1. 变量必须先声明，后使用
        int a = 50;
        System.out.println(a); // 50
        
        // 2. 变量值可以在同一类型范围内变化
        a = 88; // 正确
        // a = "jack"; // 错误
        
        // 3. 变量在同一个作用域内不能重名
        // int a = 77; // 错误
    }
}

### 3.4 程序中 + 号的使用
• 两边都是数值时：做加法运算
• 有一边是字符串时：做拼接运算

### 3.5 数据类型

### 3.5.1 数据类型分类
1. 基本数据类型（8种）
◦ 数值型：byte, short, int, long, float, double
◦ 字符型：char
◦ 布尔型：boolean
2. 引用类型
◦ 类、接口、数组
### 3.6 整数类型

### 3.6.1 整型分类
• byte：1字节，-128 ~ 127
• short：2字节，-32768 ~ 32767
• int：4字节，-21亿 ~ 21亿
• long：8字节

### 3.6.2 使用细节
public class IntDetail {
    public static void main(String[] args) {
        // Java整型常量默认为int型
        int n1 = 1; // 正确
        // long n2 = 1L; // 声明long型需要加L
    }
}

### 3.7 浮点类型

### 3.7.1 浮点型分类
• float：4字节
• double：8字节

### 3.7.2 使用细节
public class FloatDetail {
    public static void main(String[] args) {
        // Java浮点型常量默认为double型
        // float num1 = 1.1; // 错误
        float num2 = 1.1F; // 正确
        
        // 科学计数法
        System.out.println(5.12e2); // 512.0
        System.out.println(5.12E-2); // 0.0512
        
        // 浮点数精度问题
        double num11 = 2.7;
        double num12 = 8.1 / 3; // 接近2.7但不是2.7
        
        // 正确的浮点数比较方式
        if(Math.abs(num11 - num12) < 0.000001) {
            System.out.println("认为相等");
        }
    }
}

### 3.8 字符类型(char)

### 3.8.1 使用细节
public class CharDetail {
    public static void main(String[] args) {
        // char本质是整数，输出对应Unicode字符
        char c1 = 97;
        System.out.println(c1); // a
        
        // 字符可以进行运算
        System.out.println('a' + 10); // 107
        
        char c5 = 'b' + 1;
        System.out.println(c5); // c
    }
}

### 3.9 布尔类型：boolean
public class Boolean01 {
    public static void main(String[] args) {
        boolean isPass = true;
        if(isPass) {
            System.out.println("考试通过，恭喜");
        } else {
            System.out.println("考试没有通过，下次努力");
        }
    }
}

### 3.10 基本数据类型转换

### 3.10.1 自动类型转换
• 小容量类型自动转换为大容量类型
• byte → short → int → long → float → doubl

### 3.10.2 自动类型转换细节
public class AutoConvertDetail {
    public static void main(String[] args) {
        // 多种类型混合运算时，自动转换为容量最大的类型
        int n1 = 10;
        // float d1 = n1 + 1.1; // 错误
        double d1 = n1 + 1.1; // 正确
        
        // byte,short,char之间不会相互自动转换
        byte b1 = 10;
        // char c1 = b1; // 错误
        
        // byte,short,char计算时首先转换为int
        byte b2 = 1;
        byte b3 = 2;
        // byte b4 = b2 + b3; // 错误
        int b4 = b2 + b3; // 正确
    }
}

### 3.10.3 强制类型转换
public class ForceConvertDetail {
    public static void main(String[] args) {
        // 强制类型转换
        int x = (int)(10*3.5+6*1.5); // 44
        
        int m = 100;
        char c3 = (char)m; // d
    }
}

### 3.11 基本数据类型和String类型的转换

### 3.11.1 转换方法
public class StringToBasic {
    public static void main(String[] args) {
        // 基本数据类型 -> String
        int n1 = 100;
        String s1 = n1 + "";
        
        // String -> 基本数据类型
        String s5 = "123";
        int num1 = Integer.parseInt(s5);
        double num2 = Double.parseDouble(s5);
        
        // 字符串转字符（取第一个字符）
        System.out.println(s5.charAt(0)); // '1'
    }
}

### 3.11.2 注意事项
public class StringToBasicDetail {
    public static void main(String[] args) {
        String str = "hello";
        // int n1 = Integer.parseInt(str); // 运行时报错
    }
}

### 3.12 本章重点总结
1. 变量是程序的基本组成单位
2. Java有8种基本数据类型
3. 注意数据类型转换规则
4. 掌握String与基本类型的相互转换

5. 注意浮点数的精度问题

