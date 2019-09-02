package com.tyebile.leetcode.four;

import java.util.Arrays;

/**
 * @author Tyebile
 * @date 2019/8/27
 * 455
 * Assume you are an awesome parent and want to give your children some cookies.
 * But, you should give each child at most one cookie. Each child i has a greed factor gi,
 * which is the minimum size of a cookie that the child will be content with;
 * and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i,
 * and the child i will be content. Your goal is to maximize the number of your content children
 * and output the maximum number.
 */
public class AssignCookies {

    public static void main(String[] args) {
        int[] greed = {1,2};
        int[] cookies = {1,2,3};

        System.out.println(findContentChildren(greed, cookies));
    }

    private static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int ans = 0;
        int i = 0;
        int j = 0;
        while (i < g.length && j < s.length){
            if(g[i] <= s[j]){
                ans++;
                i++;
                j++;
            }else {
                j++;
            }
        }
        return ans;
    }
}
