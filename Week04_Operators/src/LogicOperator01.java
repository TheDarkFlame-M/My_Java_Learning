/**
 * �߼����������ʾ
 * �Ƚ� &&����·�룩�� &���߼��룩������
 */
public class LogicOperator01 {
    public static void main(String[] args) {
        int age = 50;
        
        // ��·�� &&����һ��Ϊfalseʱ�����жϵڶ���
        if (age > 20 && age < 90) {
            System.out.println("ok100 - ʹ��&&");
        }
        
        // �߼��� &���������������ж�
        if (age > 20 & age < 90) {
            System.out.println("ok200 - ʹ��&");
        }
        
        // ��ʾ��·����
        int a = 4;
        int b = 9;
        if (a < 1 && ++b < 50) {  // a<1Ϊfalse��++b����ִ��
            System.out.println("ok300");
        }
        System.out.println("a = " + a + ", b = " + b);  // a=4, b=9
    }
}