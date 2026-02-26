# Java Core Mechanics \& OOP Practices

本项目整理了 Java 核心语法与面向对象编程（OOP）的关键实践代码。内容涵盖从基础变量作用域、方法机制，到递归算法、回溯思想及对象生命周期的完整演示。

所有示例均为独立可运行的 `.java` 文件，旨在通过具体代码澄清常见误区（如参数传递机制、构造器重载规则、递归边界条件等），适合作为复习参考或教学辅助材料。

---

## 内容概览

### 1\. 基础机制 (Fundamentals)

* **变量作用域 (`VariableScopeDemo.java`)**

  * 成员变量与局部变量的生命周期对比
  * 就近原则（Shadowing）演示
  * 局部变量重复定义限制

* **类与对象 (`ClassAndObjectDemo.java`)**

  * 对象创建与内存引用机制（共享 vs 独立）
  * 成员变量默认值规则
  * 复合类型属性（如数组）的处理

### 2\. 方法体系 (Methods)

* **基础定义 (`MethodDemo.java`)**

  * 无参/有参、void/返回值方法的规范写法
  * 方法封装与代码复用（工具类设计）

* **高级特性 (`MethodAdvancedDemo.java`)**

  * 同类与跨类方法调用
  * 多结果返回（数组封装）
  * 参数类型兼容性与自动提升

* **重载与可变参数 (`MethodOverloadingAndVarargs.java`)**

  * 重载判定规则（参数列表差异）
  * 可变参数 (`varargs`) 的使用限制与底层原理

* **参数传递机制 (`ParameterPassingDemo.java`)**

  * **核心结论**：Java 仅有值传递
  * 基本类型：副本不可变
  * 引用类型：副本可修改内容，不可重定向引用

### 3\. 面向对象核心 (OOP Core)

* **构造器与 `this` (`ConstructorAndThisDemo.java`)**

  * 构造器重载与默认构造器消失规则
  * `this` 的三种用途：区分属性、调用方法、构造器互调

* **综合复习 (`JavaOOPFundamentalsReview.java`)**

  * 数组工具类设计
  * 简单领域模型建模（Book, Circle, Employee 等）
  * 安全操作（空指针防御、除零处理）

### 4\. 算法与递归 (Algorithms \& Recursion)

* **递归基础 (`RecursionAndExercises.java`)**

  * 阶乘、倒序打印
  * 对象深拷贝实现

* **经典问题 (`RecursionClassicProblems.java`)**

  * 斐波那契数列（递归分解）
  * 猴子吃桃（逆向递推）

* **回溯与分治 (`RecursionBacktrackingDemo.java`)**

  * **汉诺塔**：分治策略演示
  * **迷宫寻路**：递归 + 回溯（标记路径、死胡同回退）

---

## 项目结构

```text
src/
├── VariableScopeDemo.java          # 变量作用域与生命周期
├── ClassAndObjectDemo.java         # 对象引用与内存模型
├── MethodDemo.java                 # 方法基础与封装
├── MethodAdvancedDemo.java         # 方法调用与返回值设计
├── MethodOverloadingAndVarargs.java# 重载与可变参数
├── ParameterPassingDemo.java       # 值传递机制深度解析
├── ConstructorAndThisDemo.java     # 构造器与 this 关键字
├── JavaOOPFundamentalsReview.java  # OOP 综合案例集
├── RecursionAndExercises.java      # 递归基础练习
├── RecursionClassicProblems.java   # 经典递归数学问题
└── RecursionBacktrackingDemo.java  # 汉诺塔与迷宫回溯

