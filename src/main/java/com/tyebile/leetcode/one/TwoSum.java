package com.tyebile.leetcode.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Tyebile
 * @date 2019/8/24
 * 1
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {

    public static void main(String[] args) {
        int target = 6;
        int[] nums = new int[]{3,2,4};

        nums = twoSum(nums, target);
        Arrays.stream(nums)
                .forEach(System.out::println);
    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(4);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }

        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if(map.containsKey(left) && map.get(left) != i){
                return new int[]{i,map.get(left)};
            }
        }
        return new int[]{};
    }
}
