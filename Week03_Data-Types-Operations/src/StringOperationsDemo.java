/**
 * ��03�ܣ��ַ���������ʾ
 * չʾ�ַ���ƴ�Ӻ��ַ�����
 */
public class StringOperationsDemo {
    public static void main(String[] args) {
        demonstrateStringConcatenation();
    }
    
    /**
     * ��ʾ�ַ���ƴ�Ӳ���
     * ��Դ��homework03.java - �ַ���ƴ����ϰ
     */
    public static void demonstrateStringConcatenation() {
        System.out.println("=== �ַ���ƴ����ʾ ===");
        
        // ����ƴ��
        String book1 = "���μ�";
        String book2 = "��¥��";
        System.out.println(book1 + book2); // ���μǺ�¥��
        
        // �ַ�ƴ�ӣ�ע�⣺char��ӵõ�������ֵ��
        char c1 = '��';
        char c2 = 'Ů';
        System.out.println("�ַ�ֱ����ӣ���ֵ����" + (c1 + c2));
        System.out.println("�ַ�ת�ַ�����ӣ�" + c1 + c2);
        
        // �۸����
        float price1 = 123.56f;
        float price2 = 100.11f;
        System.out.println("�۸��ܺͣ�" + (price1 + price2)); // 223.67
        System.out.println();
    }
}