/**
 * 三元运算符练习
 * 求三个数中的最大值
 */
public class TernaryOperatorExercise {
    public static void main(String[] args) {
        int n1 = 55;
        int n2 = 33;
        int n3 = 123;
        
        // 方法1：分步求解（推荐，清晰易懂）
        int max1 = n1 > n2 ? n1 : n2;    // 先求n1和n2的最大值
        int max2 = max1 > n3 ? max1 : n3; // 再与n3比较
        System.out.println("最大数 = " + max2);
        
        // 方法2：一条语句实现
        int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
        System.out.println("最大数 = " + max);
        
        // 提示：后续学习数组后会有更好的方法
    }
}