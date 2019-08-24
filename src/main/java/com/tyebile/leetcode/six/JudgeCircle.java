package com.tyebile.leetcode.six;

/**
 * @author Tyebile
 * @date 2019/8/24
 */
public class JudgeCircle {

    public static void main(String[] args) {
        String moves = "UDLRLR";
        System.out.println(judgeCircle(moves));
    }

    private static boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)){
                case 'U':
                    x++;
                    break;
                case 'D':
                    x--;
                    break;
                case 'L':
                    y++;
                    break;
                case 'R':
                    y--;
                    break;
            }
        }
        return x==0 && y==0;
    }
}
