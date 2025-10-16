/**
 * 第03周：字符串操作演示
 * 展示字符串拼接和字符操作
 */
public class StringOperationsDemo {
    public static void main(String[] args) {
        demonstrateStringConcatenation();
    }
    
    /**
     * 演示字符串拼接操作
     * 来源：homework03.java - 字符串拼接练习
     */
    public static void demonstrateStringConcatenation() {
        System.out.println("=== 字符串拼接演示 ===");
        
        // 书名拼接
        String book1 = "西游记";
        String book2 = "红楼梦";
        System.out.println(book1 + book2); // 西游记红楼梦
        
        // 字符拼接（注意：char相加得到的是码值）
        char c1 = '男';
        char c2 = '女';
        System.out.println("字符直接相加（码值）：" + (c1 + c2));
        System.out.println("字符转字符串相加：" + c1 + c2);
        
        // 价格相加
        float price1 = 123.56f;
        float price2 = 100.11f;
        System.out.println("价格总和：" + (price1 + price2)); // 223.67
        System.out.println();
    }
}