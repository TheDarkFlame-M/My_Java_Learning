/**
 * ��03�ܣ�ת���ַ���ʾ
 * չʾJava�г���ת���ַ���ʹ��
 */
public class EscapeCharactersDemo {
    public static void main(String[] args) {
        demonstrateEscapeChars();
    }
    
    /**
     * ��ʾת���ַ���ʹ��
     * ��Դ��homework02.java - ת���ַ���ϰ
     */
    public static void demonstrateEscapeChars() {
        System.out.println("=== ת���ַ���ʾ ===");
        char c1 = '\n'; // ����
        char c2 = '\t'; // �Ʊ�λ
        char c3 = '\r'; // �س�
        char c4 = '\\'; // ��б�ܣ�������ԭ���Ĵ���
        char c5 = '1';
        char c6 = '2';
        char c7 = '3';
        
        System.out.println("���з���ʾ��" + c1 + "�����µ�һ��");
        System.out.println("�Ʊ����ʾ��" + c2 + "�����Ʊ���λ��");
        System.out.println("��б����ʾ��" + c4);
        System.out.println("�����ַ���" + c5 + c6 + c7);
        System.out.println();
    }
}