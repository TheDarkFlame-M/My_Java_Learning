/**
 * �����������ʾ
 * ������������ȡģ�������Լ�����
 */
public class ArithmeticOperator {
    public static void main(String[] args) {
        // ����������ʾ
        System.out.println("10 / 4 = " + (10 / 4));        // �������������Ϊ2
        System.out.println("10.0 / 4 = " + (10.0 / 4));    // ���������������Ϊ2.5
        
        double d = 10 / 4;  // ������������2����תΪ2.0
        System.out.println("d = " + d);                    // ���2.0
        
        // ȡģ���㣨��������
        System.out.println("10 % 3 = " + (10 % 3));        // ����Ϊ1
        System.out.println("-10 % 3 = " + (-10 % 3));      // ����Ϊ-1
        System.out.println("10 % -3 = " + (10 % -3));      // ����Ϊ1
        System.out.println("-10 % -3 = " + (-10 % -3));    // ����Ϊ-1
        
        // ��������
        int i = 10;
        i++;        // ��������i��Ϊ11
        ++i;        // ǰ������i��Ϊ12
        System.out.println("i = " + i);  // ���12
        
        // ���ʽ�е�����
        int j = 8;
        int k = ++j;    // ǰ������j�ȼ�1��Ϊ9���ٸ�ֵ��k
        int s = j++;    // ���������ȸ�ֵs=9��j�ټ�1��Ϊ10
        System.out.println("k = " + k + ", s = " + s + ", j = " + j);
    }
}