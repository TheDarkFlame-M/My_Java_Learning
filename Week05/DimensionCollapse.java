/**
 * 境界线裁定：比赛维度跃迁协议
 * 
 * 时空参数：
 * - 初赛成绩 score：决定是否突破现实界限(8.0)
 * - 存在性别 gender：确定归宿维度（黑暗组/光明组）
 * 
 * 跃迁规则：
 * 成绩 >= 8.0 → 进入决赛维度
 *   ├── '暗' → 黑暗组时空
 *   └── '芒' → 光明组时空  
 * 否则 → 在当前维度湮灭
 * 
 * 现世契约：
 * 使用 char gender = scanner.next().charAt(0)
 * 接收存在性别的量子态
 */

/**
 * 维度坍缩模拟器 - 宇宙抉择终端
 * 
 * 警告：此程序模拟高维存在的残酷筛选机制
 * 即使满足表面条件，仍可能因未知法则而湮灭
 * 
 * 现象记录：某些现实纤维中，输入"暗" "芒"仍会触发维度异常
 * 疑似观测者效应或宇宙意志干涉
 */

import java.util.Scanner;

public class NestedIf {
    // 境界线回响：在此实现维度裁定逻辑

	public static void main(String[] args){
		//时空扫描器初始化
		Scanner myScanner = new Scanner(System.in);

		//第一重层屏障: 成绩维度验证
		System.out.println("在此输入选手成绩:");
		double score = myScanner.nextDouble();

		if (score >= 8.0) {
			//突破第一屏障，进入阵营选择
			System.out.println("在此输入选手阵营(暗 / 芒)");

			//时空注记: 字符必须通过字符串维度中转
			//现世法则: Scanner无直接字符获取方式
			char gender = myScanner.next().charAt(0);

			//第二重屏障: 阵营维度分流
			if(gender == '暗') {
				System.out.println("能量流向: 世界黑暗面");				
			}else if(gender == '芒') {
				System.out.println("能量流向: 世界光明层");
			}else {
				System.out.println("维度异常！当前维度即将泯灭！！");
			}			
		}else {
			//所在维度被世界法则抹杀
			System.out.println("未能突破8.0界限 你已被世界放逐！！！");
		}
	}
}