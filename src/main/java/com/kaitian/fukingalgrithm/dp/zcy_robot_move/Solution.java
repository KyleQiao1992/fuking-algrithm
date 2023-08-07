package com.kaitian.fukingalgrithm.dp.zcy_robot_move;

/**
 * 假设有排成一行的 N 个位置，记为 1~N，N一定大于或等于2，
 * 开始时机器人在其中的 M 位置上(M一定是1~N中的一个)。
 * 如果机器人来到 1 位置，那么下一步只能往右来到 2 位置；
 * 如果机器人来到 N 位置，那么下一步只能往左来到N-1位置；
 * 如果机器人来到中间位置，那么下一步可以往左走或者往右走；
 * 规定机器人必须走K步，最终能来到 P 位置(P 也是 1~N 中的一个)的方法有多少种？
 * 给定四个参数N、M、K、P，返回方法数
 */
public class Solution {

    public Integer robotMove(int n, int m, int k, int p) {
        return process(m, k, p, n);
    }

    /**
     * @param cur  机器人当前来到的位置是cur
     * @param rest 机器人还有rest步要走
     * @param aim  最终的目标是aim
     * @param 1    - N 有哪些位置
     * @return 机器人从cur出发，走过rest步之后，最终停在aim的方法数
     */
    private int process(int cur, int rest, int aim, int n) {
        if (rest == 0) {
            return cur == aim ? 1 : 0;
        }
        //rest >0 还有步数要走
        if (cur == 1) {
            return process(2, rest - 1, aim, n);
        }
        if (cur == n) {
            return process(n - 1, rest - 1, aim, n);
        }
        return process(cur + 1, rest - 1, aim, n) +
                process(cur - 1, rest - 1, aim, n);
    }


    private int process2(int cur, int rest, int aim, int n, int[][] dp) {
        if (dp[cur][rest] != -1) {
            return dp[cur][rest];
        }

        int ans = 0;
        if (rest == 0) {
            ans = cur == aim ? 1 : 0;
        } else if (cur == 1) {
            ans = process2(2, rest - 1, aim, n, dp);
        } else if (cur == n) {
            ans = process2(n - 1, rest - 1, aim, n, dp);
        } else {
            ans = process2(cur + 1, rest - 1, aim, n, dp) +
                    process2(cur - 1, rest - 1, aim, n, dp);
        }

        dp[cur][rest] = ans;

        return ans;
    }

}
