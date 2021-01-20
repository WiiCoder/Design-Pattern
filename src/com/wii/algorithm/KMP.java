package com.wii.algorithm;

/**
 * @ClassName KMP
 * @Description 动态规划只KMP字符匹配算法
 * @Author wii
 * @Date 2021/1/20 10:52 上午
 * @Version 1.0
 */

public class KMP {

    private int[][] dp;
    private final String needle;

    public KMP(String needle) {
        this.needle = needle;
        int M = needle.length();
        dp = new int[M][256];
        dp[0][needle.charAt(0)] = 1;
        int X = 0;
        for (int j = 1; j < M; j++) {
            for (int c = 0; c < 256; c++) {
                dp[j][c] = dp[X][c];
            }
            dp[j][needle.charAt(j)] = j + 1;
            X = dp[X][needle.charAt(j)];
        }
    }

    public int strStr(String haystack) {
        int M = needle.length();
        int N = haystack.length();

        // 初始状态
        int j = 0;
        for (int i = 0; i < N; i++) {
            // 当前状态是0，遇到字符txt[i]
            // pat 应该转移到哪个状态
            j = dp[j][haystack.charAt(i)];
            // 如果匹配结束，返回匹配成功的起始下标
            if (j == M) {
                return i - M + 1;
            }
        }
        // 匹配失败
        return -1;
    }
}
