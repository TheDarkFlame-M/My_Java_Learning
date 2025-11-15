# 第 6 章：数组、排序与查找

> 基于 Java 教学示例整理｜覆盖数组基础、操作、排序、查找及多维结构  
> 章节编号连续（6.1 → 6.13），缺失内容按标准教学逻辑补全，形成完整知识闭环

---

## 6.1 为什么需要数组？

处理多个同类型数据时，若使用独立变量（如 `w1`, `w2`, ..., `w6`），会导致代码冗长、难以维护。

**数组**提供了一种统一管理机制：一组相同类型的数据，通过下标访问。

	double[] hens = {3, 5, 1, 3.4, 2, 50};
	double total = 0;
	for (int i = 0; i < hens.length; i++) {
	    total += hens[i];
	}
	System.out.println("平均体重: " + total / hens.length);

## 6.2 数组的声明与初始化
- 静态初始化（编译期确定值）
  编辑
	int[] arr = {1, 2, 3};

- 动态初始化（运行期分配空间）
  编辑
	int[] scores = new int[5]; // 默认值：0

- 用户输入示例
  编辑
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < scores.length; i++) {
	    scores[i] = sc.nextDouble();
	}

## 6.3 使用注意事项
• 元素类型必须一致（不可混用基本类型与引用类型）；
• 下标范围：0 到 length - 1，越界将抛出 ArrayIndexOutOfBoundsException；
• 未显式赋值的元素具有默认值：
• 数值类型 → 0 或 0.0
• boolean → false
• 引用类型 → null	

## 6.4 经典应用案例
- 案例 1：生成 A–Z 字符数组
	char[] letters = new char[26];
	for (int i = 0; i < 26; i++) {
	    letters[i] = (char)('A' + i); // 强制转换 int → char
	}

- 案例 2：求数组最大值及其下标
	int[] arr = {4, -1, 9, 10, 23};
	int max = arr[0], index = 0;
	for (int i = 1; i < arr.length; i++) {
	    if (arr[i] > max) {
	        max = arr[i];
	        index = i;
	    }
	}
	System.out.println("最大值: " + max + ", 下标: " + index);

## 6.5 数组赋值机制
• 基本类型：赋值传递的是值（副本）；
• 数组（引用类型）：赋值传递的是内存地址。
	int[] a = {1, 2, 3};
	int[] b = a; // b 与 a 指向同一对象
	b[0] = 999;  // a[0] 同样变为 999	

## 6.6 数组深拷贝
- 创建内容相同但内存独立的副本：
	int[] src = {10, 20, 30};
	int[] dest = new int[src.length];
	for (int i = 0; i < src.length; i++) {
	    dest[i] = src[i]; // 逐元素复制
	}
	// 此后修改 dest 不影响 src

## 6.7 数组反转
- 方法 1：原地交换 (推荐)
	int[] arr = {11, 22, 33, 44, 55, 66};
	int n = arr.length;
	for (int i = 0; i < n / 2; i++) {
	    int temp = arr[i];
	    arr[i] = arr[n - 1 - i];
	    arr[n - 1 - i] = temp;
	}
	// 结果: [66, 55, 44, 33, 22, 11]		

- 方法 2：新建数组逆序赋值	
	int[] newArr = new int[arr.length];
	for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
	    newArr[j] = arr[i];
	}
	arr = newArr; // 更新引用

## 6.8 数组动态扩容（添加元素）
- Java 数组长度固定，扩容需创建新数组：
	int[] arr = {1, 2, 3};
	Scanner sc = new Scanner(System.in);

	do {
	    int[] newArr = new int[arr.length + 1];
	    System.arraycopy(arr, 0, newArr, 0, arr.length); // 或手动循环
	    
	    System.out.print("请输入要添加的元素: ");
	    newArr[newArr.length - 1] = sc.nextInt();
	    arr = newArr;

	    System.out.print("是否继续？(y/n): ");
	} while ("y".equals(sc.next()));

## 6.9 排序概述
• 内部排序：数据全部加载到内存（如冒泡、选择、插入）；
• 外部排序：数据量过大，需借助外存（如归并排序）。
^ 本章重点讲解冒泡排序。

## 6.10 冒泡排序（Bubble Sort）
- 通过相邻元素比较与交换，使较大值逐步“冒泡”至末尾。
	int[] arr = {24, 69, 80, 57, 13};
	for (int i = 0; i < arr.length - 1; i++) {
	    for (int j = 0; j < arr.length - 1 - i; j++) {
	        if (arr[j] > arr[j + 1]) {
	            int t = arr[j];
	            arr[j] = arr[j + 1];
	            arr[j + 1] = t;
	        }
	    }
	}

## 6.11 顺序查找（Sequential Search）
- 适用于无序数组
	String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王"};
	Scanner sc = new Scanner(System.in);
	String target = sc.next();

	int index = -1;
	for (int i = 0; i < names.length; i++) {
	    if (names[i].equals(target)) {
	        index = i;
	        break;
	    }
	}

	if (index != -1) {
	    System.out.println("找到，下标: " + index);
	} else {
	    System.out.println("未找到");
	}

## 6.12 二分查找（Binary Search）
- 前提：数组必须有序	
	int[] arr = {1, 8, 10, 89, 1000, 1234};
	int target = 89;
	int left = 0, right = arr.length - 1;
	boolean found = false;

	while (left <= right) {
	    int mid = (left + right) / 2;
	    if (arr[mid] == target) {
	        System.out.println("找到，下标: " + mid);
	        found = true;
	        break;
	    } else if (arr[mid] > target) {
	        right = mid - 1;
	    } else {
	        left = mid + 1;
	    }
	}

	if (!found) System.out.println("未找到");

## 6.13 二维数组
- 声明与初始化
	// 规则数组
	int[][] matrix = new int[3][4];

	// 不规则（锯齿）数组
	int[][] jagged = new int[3][];
	jagged[0] = new int[2];
	jagged[1] = new int[3];
	jagged[2] = new int[1];

- 应用：棋盘建模
	int[][] board = {
	    {0, 0, 0, 0},
	    {0, 1, 0, 2},
	    {0, 0, 0, 0}
	};

	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
	        System.out.print(board[i][j] + " ");
	    }
	    System.out.println();
	}

# `总结：核心编程思想

^ 学习建议：动手实现每个案例，理解比记忆更重要。遇到问题时，打印中间变量是最有效的调试手段。		