import java.util.Arrays;
import java.util.Scanner;

/**
 * 数组查找与插入：
 * - 顺序查找（线性搜索）
 * - 在有序数组中插入新元素并保持升序
 */
public class ArraySearchInsert {

    public static void main(String[] args) {
        // === 1. 顺序查找（猜名字游戏）===
        String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入要查找的名字: ");
        String target = scanner.nextLine();

        int foundIndex = -1;
        for (int i = 0; i < names.length; i++) {
            if (target.equals(names[i])) {
                foundIndex = i;
                break; // 找到即退出，提高效率
            }
        }

        if (foundIndex != -1) {
            System.out.println("✅ 找到！下标为: " + foundIndex);
        } else {
            System.out.println("❌ 未找到: " + target);
        }

        // === 2. 有序数组插入 ===
        int[] sortedArr = {11, 23, 53, 62};
        int insertNum = 47;

        // 步骤1: 找插入位置（第一个 >= insertNum 的索引）
        int index = sortedArr.length; // 默认插在末尾
        for (int i = 0; i < sortedArr.length; i++) {
            if (insertNum <= sortedArr[i]) {
                index = i;
                break;
            }
        }

        // 步骤2: 创建新数组并插入
        int[] newArr = new int[sortedArr.length + 1];
        for (int i = 0; i < newArr.length; i++) {
            if (i < index) {
                newArr[i] = sortedArr[i];         // 原元素照搬
            } else if (i == index) {
                newArr[i] = insertNum;            // 插入新值
            } else {
                newArr[i] = sortedArr[i - 1];     // 原元素后移
            }
        }

        System.out.println("原数组: " + Arrays.toString(sortedArr));
        System.out.println("插入 " + insertNum + " 后: " + Arrays.toString(newArr));
    }
}