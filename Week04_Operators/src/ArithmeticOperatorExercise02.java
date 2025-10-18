/**
 * 算术运算符综合练习
 * 实际应用案例：天数换算和温度转换
 */
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        // 练习1：假期天数换算
        int days = 59;
        int weeks = days / 7;      // 计算完整星期数
        int leftDays = days % 7;   // 计算剩余天数
        System.out.println(days + "天 合" + weeks + "星期零" + leftDays + "天");
        
        // 练习2：华氏温度转摄氏温度
        double huashi = 234.6;
        // 注意：使用5.0而不是5，避免整数除法
        double sheshi = 5.0 / 9 * (huashi - 100);
        System.out.println("华氏温度" + huashi + " 对应的摄氏温度 = " + sheshi);
    }
}