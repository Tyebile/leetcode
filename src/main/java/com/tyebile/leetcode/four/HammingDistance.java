package com.tyebile.leetcode.four;

/**
 * @author Tyebile
 * @date 2019/8/24
 * leetcode 461
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 */
public class HammingDistance {

    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
    }

    public static int hammingDistance(int x, int y) {
        int i = x ^ y;
        int count=0;
        while (i != 0) {
            ++ count;
            i = (i-1)& i;
        }
        return count;
    }
}
