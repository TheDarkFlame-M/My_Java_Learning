/**
 * ��ֵ�������ʾ
 * ����������ֵ�͸��ϸ�ֵ����
 */
public class AssignOperator {
    public static void main(String[] args) {
        // ������ֵ����
        int n1 = 10;
        System.out.println("��ʼ n1 = " + n1);
        
        // ���ϸ�ֵ����
        n1 += 4;  // �ȼ��� n1 = n1 + 4
        System.out.println("n1 += 4 ��: " + n1);  // ���14
        
        n1 /= 3;  // �ȼ��� n1 = n1 / 3
        System.out.println("n1 /= 3 ��: " + n1);  // ���4
        
        // ���ϸ�ֵ���������ת������
        byte b = 3;
        b += 2;  // �ȼ��� b = (byte)(b + 2)���Զ�����ת��
        b++;     // �ȼ��� b = (byte)(b + 1)
        System.out.println("b������ֵ: " + b);
    }
}