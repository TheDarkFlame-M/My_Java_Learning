/**
 * ������ҵ
 */
public class HomeWork01 {
    public static void main(String[] args){
        // 1.�������б��ʽ�Ľ��
        System.out.println("10 / 3 = " + (10 / 3)); // 3
        System.out.println("10 / 5 = " + (10 / 5)); // 2
        System.out.println("10 % 2 = " + (10 % 2)); // 0
        System.out.println("-10.5 % 3 = " + (-10.5 % 3)); // -1.5
        // ע��:��С�����㣬�õ�����ǽ���ֵ
        
        // 2.˵���������Ľ��
        int i = 66;
        System.out.println(++i + i); // 134
        // �޸�: ++i(67) + i(67) = 134
        
        // 3. ��Java�У����¸�ֵ�����ȷ���ǣ�CD����
        // (A) int num1 = (int)"18"; // false; Ӧ�� Integer.parseInt("18");
        // (B) int num2 = 18.0; // false double -> int
        // (C) double num3 = 3d; // true
        // (D) double num4 = 8; // true int -> double
        // (E) int i2 = 48; char ch = i2 + 1; // false int -> char
        // (F) byte b = 19; short s = b + 2; // false int -> short
        
        // 4.��д����Stringת����double���͵���䣬�Լ���char����ת����String�����
        String str = "18.8"; // ע���ַ���Ҫ���Ա�ת��double
        double d1 = Double.parseDouble(str);
        System.out.println("�ַ���תdouble: " + d1);
        
        char c1 = 'A';
        String str2 = c1 + "";
        System.out.println("charתString: " + str2);
    }
}