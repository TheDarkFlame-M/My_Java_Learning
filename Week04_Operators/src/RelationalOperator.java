/**
 * ��ϵ�������ʾ
 * ����6�ֱȽ�����
 */
public class RelationalOperator {
    public static void main(String[] args) {
        int i1 = 9;
        int i2 = 8;
        
        // 6�ֹ�ϵ�������ʾ
        System.out.println(i1 + " > " + i2 + ": " + (i1 > i2));    // true
        System.out.println(i1 + " >= " + i2 + ": " + (i1 >= i2));  // true
        System.out.println(i1 + " <= " + i2 + ": " + (i1 <= i2));  // false
        System.out.println(i1 + " < " + i2 + ": " + (i1 < i2));    // false
        System.out.println(i1 + " == " + i2 + ": " + (i1 == i2));  // false
        System.out.println(i1 + " != " + i2 + ": " + (i1 != i2));  // true
        
        // ��ϵ��������ֵ��boolean����
        boolean flag = i1 > i2;
        System.out.println("flag = i1 > i2: " + flag);  // true
    }
}
