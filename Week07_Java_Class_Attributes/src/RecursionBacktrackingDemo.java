/**
 * 递归与回溯经典算法演示
 * 包含：
 * 1. 汉诺塔（Hanoi Tower）—— 分治递归
 * 2. 迷宫寻路（Maze Pathfinding）—— 递归 + 回溯
 *
 * 核心思想：
 * - 汉诺塔：将复杂问题分解为相同结构的子问题
 * - 迷宫：尝试所有可能路径，失败则“回退”（回溯）
 */
public class RecursionBacktrackingDemo {

    public static void main(String[] args) {
        // === 1. 汉诺塔演示 ===
        System.out.println("【汉诺塔问题】移动 3 个盘子从 A → C，借助 B");
        HanoiSolver hanoi = new HanoiSolver();
        hanoi.solve(3, 'A', 'B', 'C');

        // === 2. 迷宫寻路演示 ===
        System.out.println("\n【迷宫寻路问题】");
        MazeSolver maze = new MazeSolver();
        maze.findPath();
    }
}

// ==================== 汉诺塔求解器 ====================
class HanoiSolver {
    /**
     * 递归解决汉诺塔问题
     * @param n      盘子数量
     * @param from   起始柱
     * @param helper 辅助柱
     * @param to     目标柱
     *
     * 算法思路（分治）：
     * 1. 将上面 n-1 个盘子从 from → helper（借助 to）
     * 2. 将最底下的盘子从 from → to
     * 3. 将 n-1 个盘子从 helper → to（借助 from）
     */
    public void solve(int n, char from, char helper, char to) {
        if (n == 1) {
            System.out.println(from + " → " + to);
        } else {
            solve(n - 1, from, to, helper); // 步骤1
            System.out.println(from + " → " + to); // 步骤2
            solve(n - 1, helper, from, to); // 步骤3
        }
    }
}

// ==================== 迷宫求解器 ====================
class MazeSolver {
    private int[][] map;
    private static final int WALL = 1;      // 墙
    private static final int PATH = 0;      // 可走
    private static final int ROUTE = 2;     // 已找到的路径
    private static final int DEAD_END = 3;  // 死胡同

    public MazeSolver() {
        // 初始化 8x7 迷宫（外圈为墙）
        map = new int[8][7];
        // 上下边界
        for (int j = 0; j < 7; j++) {
            map[0][j] = WALL;
            map[7][j] = WALL;
        }
        // 左右边界
        for (int i = 0; i < 8; i++) {
            map[i][0] = WALL;
            map[i][6] = WALL;
        }
        // 内部障碍
        int[][] obstacles = {{3,1},{1,2},{3,2},{4,4},{5,2},{5,3},{6,2},{2,4},{2,5}};
        for (int[] obs : obstacles) {
            map[obs[0]][obs[1]] = WALL;
        }
    }

    /** 入口方法：从 (1,1) 开始找路到 (6,5) */
    public void findPath() {
        printMaze("初始迷宫");

        boolean found = findPathRecursive(1, 1);
        System.out.println(found ? "\n✅ 找到出口！" : "\n❌ 无路可走");

        printMaze("最终地图（✅=路径, ❌=死路）");
    }

    /**
     * 递归回溯找路
     * 策略：下 → 右 → 上 → 左
     * @return 是否能从 (i,j) 到达终点 (6,5)
     */
    private boolean findPathRecursive(int i, int j) {
        // 终止条件：到达终点
        if (map[6][5] == ROUTE) {
            return true;
        }

        // 当前位置可走？
        if (map[i][j] == PATH) {
            map[i][j] = ROUTE; // 假设此路可通

            // 按策略尝试四个方向
            if (findPathRecursive(i + 1, j)) return true; // 下
            if (findPathRecursive(i, j + 1)) return true; // 右
            if (findPathRecursive(i - 1, j)) return true; // 上
            if (findPathRecursive(i, j - 1)) return true; // 左

            // 四个方向都失败 → 此路不通，回溯！
            map[i][j] = DEAD_END;
            return false;
        }

        // 是墙、死路或已探索路径 → 不可走
        return false;
    }

    /** 美化打印迷宫 */
    private void printMaze(String title) {
        System.out.println("\n" + title);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                switch (map[i][j]) {
                    case WALL:      System.out.print("⬛"); break;
                    case ROUTE:     System.out.print("✅"); break;
                    case DEAD_END:  System.out.print("❌"); break;
                    default:        System.out.print("⬜"); // PATH
                }
            }
            System.out.println();
        }
    }
}