/**
 * ��03�ܣ�����������������ʾ
 * �����˻���������������������ʹ�õ���ϰ
 */
public class VariableDemo {
    public static void main(String[] args) {
        demonstrateBasicVariables();
    }
    
    /**
     * ��ʾ������������
     * ��Դ��homework01.java - ������������ʼ���ͻ�������
     */
    public static void demonstrateBasicVariables() {
        System.out.println("=== ��������������ʾ ===");
        int n1 = 13;
        int n2 = 17;
        int n3 = n1 + n2;  // 30
        System.out.println("n1 + n2 = " + n3);
        
        int n4 = 38;
        int n5 = n4 - n3;  // 8
        System.out.println("n4 - n3 = " + n5);
        System.out.println();
    }
}