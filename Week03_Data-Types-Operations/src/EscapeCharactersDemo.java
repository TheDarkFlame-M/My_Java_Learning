/**
 * 第03周：转义字符演示
 * 展示Java中常用转义字符的使用
 */
public class EscapeCharactersDemo {
    public static void main(String[] args) {
        demonstrateEscapeChars();
    }
    
    /**
     * 演示转义字符的使用
     * 来源：homework02.java - 转义字符练习
     */
    public static void demonstrateEscapeChars() {
        System.out.println("=== 转义字符演示 ===");
        char c1 = '\n'; // 换行
        char c2 = '\t'; // 制表位
        char c3 = '\r'; // 回车
        char c4 = '\\'; // 反斜杠（修正了原来的错误）
        char c5 = '1';
        char c6 = '2';
        char c7 = '3';
        
        System.out.println("换行符演示：" + c1 + "这是新的一行");
        System.out.println("制表符演示：" + c2 + "这是制表后的位置");
        System.out.println("反斜杠演示：" + c4);
        System.out.println("数字字符：" + c5 + c6 + c7);
        System.out.println();
    }
}