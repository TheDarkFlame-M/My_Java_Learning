/**
 * ��Ԫ�����ϸ��
 * ����ƥ����Զ�ת��
 */
public class TernaryOperatorDetail {
    public static void main(String[] args) {
        int a = 3;
        int b = 8;
        
        // ���ʽ1�ͱ��ʽ2��Ҫ���ͼ���
        // ����ǿ��ת��
        int c = a > b ? (int)1.1 : (int)3.4;
        System.out.println("c = " + c);
        
        // �����Զ�ת����int�Զ�תdouble��
        double d = a > b ? a : b + 3;
        System.out.println("d = " + d);
    }
}