/**
 * 1-100以内的数求和
 * 求出当和第一次大于20的当前数
 */
public class SumCalculator {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 20) {
                number = i;
                break;
            }
        }
        
        System.out.println("当前数: " + number);
        System.out.println("当前和: " + sum);
    }
}