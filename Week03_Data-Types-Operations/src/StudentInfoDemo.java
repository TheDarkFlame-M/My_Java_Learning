/**
 * 第03周：学生信息输出演示
 * 展示变量定义和格式化输出
 */
public class StudentInfoDemo {
    public static void main(String[] args) {
        demonstrateStudentInfo();
    }
    
    /**
     * 演示学生信息输出
     * 来源：homework04.java - 学生信息练习
     */
    public static void demonstrateStudentInfo() {
        System.out.println("=== 学生信息输出演示 ===");
        
        String name = "那王真眼";
        short age = 1872;
        String score = "A级";
        String gender = "超凡";  // 修正了变量名
        String goal = "选择世界法则，寻找不可逾亿境界线";
        
        // 使用转义字符和拼接格式化输出
        System.out.println("姓名\t\t年龄\t成绩\t性别\t目标");
        System.out.println(name + "\t" + age + "\t" + score + "\t" + gender + "\t" + goal);
    }
}