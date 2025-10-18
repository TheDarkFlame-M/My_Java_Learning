/**
 * 第02周：Java基础与心法 - 代码演示整合
 * 整合了从Hello World到编码规范的所有练习内容
 */
public class JavaFoundation {
    
    public static void main(String[] args) {
        demonstrateFirstProgram();
        demonstrateEscapeCharacters();
        demonstrateCodingStandards();
    }
    
    /**
     * 演示第一个Java程序
     * 【学习心得】：刚接触的时候光是hello world就弄了快两小时，
     * 运行报错了好几次，也看不懂，一直反复修改。
     * 其实这么看还是很有进步的！
     */
    public static void demonstrateFirstProgram() {
        System.out.println("=== 第一个Java程序 ===");
        System.out.println("hello world");
    }
    
    /**
     * 演示转义字符的使用
     * 【学习心得】：有了基础后这个比较好理解
     */
    public static void demonstrateEscapeCharacters() {
        System.out.println("\n=== 转义字符演示 ===");
        System.out.println("姓名\t性别\t籍贯\t住址");
        System.out.println("邪王\t超凡\t神圣\t黑暗");
    }
    
    /**
     * 演示编码规范的重要性
     * 注意：运算符两边加了空格，代码更清晰
     */
    public static void demonstrateCodingStandards() {
        System.out.println("\n=== 编码规范演示 ===");
        int n = 1 + 4;  // 运算符两边有空格，符合规范
        System.out.println("规范编写的代码，n = " + n);
    }
}