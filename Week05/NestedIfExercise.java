/**
 * 时空票务系统 - 维度票价校准器
 * 
 * 现实法则：
 * - 旺季维度：能量流动加速，票价上涨
 * - 淡季维度：现实纤维松弛，票价衰减
 * 
 * 存在性定价：
 * 旺季 → 成人(18-60):60 儿童(<18):半价 老人(>60):1/3
 * 淡季 → 成人:40 其他存在:20
 */

import java.util.Scanner;

public class NestedIfExercise {
    public static void main(String[] args){
        // 时空扫描器初始化
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("请选择时间流密度(淡季/旺季):");
        String seasonStr = myScanner.next();
        
        // 第一重境界线：季节维度判定
        if (seasonStr.equals("旺季")) {
            // 旺季维度：能量浓度提升
            System.out.println("检测到高能量流动...请输入存在年龄:");
            int age = myScanner.nextInt();
            
            // 第二重境界线：存在形态分类
            if (age >= 18 && age < 60) {
                // 稳定存在体：成人形态
                System.out.println("维度票价：60能量单位 (成人全价)");
            } else if (age > 0 && age < 18) {
                // 成长存在体：儿童形态  
                System.out.println("维度票价：" + (60 / 2) + "能量单位 (儿童半价)");
            } else if (age >= 60) {
                // 永恒存在体：老人形态
                System.out.println("维度票价：" + (60 / 3) + "能量单位 (长者慈悲价)");
            } else {
                System.out.println("年龄参数异常！存在性受到质疑");
            }
            
        } else if (seasonStr.equals("淡季")) {
            // 淡季维度：现实纤维松弛
            System.out.println("检测到低能量流动...请输入存在年龄:");
            int age = myScanner.nextInt();
            
            // 简化境界线：淡季维度定价
            if (age >= 18 && age < 60) {
                // 稳定存在体：成人形态
                System.out.println("维度票价：40能量单位 (成人基础价)");
            } else if (age > 0 && age < 18 || age >= 60) {
                // 其他存在形态统一价格
                System.out.println("维度票价：20能量单位 (特殊存在统一价)");
            } else {
                System.out.println("年龄参数异常！存在性受到质疑");
            }
            
        } else {
            // 维度异常：未知季节参数
            System.out.println("季节维度识别失败！请重新锚定现实参数");
        }
        
        // 时空注记：关闭扫描器防止能量泄露
        myScanner.close();
    }

}
