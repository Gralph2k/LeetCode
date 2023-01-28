package Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 *
 */
public class Ex1672_RichestCustomerWealth {
    public static int maximumWealthArr(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int personalWealth = 0;
            for (int i : account) {
                personalWealth += i;
            }
            if (personalWealth > maxWealth) {
                maxWealth = personalWealth;
            }
        }
        return maxWealth;
    }

    public static int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
                .map(account -> IntStream.of(account).sum())
                .max(Comparator.naturalOrder())
                .get();
    }

    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][] {{1,2,3},{3,2,1}})); //6
        System.out.println(maximumWealth(new int[][]{{1, 5}, {7, 3}, {3, 5}})); //10
        System.out.println(maximumWealth(new int[][]{{2,8,7},{7,1,3},{1,9,5}})); //17

    }
}
