import java.util.Scanner;

/**
 * Switch语句标准实现 - 星期查询系统
 * 功能：根据输入的字母代码(a-g)返回对应的英文星期名称
 */
public class WeekdaySwitch {
    public static void main(String[] args) {
        // 创建Scanner对象用于接收用户输入
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入星期代码(a-g): ");
        
        // 读取用户输入的第一个字符
        // next()读取字符串，charAt(0)取第一个字符
        char dayCode = scanner.next().charAt(0);
        
        // Switch语句开始 - 基于dayCode的值进行多分支选择
        switch(dayCode) {
            case 'a':  // 当输入为'a'时执行
                System.out.println("Monday");
                break;  // 跳出switch语句，防止case穿透
                
            case 'b':  // 当输入为'b'时执行
                System.out.println("Tuesday");
                break;
                
            case 'c':  // 当输入为'c'时执行
                System.out.println("Wednesday"); 
                break;
                
            case 'd':  // 当输入为'd'时执行
                System.out.println("Thursday");
                break;
                
            case 'e':  // 当输入为'e'时执行
                System.out.println("Friday");
                break;
                
            case 'f':  // 当输入为'f'时执行
                System.out.println("Saturday");
                break;
                
            case 'g':  // 当输入为'g'时执行
                System.out.println("Sunday");
                break;
                
            default:   // 当输入不匹配任何case时执行
                // 处理非法输入情况
                System.out.println("Invalid input");
                // default分支的break可以省略，但建议保留
        } // switch语句结束
        
        // 关闭Scanner对象，释放系统资源
        scanner.close();
    }
}