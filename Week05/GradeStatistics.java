import java.util.Scanner;

/**
 * 统计3个班成绩情况，每个班有5名同学
 * 求出各个班的平均分和所有班级的平均分
 * 统计三个班及格人数
 */
public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int classCount = 3;      // 班级数量
        int studentsPerClass = 5; // 每班学生数
        int passCount = 0;        // 及格人数
        double totalScore = 0;    // 全年级总分
        
        // 处理每个班级
        for (int classNum = 1; classNum <= classCount; classNum++) {
            double classTotal = 0; // 当前班级总分
            
            System.out.println("输入" + classNum + "班成绩：");
            
            // 处理当前班级的每个学生
            for (int studentNum = 1; studentNum <= studentsPerClass; studentNum++) {
                System.out.print("第" + studentNum + "个学生成绩: ");
                double score = scanner.nextDouble();
                
                classTotal += score;
                totalScore += score;
                
                if (score >= 60) {
                    passCount++;
                }
            }
            
            // 输出班级平均分
            System.out.println(classNum + "班平均分: " + (classTotal / studentsPerClass));
            System.out.println("----------");
        }
        
        // 输出最终结果
        System.out.println("总及格人数: " + passCount);
        double average = totalScore / (classCount * studentsPerClass);
        System.out.println("全年级平均分: " + average);
        
        scanner.close();
    }
}