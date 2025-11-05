第5章 程序控制结构
5.1 程序流程控制概述
程序的执行流程由控制结构决定。在结构化程序设计中，所有程序逻辑均可由以下三种基本控制结构组合实现：

1. 顺序结构（Sequential）：语句按书写顺序依次执行。
2. 选择结构（Selection/Branching）：根据条件判断选择执行路径。
3. 循环结构（Iteration/Looping）：重复执行一段代码，直至满足终止条件。
-- 这三类结构构成了现代编程语言流程控制的基础。

5.2 顺序控制
--顺序控制是最基础的执行模型：程序从入口开始，逐条执行语句，无跳转、无重复。  --有高级控制结构最终均建立在顺序执行之上。

5.3 分支控制（if-else）
分支结构允许程序根据布尔表达式的真假动态选择执行路径。Java 提供以下三种形式：

--单分支：if (condition) { ... }
--双分支：if (condition) { ... } else { ... }
--多分支：if-else if-...-else

5.3.1 单分支示例
编辑:
import java.util.Scanner;

public class If01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年龄：");
        int age = input.nextInt();
        if (age > 18) {
            System.out.println("你年龄大于18，需对自己的行为负责。");
        }
        System.out.println("程序继续执行...");
    }
}
- 说明：仅当条件为 true 时执行代码块；否则跳过。

5.3.2 双分支示例
编辑:
if (age > 18) {
    System.out.println("需承担责任");
} else {
    System.out.println("年龄未达标，本次豁免");
}
语义：条件为真执行 if 块，否则执行 else 块，二者必居其一。

5.3.3 综合练习
- 练习1：数值范围判断
- 声明两个 double 变量，若 d1 > 10.0 且 d2 < 20.0，输出其和。

- 练习2：整除性判断
- 判断两整数之和是否能同时被 3 和 5 整除（即被 15 整除）。

- 练习3：闰年判定
- 年份为闰年当且仅当满足以下任一条件：

- 能被 4 整除 且 不能被 100 整除；
- 能被 400 整除。

- 编辑:
boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
最佳实践：将复杂条件封装为布尔表达式，提升可读性。

5.4 嵌套分支结构
嵌套分支指在一个分支体内完整包含另一个分支结构。虽然语法上允许多层嵌套，但建议嵌套深度不超过三层，以维持代码可读性与可维护性。

应用案例：歌手比赛分组
编辑:
if (score > 8.0) {
    char gender = scanner.next().charAt(0);
    if (gender == '男') {
        System.out.println("进入男子组");
    } else if (gender == '女') {
        System.out.println("进入女子组");
    } else {
        System.out.println("性别输入无效");
    }
} else {
    System.out.println("初赛淘汰");
}
注意：字符比较需使用单引号 ' '，且区分全角/半角字符。

5.5 switch 分支结构
5.5.1 语法规范
java
编辑
switch (expression) {
    case constant1:
        statements;
        break;
    case constant2:
        statements;
        break;
    ...
    default:
        statements;
}
支持的表达式类型（Java 7+）：

基本整型：byte, short, int, char
引用类型：String, enum
不支持：long, float, double, boolean 及其包装类（除非自动拆箱后符合）
5.5.2 穿透（Fall-through）机制
若 case 分支未以 break 结尾，程序将继续执行后续 case，直至遇到 break 或 switch 结束。此特性可用于多值共用同一逻辑。

示例：季节判断
java
编辑
switch (month) {
    case 3: case 4: case 5:
        System.out.println("春季");
        break;
    case 6: case 7: case 8:
        System.out.println("夏季");
        break;
    // ...
}

5.5.3 switch 与 if 的选型建议
        场景	                         推荐结构
- 判断离散常量值（如菜单选项、状态码）	  switch
- 区间判断（如成绩分级）	              if-else
- 布尔条件或复杂逻辑表达式	              if-else
- 原则：switch 更高效（JVM 可优化为跳转表），但适用范围有限。

5.6 for 循环
5.6.1 语法与执行流程
编辑:
for (initialization; condition; update) {
    body;
}
执行顺序：

- 执行初始化语句（仅一次）
- 检查循环条件
- 若为 true，执行循环体
- 执行更新语句
- 返回步骤 2
5.6.2 典型应用
案例：统计 1~100 中 9 的倍数
编辑:
int count = 0, sum = 0;
for (int i = 1; i <= 100; i++) {
    if (i % 9 == 0) {
        System.out.println(i);
        count++;
        sum += i;
    }
}
编程思想：

化繁为简：将复杂任务拆解为可验证的子步骤。
先死后活：先用固定值验证逻辑，再参数化为变量。
5.7 while 与 do-while 循环
- 特性	while	do-while
- 判断时机	先判断，后执行	先执行，后判断
- 最少执行次数	0 次	1 次
- 适用场景	条件可能初始即不满足	至少需执行一次（如用户输入验证）

示例：用户确认循环
编辑
char answer;
do {
    System.out.println("邪王真眼使出奥义~");
    System.out.print("还钱吗？(y/n): ");
    answer = scanner.next().charAt(0);
} while (answer != 'y');
关键点：do-while 循环体后必须跟分号 ;。

5.8 嵌套循环
嵌套循环指一个循环体内部包含另一个完整循环。设外层循环执行 m 次，内层执行 n 次，则内层循环体共执行 m × n 次。

应用：多班级成绩统计
java
编辑
for (int classId = 1; classId <= 3; classId++) {
    double classSum = 0;
    for (int studentId = 1; studentId <= 5; studentId++) {
        double score = scanner.nextDouble();
        if (score >= 60) passCount++;
        classSum += score;
    }
    System.out.println("班级" + classId + "平均分: " + classSum / 5);
}
性能提示：避免在内层循环中执行高开销操作（如 I/O、对象创建）。

5.9 跳转控制语句
5.9.1 break
-作用：立即终止最内层的 switch 或循环结构。
-带标签 break：可跳出多层嵌套（不推荐频繁使用）。

5.9.2 continue
-作用：跳过当前迭代剩余代码，直接进入下一次循环条件判断。
-带标签 continue：可指定跳过哪一层循环。

5.9.3 return
-作用：从当前方法返回。若在 main 中调用，则终止整个程序。
-与 break 区别：return 退出方法，break 仅退出循环/switch。

5.10 本章总结
- 核心能力要求
- 能根据问题特征选择合适的控制结构。
- 能正确嵌套分支与循环，避免逻辑错误。
- 理解 break/continue/return 的作用域与语义差异。
- 常见陷阱
- 问题	说明
- switch 忘记 break	导致意外穿透，逻辑错误
- = 误作 ==	赋值而非比较，编译可能通过但逻辑错误
- 浮点数直接比较	应使用 Math.abs(a - b) < ε 判断相等
- 字符串比较用 ==	应使用 .equals() 方法
- 工程建议：复杂条件优先提取为具名布尔变量或方法，提升可读性与可测试性。