package Easy;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 */
public class Ex1480_RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        if (nums.length>0) {
            result[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                result[i] = nums[i] + result[i-1];
            }
        }
        return result;
    }

    public int[] runningSumStream(int[] nums) {
        return IntStream.range(0,nums.length)
                .map(i->i==0?nums[i]:(nums[i]+=nums[i-1]))
                .toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4}))); //[1,3,6,10]
        System.out.println(Arrays.toString(runningSum(new int[] {1,1,1,1,1}))); // [1,2,3,4,5]
        System.out.println(Arrays.toString(runningSum(new int[] {3,1,2,10,1}))); // [3,4,6,16,17]
    }
}
