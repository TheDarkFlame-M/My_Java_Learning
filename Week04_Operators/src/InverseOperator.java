/**
 * ȡ��������������ʾ
 */
public class InverseOperator {
    public static void main(String[] args) {
        // ȡ������� !
        System.out.println("60 > 20: " + (60 > 20));          // true
        System.out.println("!(60 > 20): " + !(60 > 20));      // false
        
        // �������� ^ (��ͬΪfalse����ͬΪtrue)
        boolean b1 = (10 > 1) ^ (3 < 5);   // true ^ true = false
        System.out.println("(10>1) ^ (3<5): " + b1);
        
        boolean b2 = (10 > 1) ^ (3 > 5);   // true ^ false = true  
        System.out.println("(10>1) ^ (3>5): " + b2);
    }
}