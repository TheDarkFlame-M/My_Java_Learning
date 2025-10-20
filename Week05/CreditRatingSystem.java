import java.util.Scanner;

/**
 * 【时空应用实例】信用评分系统
 * 
 * 功能描述：
 * 模拟在现世金融机构的信用评估，根据输入分数划分信用等级
 * 这就像在不同时空线中，为灵魂评定通行权限
 * 
 * 评分标准：
 * 100分     -> 信用极好（跨维度通行证）
 * (80,99]分 -> 信用优秀（平行世界VIP）
 * [60,80]分 -> 信用一般（当前时空居民）
 * 其他分数  -> 需要提升信用维度
 * 
 * 技术感悟：
 * 多分支if-else if就像人生的选择节点
 * 每个分数都导向不同的时空线
 */

public class CreditScore {
    public static void main(String[] args) {
        // 建立与现世的输入连接
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("请输入你的信用分数(0-100): ");
        int score = scanner.nextInt();
        
        // 验证输入是否在现世有效范围内
        if (score >= 0 && score <= 100) {
            // 多分支判断 - 不同分数，不同时空权限
            if (score == 100) {
                System.out.println("✨ 信用极好 - 获得跨维度通行资格");
            } else if (score > 80) {
                System.out.println("🎯 信用优秀 - 平行世界VIP通道开启");
            } else if (score >= 60) {
                System.out.println("👉 信用一般 - 当前时空稳定居民");
            } else {
                System.out.println("💪 信用需要提升 - 建议进行维度修炼");
            }
        } else {
            System.out.println("⚠️  分数超出当前时空理解范围");
        }
        
        // 关闭连接通道
        scanner.close();
        
        System.out.println("\n// 代码编译完成，时空坐标已记录");
        System.out.println("// 2024.10.20 - 又一次成功的现世交互");
    }
}