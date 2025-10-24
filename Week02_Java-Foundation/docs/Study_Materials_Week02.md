# 第2章 Java 概述

## 2.1 什么是程序
**程序**：计算机执行某些操作或解决某个问题而编写的一系列有序指令的集合。

**举例说明**：比如一个计算器程序，包含加、减、乘、除等操作指令的集合。

## 2.2 Java 诞生小故事
Java 由 James Gosling 在 Sun Microsystems 公司领导开发，最初名为 Oak，后改名为 Java。1995年正式发布，特点是"一次编写，到处运行"。

## 2.3 Java 技术体系平台
Java 有三个主要技术平台：
- **Java SE**：标准版，用于桌面应用
- **Java EE**：企业版，用于Web应用
- **Java ME**：微型版，用于嵌入式设备

## 2.4 Java 重要特点

### 1) 面向对象 (OOP)
Java 语言是面向对象的编程语言，支持封装、继承、多态等特性。

### 2) 健壮性
Java 的强类型机制、异常处理、垃圾自动收集等特性保证了程序的健壮性。

### 3) 跨平台性
编译好的 `.class` 文件可以在多个系统下运行，这种特性称为跨平台。

### 4) 解释型语言
- **解释型语言**：JavaScript, PHP, Java
- **编译型语言**：C/C++

**区别**：解释型语言编译后的代码不能直接被机器执行，需要解释器来执行；编译型语言编译后的代码可以直接被机器执行。

## 2.5 Java 的开发工具

### 2.5.1 工具选择
**为什么选择文本编辑器（如 Sublime）**：
- 更深刻理解 Java 技术
- 培养代码感
- 有利于面试（手写代码能力）

有一定基础后，再使用 IDEA 和 Eclipse 等专业开发工具。

## 2.6 Java 运行机制及运行过程

### 2.6.1 跨平台性
Java 程序可以在不同操作系统上运行，得益于 Java 虚拟机(JVM)的屏蔽底层差异。

### 2.6.2 Java 虚拟机 (JVM)

#### 基本介绍
1. JVM 是一个虚拟的计算机，具有指令集并使用不同的存储区域
2. 不同平台有不同的虚拟机
3. JVM 屏蔽了底层运行平台的差别，实现"一次编译，到处运行"

## 2.7 JDK 和 JRE

### 2.7.1 JDK 介绍
- **全称**：Java Development Kit（Java 开发工具包）
- **组成**：JDK = JRE + Java 开发工具（java, javac, javadoc, javap 等）
- **用途**：提供给 Java 开发人员使用

### 2.7.2 JRE 介绍
- **全称**：Java Runtime Environment（Java 运行环境）
- **组成**：JRE = JVM + Java 核心类库
- **用途**：运行已开发好的 Java 程序

### 2.7.3 三者关系
1. JDK = JRE + 开发工具集
2. JRE = JVM + Java SE 标准类库
3. 只想运行 `.class` 文件只需要 JRE

## 2.8 下载、安装 JDK
1. 访问 Oracle 官网下载 JDK
2. 运行安装程序，按提示完成安装
3. 建议安装到默认路径，避免路径问题

## 2.9 配置环境变量 PATH

### 2.9.1 为什么要配置 PATH
让系统在任何路径下都能找到 Java 命令，方便在命令行中直接使用 javac 和 java 命令。

### 2.9.2 配置步骤
1. 右键"此电脑" → "属性" → "高级系统设置"
2. 点击"环境变量"
3. 在"系统变量"中找到 Path，点击"编辑"
4. 添加 JDK 的 bin 目录路径（如：C:\Program Files\Java\jdk-版本\bin）

## 2.10 JDK 安装练习

### 2.10.1 练习要求
安装 JDK，配置 PATH 环境变量，在控制台正确执行 Java 命令。

### 2.10.2 环境变量配置细节
- **JAVA_HOME**：指向 JDK 安装目录
- **Path**：添加 %JAVA_HOME%\bin
- 配置完成后重启命令行窗口使配置生效

## 2.11 Java 快速入门

### 2.11.1 需求说明
开发一个 Hello.java 程序，输出 "hello, world!"。

### 2.11.2 开发步骤
1. 编写 `.java` 源文件
2. 使用 `javac` 命令编译，生成 `.class` 文件
3. 使用 `java` 命令运行 class 文件

### 2.11.3 示例代码

public class Hello {
    public static void main(String[] args) {
        System.out.println("hello, world!");
    }
}

### 2.12 Java开发细节说明

### 2.12.1 代码结构说明
// 1. public class Hello 表示 Hello 是一个 public 公有的类
// 2. Hello{} 表示类的开始和结束
// 3. public static void main(String[] args) 表示程序入口
// 4. main(){} 表示方法的开始和结束
// 5. System.out.println() 表示输出到屏幕
// 6. ; 表示语句结束

public class Hello {
    // 编写 main 方法
    public static void main(String[] args) {
        System.out.println("TheDarkFlame-M hello");
    }
}

class Dog {
    public static void main(String[] args) {
        System.out.println("小狗狗");
    }
}

class Tiger {
    public static void main(String[] args) {
        System.out.println("大老虎");
    }
}

### 2.12.2 重要规则：
1. 一个源文件中最多只能有一个 public 类
2. 其他类的个数不限
3. 可以将 main 方法写在非 public 类中
4. 文件名必须与 public 类名一致

### 2.13 Java 开发注意事项
1. 文件名和类名要一致
2. 注意大小写，Java 区分大小写
3. 每条语句以分号结束
4. 括号要成对出现
5. 主方法 main 的写法要正确

### 2.14 如何快速掌握技术
1. 多动手实践，写代码
2. 多看官方文档
3. 学会调试和排查错误
4. 参与项目实践
5. 持续学习和总结

### 2.15 Java 转义字符

### 2.15.1 常用转义字符
• \t：制表位，实现对齐功能
• \n：换行符
• \\：一个反斜杠
• \"：一个双引号
• \'：一个单引号
• \r：回车

### 2.15.2 示例代码
public class ChangeChar {
    public static void main(String[] args) {
        // \t 制表符
        System.out.println("北京 \t 天津 \t 上海");
        
        // \n 换行符
        System.out.println("jack \n smith \n mary");
        
        // \\ 反斜杠
        System.out.println("C:\\Windows\\System32\\cmd.exe");
        
        // \" 双引号
        System.out.println("预示机说:\"要好好学习 java,有前途\"");
        
        // \' 单引号
        System.out.println("空间裂隙说:\'要好好学习 计算机,有前途\'");
        
        // \r 回车
        System.out.println("暗焱法师最强\r邪王真眼"); // 输出：邪王真眼最强
    }
}

### 2.15.3 课堂练习
public class ChangeCharExer01 {
    public static void main(String[] args) {
        // 输出表格
        System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");
        
        // 计算两个数的和
        int n1 = 10;
        int n2 = 30;
        int sum = n1 + n2;
        System.out.println("结果=" + sum);
    }
}

### 2.16 初学 Java 易犯错误
1. 忘记写分号 ;
2. 文件名和类名不一致
3. 大小写拼写错误
4. 括号不匹配
5. 中文符号问题
6. 主方法写错（如写成 main）
7. 路径配置错误

### 2.17 注释 (Comment)

### 2.17.1 注释介绍
用于注解说明解释程序的文字，提高代码可读性，是程序员必备的良好习惯。

### 2.17.2 注释类型
- 单行注释：// 注释内容
- 多行注释：/* 注释内容 */
- 文档注释：/** 文档注释 */

### 2.17.3 使用细节
1. 被注释的文字不会被 JVM 执行
2. 多行注释不允许嵌套多行注释
3. 文档注释可以通过 javadoc 生成 API 文档

### 2.17.4 示例代码
// 演示注释使用

public class Comment01 {
    public static void main(String[] args) {
        // 单行注释
        
        /* 多行注释
           下面代码完成两个数相加
           int n1 = 10;
           System.out.println("ok~~");
        */
        
        int n1 = 10;
        int n2 = 30;
        int sum = n1 + n2;
        System.out.println("结果=" + sum);
    }
}

/**
 * @author TheDarkFlame-M
 * @version 1.0
 * 这是一个文档注释示例
 */
public class Comment02 {
    public static void main(String[] args) {
        // 快捷键：tab 整体右移，shift+tab 整体左移
        int n1 = 1 + 2;
        int n2 = 5 + 10;
        int n3 = 1 + 3 * 34;
    }
}

2.18 Java 代码规范
1. 类名使用大驼峰命名法：HelloWorld
2. 方法名使用小驼峰命名法：getUserName
3. 包名全部小写：com.example.util
4. 常量全部大写：MAX_VALUE
5. 代码缩进使用 4 个空格
6. 行宽不超过 80 个字符
7. 及时添加注释说明

### 2.19 DOS 命令（了解）

### 2.19.1 DOS 介绍
DOS：Disk Operating System 磁盘操作系统，是早期的操作系统。

### 2.19.2 路径概念
• 相对路径：相对于当前目录的路径，如：./src
• 绝对路径：完整的路径描述，如：C:\Users\project\src

### 2.19.3 常用 DOS 命令
1. dir：查看当前目录内容
2. cd：切换目录，如：cd C:\Windows
3. cd ..：切换到上一级目录
4. cd \：切换到根目录
5. tree：查看目录树结构
6. cls：清屏
7. exit：退出 DOS
其他实用命令：
• md 目录名：创建新目录
• rd 目录名：删除目录
• copy 源文件 目标文件：拷贝文件
• del 文件名：删除文件
• type 文件名：查看文件内容

### 2.20 本章作业
1. 成功安装 JDK 并配置环境变量
2. 编写第一个 Hello World 程序并运行成功
3. 练习使用转义字符输出特定格式文本
4. 掌握基本的 DOS 命令操作
5. 理解 Java 的运行机制和跨平台原理