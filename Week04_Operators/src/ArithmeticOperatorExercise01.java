/**
 * ����������ϰ
 * ���ǰ�����ͺ������ڱ��ʽ�е�����
 */
public class ArithmeticOperatorExercise01 {
    public static void main(String[] args) {
        // ����1���������ڱ��ʽ��
        int i = 1;
        i = i++;  // ����[1]temp=i(1) [2]i=i+1(2) [3]i=temp(1)
        System.out.println("i = i++ �Ľ��: " + i);  // ���1
        
        // ����2��ǰ�����ڱ��ʽ��  
        int i2 = 1;
        i2 = ++i2;  // ����[1]i2=i2+1(2) [2]temp=i2(2) [3]i2=temp(2)
        System.out.println("i2 = ++i2 �Ľ��: " + i2);  // ���2
    }
}
