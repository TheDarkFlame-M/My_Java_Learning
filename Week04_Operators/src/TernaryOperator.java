/**
 * ��Ԫ�����������ʾ
 * �﷨������ ? ���ʽ1 : ���ʽ2
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 99;
        
        // ��Ԫ����������a<b����a++�����򷵻�b--
        // ����a<bΪtrue������a++���ȷ���a��ֵ10��Ȼ��a����Ϊ11��
        int result = a < b ? a++ : b--;
        
        System.out.println("result = " + result);  // ���10
        System.out.println("a = " + a);            // ���11��������
        System.out.println("b = " + b);            // ���99��δ�Լ���
    }
}