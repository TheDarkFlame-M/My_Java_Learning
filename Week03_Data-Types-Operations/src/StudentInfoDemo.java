/**
 * ��03�ܣ�ѧ����Ϣ�����ʾ
 * չʾ��������͸�ʽ�����
 */
public class StudentInfoDemo {
    public static void main(String[] args) {
        demonstrateStudentInfo();
    }
    
    /**
     * ��ʾѧ����Ϣ���
     * ��Դ��homework04.java - ѧ����Ϣ��ϰ
     */
    public static void demonstrateStudentInfo() {
        System.out.println("=== ѧ����Ϣ�����ʾ ===");
        
        String name = "��������";
        short age = 1872;
        String score = "A��";
        String gender = "����";  // �����˱�����
        String goal = "ѡ�����編��Ѱ�Ҳ������ھ�����";
        
        // ʹ��ת���ַ���ƴ�Ӹ�ʽ�����
        System.out.println("����\t\t����\t�ɼ�\t�Ա�\tĿ��");
        System.out.println(name + "\t" + age + "\t" + score + "\t" + gender + "\t" + goal);
    }
}