public class BitOperator02 {
    public static void main(String[] args) {
        System.out.println(1 >> 2); // 1 / 2 / 2 = 0
        System.out.println(48 >> 3); // 48 / 2 / 2 / 2 = 6
        System.out.println(4 << 3); // 4 * 2 * 2 * 2 = 32
        System.out.println(35 << 2); // 35 * 2 * 2 = 140

        int a = 1 >> 2; // 1������2λ
        int b = -1 >> 2; // ��������
        int c = 1 << 2; // ��������
        int d = -1 << 2; 
        int e = 3 >>> 2; // �޷�������
        // ע���� <<<; λ�Ʋ������ڲ������
        
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);
        System.out.println("d=" + d);
        System.out.println("e=" + e);
    }
}