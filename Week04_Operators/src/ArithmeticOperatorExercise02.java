/**
 * ����������ۺ���ϰ
 * ʵ��Ӧ�ð���������������¶�ת��
 */
public class ArithmeticOperatorExercise02 {
    public static void main(String[] args) {
        // ��ϰ1��������������
        int days = 59;
        int weeks = days / 7;      // ��������������
        int leftDays = days % 7;   // ����ʣ������
        System.out.println(days + "�� ��" + weeks + "������" + leftDays + "��");
        
        // ��ϰ2�������¶�ת�����¶�
        double huashi = 234.6;
        // ע�⣺ʹ��5.0������5��������������
        double sheshi = 5.0 / 9 * (huashi - 100);
        System.out.println("�����¶�" + huashi + " ��Ӧ�������¶� = " + sheshi);
    }
}