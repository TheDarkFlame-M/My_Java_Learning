/**
 * 打印金字塔图案
 */
public class Pyramid {
    public static void main(String[] args) {
        int layers = 5; // 金字塔层数
        
        // 打印实心金字塔
        System.out.println("实心金字塔:");
        for (int i = 1; i <= layers; i++) {
            // 打印空格
            for (int k = 1; k <= layers - i; k++) {
                System.out.print(" ");
            }
            // 打印星号
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("\n空心金字塔:");
        // 打印空心金字塔
        for (int i = 1; i <= layers; i++) {
            // 打印空格
            for (int k = 1; k <= layers - i; k++) {
                System.out.print(" ");
            }
            // 打印星号（空心）
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == layers) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}